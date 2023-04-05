package miu.edu.waa_lab1.repository;

import miu.edu.waa_lab1.domain.Post;

import java.util.List;

public interface PostRepoInterface {
     List<Post> getPosts();
     Post getPostById(long id);
     void save(Post p);

}
