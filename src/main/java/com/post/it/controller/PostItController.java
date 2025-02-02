package com.post.it.controller;

import com.post.it.entity.PostIt;
import com.post.it.service.PostItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postit")
public class PostItController {

    @Autowired
    private PostItService postItService;

    @PostMapping
    public PostIt createPostIt(@RequestBody PostIt postIt) {
        return postItService.createPostIt(postIt);
    }

    @GetMapping
    public List<PostIt> getAllPostIts() {
        return postItService.getAllPostIts();
    }



}
