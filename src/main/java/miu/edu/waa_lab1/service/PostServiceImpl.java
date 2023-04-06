package miu.edu.waa_lab1.service;

import miu.edu.waa_lab1.domain.Post;
import miu.edu.waa_lab1.domain.PostDto;
import miu.edu.waa_lab1.repository.PostRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl{
    @Autowired
    private PostRepo posts;
    @Autowired
    public PostServiceImpl(PostRepo pr) {
        this.posts = pr;
    }
    @Autowired
    ModelMapper modelMapper;



    public List<Post> getPosts() {
        return posts.findAll();
    }

    public PostDto getPostById(int id) {
        return modelMapper.map(posts.findById(id), PostDto.class);
    }

    public void save(Post p) {
        posts.save(p);
    }


}
