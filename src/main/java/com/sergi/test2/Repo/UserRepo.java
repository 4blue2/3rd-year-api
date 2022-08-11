package com.sergi.test2.Repo;

import com.sergi.test2.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
