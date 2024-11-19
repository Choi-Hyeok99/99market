package com.sparta.hanhhaeproject.repository;

import com.sparta.hanhhaeproject.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Item, Long> {

}
