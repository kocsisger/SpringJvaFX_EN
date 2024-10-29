package hu.unideb.inf.SpringJavaFX;

import hu.unideb.inf.SpringJavaFX.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJavaFxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaFxApplication.class, args);
		Person p = new Person();
		p.setId(3);
		p.setName("Thomas");
		p.setDateOfBirth(LocalDate.of(1999,12,12));
		Person p2 = new Person(1, "Robert", LocalDate.of(1999,1,11));
		Person p3 = Person.builder()
						.id(10)
						.name("Anna")
						.dateOfBirth(LocalDate.of(1997,10,10))
				    .build();

		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
	}

}
