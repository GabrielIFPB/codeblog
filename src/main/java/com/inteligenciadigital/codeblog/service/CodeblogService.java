package com.inteligenciadigital.codeblog.service;

import com.inteligenciadigital.codeblog.models.Post;

import java.util.List;

public interface CodeblogService {

	List<Post> findAll();

	Post findById(Long id);

	Post save(Post post);
}
