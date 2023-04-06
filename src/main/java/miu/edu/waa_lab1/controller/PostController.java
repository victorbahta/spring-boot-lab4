package miu.edu.waa_lab1.controller;

import miu.edu.waa_lab1.domain.Post;
import miu.edu.waa_lab1.domain.PostDto;
import miu.edu.waa_lab1.repository.PostRepo;
import miu.edu.waa_lab1.service.PostService;
import miu.edu.waa_lab1.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private PostServiceImpl postService;
    @Autowired
    public PostController(PostServiceImpl pi) {this.postService = pi;}
    @GetMapping
    public List<Post> getPosts() {
        return postService.getPosts();
    }
    @GetMapping("/{id}")
    public PostDto getPostById(@PathVariable("id") int id) {
        return postService.getPostById(id);
    }
    @PostMapping
    public void save(@RequestBody Post p) {
        postService.save(p);

    }
}
