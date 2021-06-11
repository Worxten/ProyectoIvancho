package com.example.demoproyecto.repositories;

import com.example.demoproyecto.entities.User;
import org.hibernate.Hibernate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
   public User getUserByNombre(String nombre);

}
