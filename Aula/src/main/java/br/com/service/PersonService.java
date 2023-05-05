package br.com.service;

import br.com.domain.Person;

public class PersonService {

    public Boolean isAdult(Person person) {
        if (person.getAge() >= 18) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }

    }
}
