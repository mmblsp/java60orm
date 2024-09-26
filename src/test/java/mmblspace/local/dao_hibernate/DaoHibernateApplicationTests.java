package mmblspace.local.dao_hibernate;

import mmblspace.local.dao_hibernate.entity.Person;
import mmblspace.local.dao_hibernate.entity.PersonId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class JdataHibernate1ApplicationTests {
	@PersistenceContext
	EntityManager testEntityManager;
	private final Set<Person> testSet = new HashSet<>();

	@Test
	@Transactional
	void contextLoads() {
		Person slava = Person.builder()
				.personId(PersonId.builder().name("Anatoly").surname("zhuchkov").age(42).build())
				.city("KRD")
				.phoneNumber("+79002543135")
				.build();
		testSet.add(slava);
		testEntityManager.persist(slava);
		Assert.isTrue(testSet.contains(slava), "Entity not found in the set");
	}

}
