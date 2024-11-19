package com.sparta.hanhhaeproject.service;

import com.sparta.hanhhaeproject.dto.ItemRequestDto;
import com.sparta.hanhhaeproject.dto.ItemResponseDto;
import com.sparta.hanhhaeproject.entity.Item;
import com.sparta.hanhhaeproject.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public ItemResponseDto createPost(ItemRequestDto requestDto) {
        Item item = new Item(
                requestDto.getUsername(),
                requestDto.getTitle(),
                requestDto.getContent(),
                requestDto.getPrice()
        );
        Item savedItem = postRepository.save(item);
        return new ItemResponseDto(savedItem);
    }

    public List<ItemResponseDto> getPosts() {
        return postRepository.findAll().stream().map(ItemResponseDto::new).collect(Collectors.toList());
    }


    public ItemResponseDto updatePost(Long id, ItemRequestDto requestDto) {
        Item item = postRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("선택한 게시물이 없습니다"));

        item.update(requestDto);
        Item updatePost = postRepository.save(item);
        return new ItemResponseDto(updatePost);
    }


    public ItemResponseDto deletePost(Long id) {

        Item item = postRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("선택한 게시물이 존재하지 않습니다."));

        postRepository.deleteById(id);
        return new ItemResponseDto(item);
    }
}
