package com.restapieg.restapieg.Repo;
import org.springframework.data.repository.CrudRepository;
import com.restapieg.restapieg.Model.User;
public interface UserRepo extends CrudRepository<User, Long> { }
