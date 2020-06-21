package com.rh.spring.hibernateexamplemanytomany.repository;

import com.rh.spring.hibernateexamplemanytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
