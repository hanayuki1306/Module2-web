package student.springboot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.springboot.models.Student;
import student.springboot.repository.StudentRepository;
import student.springboot.services.StudentService;

import java.util.List;

@Service
public class StudentSerViceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.getByID(id);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteByID(id);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
