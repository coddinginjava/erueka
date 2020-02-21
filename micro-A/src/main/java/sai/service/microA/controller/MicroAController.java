package sai.service.microA.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sai.service.microA.model.Student;
import sai.service.microA.repository.StudentRepository;

@RestController
@AllArgsConstructor
public class MicroAController {
    private final StudentRepository repository;

    @GetMapping("/id/{id}")
    public Student getStudentByID(@PathVariable Integer id){
        return repository.findByStudentId(id);
    }

}
