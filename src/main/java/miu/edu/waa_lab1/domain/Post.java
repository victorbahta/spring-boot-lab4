package miu.edu.waa_lab1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@Component
public class Post {
    long id;
    String title;
    String content;
    String author;
}
