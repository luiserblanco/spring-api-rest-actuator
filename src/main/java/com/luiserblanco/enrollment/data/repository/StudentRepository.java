package com.luiserblanco.enrollment.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luiserblanco.enrollment.data.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
