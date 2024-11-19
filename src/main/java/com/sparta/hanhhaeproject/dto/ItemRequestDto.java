package com.sparta.hanhhaeproject.dto;

import lombok.Getter;

@Getter
public class ItemRequestDto {
    private String username; // 작성자
    private String title; // 게시글 제목
    private String content; // 게시글 내용
    private int price; // 가격

}