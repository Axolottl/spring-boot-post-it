package com.it.post;

import com.it.post.entity.PostIt;
import com.it.post.service.PostItService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Integration tests for the PostIt application
 */
@SpringBootTest
class PostItApplicationTests {

    @Autowired
    private PostItService postItService;

    /**
     * Verifies that the Spring application context loads correctly
     */
    @Test
    void contextLoads() {
        assertThat(postItService).isNotNull();
    }

    /**
     * Tests the creation of a PostIt
     */
    @Test
    void testCreatePostIt() {
        PostIt postIt = new PostIt("","");
        postIt.setTitle("Test Note");
        postIt.setContent("This is a postit");

        PostIt savedPostIt = postItService.createPostIt(postIt);

        assertThat(savedPostIt).isNotNull();
        assertThat(savedPostIt.getId()).isNotNull();
        assertThat(savedPostIt.getTitle()).isEqualTo("Test Note");
        assertThat(savedPostIt.getContent()).isEqualTo("This is a postit");
    }
}

