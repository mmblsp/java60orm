package mmblspace.local.dao_hibernate.repository;

import mmblspace.local.dao_hibernate.entity.Person;
import mmblspace.local.dao_hibernate.entity.PersonId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId> {

    List<Person> findByCity(String city);

    List<Person> findPersonByPersonId_AgeBeforeOrderByPersonIdAsc(int age);

    Optional<Person> findPersonByPersonId_NameContainingIgnoreCaseAndAndPersonId_SurnameContainingIgnoreCase(
            String name, String surname);

}
