package miu.edu.waa_lab1.service;

import miu.edu.waa_lab1.domain.Comment;
import miu.edu.waa_lab1.repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    CommentsRepo commentsRepo;
    @Autowired
    public CommentService(CommentsRepo commentsRepo) {
        this.commentsRepo=commentsRepo;
    }
    public void saveComment(Comment c) {
        this.commentsRepo.save(c);
    }
    public List<Comment> getComments() {
        return commentsRepo.findAll();
    }

}
