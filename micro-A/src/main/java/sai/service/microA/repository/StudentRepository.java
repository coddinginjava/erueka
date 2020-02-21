package sai.service.microA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sai.service.microA.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByStudentId(Integer id);
}
