package kauaNog.Studentsystem.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kauaNog.Studentsystem.model.Student;
import kauaNog.Studentsystem.model.repository.StudentRepository;
import kauaNog.Studentsystem.service.StundentService;

@Service
public class StudentServiceImpl implements StundentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        //Save the student in dataBase
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        //return all students in DataBase
        return studentRepository.findAll();
    }
    
}
