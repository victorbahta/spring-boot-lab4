package miu.edu.waa_lab1.repository;

import miu.edu.waa_lab1.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PostsRepo implements PostRepoInterface {
    private static List<Post> posts;



    static {
        posts = new ArrayList<>();
        posts.add(new Post(1111, "The Avatar", "Greate Movie","James Cameroon"));
        posts.add(new Post(2222, "Rush Hour", "Favorite Movie","Jackie Chan"));
    }

    @Override
    public List<Post> getPosts() {
        return posts;
    }

    @Override
    public Post getPostById(long id) {
        return getPosts().stream().filter(p -> p.getId() == id).findFirst().orElse(null);

    }

    @Override
    public void save(Post p) {
        posts.add(p);
    }
}
