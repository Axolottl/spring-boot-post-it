package com.post.it.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;


/**
 * PostIt Entity class used to define the variables and
 * database table of Post-it
 */
@Entity
@Table(name = "notes")
@Data
public class PostIt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length = 2000)
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Creation and update of Post-It Date Time before persistence
     * (saving in the database)
     */
    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    /**
     * Update of Post-It Date Time before Update
     */
    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
