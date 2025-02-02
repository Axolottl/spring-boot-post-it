package com.post.it.service;

import com.post.it.entity.PostIt;
import com.post.it.repository.PostItRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostItService {

    @Autowired
    private PostItRepository postItRepository;

    public PostIt createPostIt(PostIt postIt) {
        return postItRepository.save(postIt);
    }

    public List<PostIt> getAllPostIts() {
        return postItRepository.findAll();
    }
}
