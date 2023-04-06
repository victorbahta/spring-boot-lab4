package miu.edu.waa_lab1.controller;

import miu.edu.waa_lab1.domain.Post;
import miu.edu.waa_lab1.domain.Users;
import miu.edu.waa_lab1.repository.PostRepo;
import miu.edu.waa_lab1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;
    PostRepo postRepo;
    @Autowired
    public UserController(UserService userService, PostRepo pr) {
        this.userService = userService;
        this.postRepo = pr;
    }
    @GetMapping
    public List<Users> findAll() {
        return this.userService.findAll();
    }

    @GetMapping("/{id}")
    public Users findUserById(@PathVariable("id") int id) {
        return this.userService.findById(id);
    }

    @GetMapping("/{id}/posts")
    public List<Post> findPostsByUser(@PathVariable("id") long id) {

        return postRepo.findByUserId(Long.valueOf( id));
    }

    @PostMapping("/{id}/posts")
    public void savePostByUser(@PathVariable("id") int id, @RequestBody Post p) {
        p.setUser(userService.findById(id));
         postRepo.save(p);
    }
    @PostMapping
    public void save(@RequestBody Users u) {
        System.out.println("ui" + u.getId());
        System.out.println("uin" + u.getName());
        userService.save(u);
    }

}
