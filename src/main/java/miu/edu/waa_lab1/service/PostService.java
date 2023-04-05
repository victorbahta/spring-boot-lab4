package miu.edu.waa_lab1.service;

import miu.edu.waa_lab1.domain.Post;
import miu.edu.waa_lab1.domain.PostDto;

import java.util.List;

public interface PostService {
    List<Post> getPosts();
    PostDto getPostById(long id);
}
