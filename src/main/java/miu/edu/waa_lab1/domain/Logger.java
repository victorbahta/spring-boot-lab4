package miu.edu.waa_lab1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transaction_id;
    private LocalDateTime date;
    private String time;
    private String princple;
    private String operation;

}
