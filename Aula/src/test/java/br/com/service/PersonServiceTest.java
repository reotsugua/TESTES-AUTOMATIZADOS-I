package br.com.service;

import br.com.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {
    @Test
    public void checkAgeOver18(){
        Person person = new Person(18);
        PersonService service = new PersonService();
        Boolean result = service.isAdult(person);
        Assertions.assertTrue(result);
    }

}
