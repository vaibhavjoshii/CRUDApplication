package com.example.CRUD.service;

import com.example.CRUD.model.Comment;
import com.example.CRUD.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments() {
       return commentRepository.findAll();
    }

    public Comment getCommentById(String id) {
        return commentRepository.findById(id).get();
    }

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String id) {
        commentRepository.deleteById(id);
    }
}
