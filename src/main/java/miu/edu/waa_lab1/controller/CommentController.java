package miu.edu.waa_lab1.controller;

import miu.edu.waa_lab1.domain.Comment;
import miu.edu.waa_lab1.repository.CommentsRepo;
import miu.edu.waa_lab1.repository.PostRepo;
import miu.edu.waa_lab1.service.CommentService;
import miu.edu.waa_lab1.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    CommentService commentService;
    PostRepo postRepo;
    @Autowired
    public CommentController(CommentService cs, PostRepo pr) {
        this.postRepo = pr;
        this.commentService = cs;
    }
    @GetMapping
    public List<Comment> getComments() {
        return commentService.getComments();
    }
    @PostMapping("/posts/{id}")
    public void save(@PathVariable("id") Integer id, @RequestBody Comment comment) {
         comment.setPost(postRepo.findById(id).orElse(null));
        commentService.saveComment(comment);
    }
}
