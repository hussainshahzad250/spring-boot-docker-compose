package com.hussain.controller;

import com.hussain.model.Post;
import com.hussain.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository repository;

    @GetMapping
    public List<Post> findAll() {
        return repository.findAll();
    }

}
