package com.inteligenciadigital.codeblog.repository;

import com.inteligenciadigital.codeblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {
}
