package miu.edu.waa_lab1.repository;

import miu.edu.waa_lab1.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post,Integer> {
     List<Post> findAll();
     List<Post> findByUserId(int user_id);

     Post findById(int id);

      Post save(Post p);

}
