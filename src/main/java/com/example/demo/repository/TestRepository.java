package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entitiy.Test;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {

}
