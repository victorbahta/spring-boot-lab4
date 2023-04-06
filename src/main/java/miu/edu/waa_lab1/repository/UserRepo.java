package miu.edu.waa_lab1.repository;

import miu.edu.waa_lab1.domain.Post;
import miu.edu.waa_lab1.domain.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<Users, Integer> {
    List<Users> findAll();


    @Override
    Optional<Users> findById(Integer integer);

    Users save(Users u);
}
