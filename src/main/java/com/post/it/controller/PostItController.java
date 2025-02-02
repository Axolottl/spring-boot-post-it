package com.post.it.controller;

import com.post.it.entity.PostIt;
import com.post.it.service.PostItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for managing PostIts
 * Provides endpoints to create and retrieve PostIts
 */
@RestController
@RequestMapping("/api/postit")
public class PostItController {

    /**
     * Service layer for PostIt operations
     */
    @Autowired(required = false)
    private PostItService postItService;

     /**
     * Creates a new PostIt
     *
     * @param postIt The PostIt to create
     * @return The created PostIt with HTTP 201 status
     */
    @PostMapping
    public ResponseEntity<PostIt> createPostIt(@RequestBody PostIt postIt) {
        PostIt createdPostIt = postItService.createPostIt(postIt);
        return ResponseEntity.status(201).body(createdPostIt);
    }

    /**
     * Retrieves all PostIt
     *
     * @return A list of all PostIt with HTTP 200 status
     */
    @GetMapping
    public ResponseEntity<List<PostIt>> getAllPostIts() {
        List<PostIt> postIts = postItService.getAllPostIts();
        return ResponseEntity.ok(postIts);
    }

    /**
     * Retrieves a specific PostIt by its ID
     *
     * @param id The ID of the PostIt
     * @return The found PostIt with HTTP 200 status
     */
    @GetMapping("/{id}")
    public ResponseEntity<PostIt> getPostItById(@PathVariable Long id) {
        PostIt postIt = postItService.getPostItById(id);
        return ResponseEntity.ok(postIt);
    }

    /**
     * Deletes a PostIt by its ID
     *
     * @param id The ID of the PostIt to delete
     * @return HTTP 204 No Content if successful
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePostIt(@PathVariable Long id) {
        postItService.deletePostIt(id);
        return ResponseEntity.noContent().build();
    }
}

