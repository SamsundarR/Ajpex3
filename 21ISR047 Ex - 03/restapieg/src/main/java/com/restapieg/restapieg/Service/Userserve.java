package com.restapieg.restapieg.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restapieg.restapieg.Model.User;
import com.restapieg.restapieg.Repo.UserRepo;
import java.util.List;
import java.util.Optional;
@Service
public class Userserve implements UserService{
      @Autowired
  UserRepo userRepo;
  @Override
  public void deleteUser(long id) {
    userRepo.deleteById(id);
  }
  @Override
  public void addUser(User user) {
    userRepo.save(user);
  }
  @Override
  public void updateUser(long id, User user) {
    userRepo.save(user);
  }
  @Override
  public Optional<User> getUserById(long id) {
    return userRepo.findById(id);
  }
  @Override
  public List<User> getAll() {
    return (List<User>) userRepo.findAll();
  }
}
