package com.jamu.app.rest.Repository;

import javax.persistence.Entity;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;


@Entity
public interface DiciplinaRepository extends JpaRepository <User, Long> {
   
}
