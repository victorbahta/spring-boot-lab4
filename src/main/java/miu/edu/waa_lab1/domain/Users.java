package miu.edu.waa_lab1.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @OneToMany
    @JoinColumn(name = "user_id")
    List<Post> posts;
}
