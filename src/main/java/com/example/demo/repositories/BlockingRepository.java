package com.example.demo.repositories;

import com.example.demo.domains.Blocking;
import com.example.demo.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockingRepository extends JpaRepository<Blocking,String> {
}
