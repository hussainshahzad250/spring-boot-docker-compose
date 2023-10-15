package com.hussain.repository;

import com.hussain.model.Post;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends ListCrudRepository<Post,Integer> {
}
