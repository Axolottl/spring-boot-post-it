package com.post.it.repository;

import com.post.it.entity.PostIt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostItRepository extends JpaRepository<PostIt, Long> {
}
