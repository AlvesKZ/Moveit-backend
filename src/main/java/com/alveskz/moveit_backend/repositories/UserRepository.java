package com.alveskz.moveit_backend.repositories;


import com.alveskz.moveit_backend.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
