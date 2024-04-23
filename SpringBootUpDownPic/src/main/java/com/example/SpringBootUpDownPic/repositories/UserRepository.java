package com.example.SpringBootUpDownPic.repositories;

import com.example.SpringBootUpDownPic.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
