package miu.edu.waa_lab1.repository;

import miu.edu.waa_lab1.domain.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CommentsRepo extends CrudRepository<Comment,Long> {
    List<Comment> findAll();
    Optional<Comment> findById(Long Id);
    Comment save(Comment c);
}
