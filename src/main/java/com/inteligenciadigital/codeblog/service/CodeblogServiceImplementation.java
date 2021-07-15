package com.inteligenciadigital.codeblog.service;

import com.inteligenciadigital.codeblog.models.Post;
import com.inteligenciadigital.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImplementation implements CodeblogService {

	@Autowired
	CodeblogRepository codeblogRepository;

	@Override
	public List<Post> findAll() {
		return this.codeblogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return this.codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return this.codeblogRepository.save(post);
	}
}
