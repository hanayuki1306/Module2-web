package student.springboot.repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
    T getByID(int id);
    void deleteByID(int id);
    void save(T t);
}
