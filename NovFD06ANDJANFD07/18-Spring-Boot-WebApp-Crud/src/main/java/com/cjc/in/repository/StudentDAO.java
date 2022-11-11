package com.cjc.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.in.model.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{



}
