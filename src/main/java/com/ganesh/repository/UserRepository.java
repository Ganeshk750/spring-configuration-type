package com.ganesh.repository;


import com.ganesh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @created: 09/04/2021 - 2:54 PM
 * @author: Ganesh
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
