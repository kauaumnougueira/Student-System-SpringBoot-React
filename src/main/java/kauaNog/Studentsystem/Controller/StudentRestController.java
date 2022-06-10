package kauaNog.Studentsystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kauaNog.Studentsystem.service.StundentService;
import kauaNog.Studentsystem.model.Student;



@RestController
@RequestMapping("/student")
public class StudentRestController {
    
    @Autowired
    private StundentService studentService;

    @RequestMapping("/add")
    public String addStatus(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
