package miu.edu.waa_lab1.controller;

import miu.edu.waa_lab1.domain.Post;
import miu.edu.waa_lab1.repository.PostRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private  PostRepoInterface postService;
    @Autowired
    public PostController(PostRepoInterface pi) {this.postService = pi;}
    @GetMapping
    public List<Post> getPosts() {
        return postService.getPosts();
    }
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") long id) {
        return postService.getPostById(id);
    }
    @PostMapping
    public void save(@RequestBody Post p) {
        postService.save(p);

    }
}
