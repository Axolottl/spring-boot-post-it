package com.post.it.service;

import com.post.it.entity.PostIt;
import com.post.it.repository.PostItRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing PostIts
 * Provides methods to create and retrieve PostIts
 */
@Service
public class PostItService {

    @Autowired
    private PostItRepository postItRepository;

    /**
     * Creates a new PostIt
     *
     * @param postIt The PostIt note to create
     * @return The created PostIt note
     * @throws RuntimeException if saving fails
     */
    public PostIt createPostIt(PostIt postIt) {
        try {
            return postItRepository.save(postIt);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create PostIt", e);
        }
    }

    /**
     * Retrieves all PostIt
     *
     * @return A list of all PostIt
     */
    public List<PostIt> getAllPostIts() {
        try {
            return postItRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch PostIt", e);
        }
    }

    /**
     * Retrieves a PostIt by its ID
     *
     * @param id The ID of the PostIt note
     * @return The found PostIt
     * @throws RuntimeException if not found
     */
    public PostIt getPostItById(Long id) {
        return postItRepository.findById(id)
        	.orElseThrow(() -> new RuntimeException("PostIt not found with ID: " + id));
    }

    /**
     * Deletes a PostIt by its ID
     *
     * @param id The ID of the PostIt to delete
     * @throws RuntimeException if deletion fails
     */
    public void deletePostIt(Long id) {
        try {
            if (!postItRepository.existsById(id)) {
                throw new RuntimeException("PostIt not found with ID: " + id);
            }
            postItRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Failed to delete PostIt", e);
        }
    }
}

