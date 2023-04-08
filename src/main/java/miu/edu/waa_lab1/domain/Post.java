package miu.edu.waa_lab1.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;
    String content;
    String author;
    @ManyToOne
    @JoinColumn(name = "user_id")
    Users user;
    @OneToMany

    @JoinColumn(name = "post_id")
    List<Comment> comments;
}
