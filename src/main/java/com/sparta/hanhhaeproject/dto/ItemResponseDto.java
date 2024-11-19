package com.sparta.hanhhaeproject.dto;

import com.sparta.hanhhaeproject.entity.Item;
import lombok.Getter;

@Getter
public class ItemResponseDto {

    private Long id;
    private String username;
    private String title;
    private String content;
    private int price;

    // Entity -> DTO 변환
    public ItemResponseDto(Item item) {
        this.id = item.getId();
        this.username = item.getUsername();
        this.title = item.getTitle();
        this.content = item.getContent();
        this.price = item.getPrice();

    }

}
