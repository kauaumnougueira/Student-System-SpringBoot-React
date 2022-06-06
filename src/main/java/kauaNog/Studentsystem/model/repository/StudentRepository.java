package kauaNog.Studentsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kauaNog.Studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
