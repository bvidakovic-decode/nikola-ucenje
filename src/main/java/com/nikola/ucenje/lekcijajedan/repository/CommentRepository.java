package com.nikola.ucenje.lekcijajedan.repository;

import com.nikola.ucenje.lekcijajedan.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
//    Optional<Comment> findById(Long id);
//
//    List<Comment> findAllByContent(String content);

}
