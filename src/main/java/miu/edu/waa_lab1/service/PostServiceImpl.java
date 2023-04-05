package miu.edu.waa_lab1.service;

import miu.edu.waa_lab1.domain.Post;
import miu.edu.waa_lab1.domain.PostDto;
import miu.edu.waa_lab1.repository.PostsRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService{
    private PostsRepo posts;
    @Autowired
    public PostServiceImpl(PostsRepo pr) {
        this.posts = pr;
    }
    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<Post> getPosts() {
        return posts.getPosts();
    }

    @Override
    public PostDto getPostById(long id) {
        return modelMapper.map(posts.getPostById(id), PostDto.class);
    }


}
