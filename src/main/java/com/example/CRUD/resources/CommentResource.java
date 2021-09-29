package com.example.CRUD.resources;

import com.example.CRUD.model.Comment;
import com.example.CRUD.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/find")
    public Comment getCommentById(@RequestParam("id") String id){
        return commentService.getCommentById(id);
    }

    @PostMapping
    public Comment saveComment(@RequestBody @Valid Comment comment) {
        return commentService.saveComment(comment);
    }

    @PutMapping
    public Comment updateComment( @RequestBody @Valid Comment comment) {
        return commentService.updateComment(comment );
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "id") String id){
        commentService.deleteComment(id);
    }
}
