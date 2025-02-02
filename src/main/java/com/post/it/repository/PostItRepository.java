package com.post.it.repository;

import com.post.it.entity.PostIt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for PostIts
 * Extends JpaRepository to provide CRUD operations
 */
public interface PostItRepository extends JpaRepository<PostIt, Long> {
}
