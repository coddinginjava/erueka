package sai.service.microB.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sai.service.microB.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class StudentMicroBController {

    private final RestTemplate restTemplate;

    @GetMapping("/getall")
    public List<Student> getAll() {

        List<Integer> id = Arrays.asList(681147, 681137, 681157, 681187);

        List<Student> collect = id.parallelStream().map(this::getStudents).collect(Collectors.toList());

        return collect;
    }

    private Student getStudents(Integer id) {
        return restTemplate.getForObject("http://micro-A/microA/id/" + id, Student.class);
    }

    @GetMapping("/hi")
    public String returnmew() {
        return "hi";
    }

    @GetMapping("/hi1")
    public String returnmew1() {
        return "hi1";
    }
}
