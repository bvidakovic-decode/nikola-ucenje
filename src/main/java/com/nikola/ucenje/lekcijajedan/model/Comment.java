package com.nikola.ucenje.lekcijajedan.model;

import com.nikola.ucenje.lekcijajedan.model.dto.CommentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "COMMENT")
public class Comment {

//    @Column(name = "COMMENT_ID")
    @GeneratedValue
    @Id
    private Long id;
    private String content;
    private String username;

    static public Comment of(CommentDTO commentDTO) {
        return new Comment(commentDTO.getContent(), commentDTO.getUsername());
    }

    public Comment(String content,
                   String username) {
        this.content = content;
        this.username = username;
    }

}
