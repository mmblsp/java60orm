package mmblspace.local.dao_hibernate.controller;

import mmblspace.local.dao_hibernate.entity.Person;
import mmblspace.local.dao_hibernate.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        List<Person> result = personRepository.getPersonsByCity(city);
        System.out.println(result);
        return result;
    }

}
