package sai.service.microA.dataLoad;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import sai.service.microA.model.Student;
import sai.service.microA.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class InitDataLoad {

    private final StudentRepository studentRepository;


    @EventListener(ApplicationReadyEvent.class)
    public void loadData() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(681147, "sai", "7402100511"));
        students.add(new Student(681137, "sri", "113251"));
        students.add(new Student(681157, "malar", "5454654"));
        students.add(new Student(681187, "kewal", "156516"));

        studentRepository.saveAll(students);
    }

}
