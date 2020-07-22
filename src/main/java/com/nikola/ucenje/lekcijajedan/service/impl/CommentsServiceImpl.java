package com.nikola.ucenje.lekcijajedan.service.impl;

import com.nikola.ucenje.lekcijajedan.model.Comment;
import com.nikola.ucenje.lekcijajedan.model.dto.CommentDTO;
import com.nikola.ucenje.lekcijajedan.repository.CommentRepository;
import com.nikola.ucenje.lekcijajedan.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentsServiceImpl implements CommentsService {

    private final CommentRepository commentRepository;

    @Override
    public Comment saveComment(CommentDTO commentDTO) {
        if (commentDTO.getContent() != null && commentDTO.getContent().equalsIgnoreCase("a")) {
            throw new IllegalStateException("As are forbidden!");
        }

        Comment comment = Comment.of(commentDTO);

        Comment savedComment = commentRepository.save(comment);

        return savedComment;
    }
}
