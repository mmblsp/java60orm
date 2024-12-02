package mmblspace.local.dao_hibernate.controller;

import mmblspace.local.dao_hibernate.entity.Person;
import mmblspace.local.dao_hibernate.repository.PersonRepository;
import lombok.AllArgsConstructor;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        List<Person> result = personRepository.findByCity(city);
        return result;
    }

    @GetMapping("/persons/by-age")
    @ResponseBody
    public List<Person> findPersonByPersonId_AgeBeforeOrderByPersonIdAsc(@RequestParam("age") int age) {
        List<Person> result = personRepository.findPersonByPersonId_AgeBeforeOrderByPersonIdAsc(age);
        return result;
    }

    @GetMapping("/persons/by-name&surname")
    @ResponseBody
    public Optional<Person> findPersonByPersonId_NameContainingIgnoreCaseAndAndPersonId_SurnameContainingIgnoreCase(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname) {
        Optional<Person> result = personRepository
                .findPersonByPersonId_NameContainingIgnoreCaseAndAndPersonId_SurnameContainingIgnoreCase(name, surname);
        return result;
    }
}
