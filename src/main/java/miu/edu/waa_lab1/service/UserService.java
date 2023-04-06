package miu.edu.waa_lab1.service;

import miu.edu.waa_lab1.domain.Users;
import miu.edu.waa_lab1.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepo userRepo;
    @Autowired
    public UserService(UserRepo repo) {this.userRepo = repo;}

    public void save(Users u) {
        userRepo.save(u);
    }
    public List<Users> findAll() {
        return userRepo.findAll();
    }

    public Users findById(int id) {
        return userRepo.findById(Integer.valueOf(id)).orElse(null);
    }
}
