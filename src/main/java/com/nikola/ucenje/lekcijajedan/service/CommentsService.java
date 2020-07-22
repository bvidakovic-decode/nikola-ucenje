package com.nikola.ucenje.lekcijajedan.service;

import com.nikola.ucenje.lekcijajedan.model.Comment;
import com.nikola.ucenje.lekcijajedan.model.dto.CommentDTO;

public interface CommentsService {

    Comment saveComment(CommentDTO commentDTO);

}
