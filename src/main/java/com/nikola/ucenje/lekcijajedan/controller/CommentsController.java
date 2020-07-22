package com.nikola.ucenje.lekcijajedan.controller;

import com.nikola.ucenje.lekcijajedan.model.Comment;
import com.nikola.ucenje.lekcijajedan.model.dto.CommentDTO;
import com.nikola.ucenje.lekcijajedan.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comment")
@RequiredArgsConstructor
public class CommentsController {

    private final CommentsService commentsService;

    @PostMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Comment saveComent(@RequestBody CommentDTO commentDTO) {
        return commentsService.saveComment(commentDTO);
    }
}
