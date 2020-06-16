package student.springboot.repository.impl;

import org.springframework.stereotype.Repository;
import student.springboot.models.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository implements student.springboot.repository.StudentRepository {
    private static Map<Integer,Student> listStudent;
    static {
        listStudent = new HashMap<>();
        listStudent.put(1,new Student(1,"son","son@gmail.com"));
        listStudent.put(2,new Student(2,"man","trang@gmail.com"));
        listStudent.put(3,new Student(3,"tri","tri@gmail.com"));
        listStudent.put(4,new Student(4,"mon","mon@gmail.com"));
        listStudent.put(5,new Student(5,"nam","nam@gmail.com"));
    }



    @Override
    public List<Student> getAll() {
        return new ArrayList<>(listStudent.values());
    }

    @Override
    public Student getByID(int id) {
        return listStudent.get(id);
    }


    @Override
    public void deleteByID(int id) {
        listStudent.remove(id);
    }

    @Override
    public void save(Student student) {
        listStudent.put(student.getId(),student);
    }
}
