package com.sparta.hanhhaeproject.controller;

import com.sparta.hanhhaeproject.dto.ItemRequestDto;
import com.sparta.hanhhaeproject.dto.ItemResponseDto;
import com.sparta.hanhhaeproject.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {


    private final PostService postService;

    @PostMapping("/post")
    public ItemResponseDto createPost(@RequestBody ItemRequestDto requestDto){
        return postService.createPost(requestDto);
    }

    @GetMapping("/post")
    public List<ItemResponseDto> getPosts(){
        return postService.getPosts();
    }

    @PutMapping("/post/{id}")
    public ItemResponseDto updatePost(@PathVariable("id") Long id, @RequestBody ItemRequestDto requestDto){
        return postService.updatePost(id,requestDto);
    }

    @DeleteMapping("/post/{id}")
    public ItemResponseDto deletePost(@PathVariable("id") Long id){
        return postService.deletePost(id);
    }

}
