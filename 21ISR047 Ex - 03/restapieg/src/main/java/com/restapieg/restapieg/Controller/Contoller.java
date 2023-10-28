package com.restapieg.restapieg.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapieg.restapieg.Model.User;
import com.restapieg.restapieg.Repo.UserRepo;
import com.restapieg.restapieg.Service.Userserve;
@RestController
public class Contoller {    
@Autowired
  UserRepo userRepo;
  @Autowired
  Userserve userServ;
  @GetMapping("/all")
  public List<User> getByCategory() {
    return (ArrayList<User>) userRepo.findAll();
  }
  @PostMapping("/insert")
  public String insertUser(@RequestBody User user) {
    //userServ.addUser(user);
    userRepo.save(user);
    return "Success";
  }
  @GetMapping("display/user{id}")
  public Optional<User> getById(@PathVariable long id) {
    Optional<User> user = userServ.getUserById(id);
    return user;
  }
  @PutMapping("/update/user{id}")
  public String updateUser(@PathVariable long id, @RequestBody User user) {
    user.setId(id);
    userServ.updateUser(id, user);
    return "Updated";
  }
  @DeleteMapping("/delete/user{id}")
  public String deleteUser(@PathVariable long id) {
    userServ.deleteUser(id);
    return "deleted";
  }}
