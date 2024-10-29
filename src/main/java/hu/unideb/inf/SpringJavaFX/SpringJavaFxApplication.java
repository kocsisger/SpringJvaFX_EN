package hu.unideb.inf.SpringJavaFX;

import hu.unideb.inf.SpringJavaFX.model.Person;
import hu.unideb.inf.SpringJavaFX.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setName("Thomas");
		p.setDateOfBirth(LocalDate.of(1999,12,12));
		Person p2 = new Person(1, "Robert", LocalDate.of(1999,1,11));
		Person p3 = Person.builder()
				.name("Anna")
				.dateOfBirth(LocalDate.of(1997,10,10))
				.build();

		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);

		personRepository.save(p3);

		System.out.println("db -> " + personRepository.findByName("Anna"));
	}
}
