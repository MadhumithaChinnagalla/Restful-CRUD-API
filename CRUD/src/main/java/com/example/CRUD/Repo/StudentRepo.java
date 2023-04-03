package com.example.CRUD.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUD.entity.Student;



public interface StudentRepo extends JpaRepository<Student, Long> {

}
