package kauaNog.Studentsystem.service;

import java.util.List;
import kauaNog.Studentsystem.model.Student;

public interface StundentService  {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
