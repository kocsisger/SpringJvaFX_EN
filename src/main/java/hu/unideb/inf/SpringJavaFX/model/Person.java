package hu.unideb.inf.SpringJavaFX.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private long id;
    private String name;
    private LocalDate dateOfBirth;
}
