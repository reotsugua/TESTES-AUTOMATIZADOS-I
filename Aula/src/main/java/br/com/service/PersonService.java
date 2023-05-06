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

    public String podeVotar(Person person){
        if (person.getAge() < 16) {
            return "Não pode votar";
        } else if ((
                        person.getAge() >= 16 &&
                        person.getAge() < 18) ||
                        person.getAge() > 70
                    ) {
            return "Voto Opcional";
        } else {
            return "Voto Obrigatório";
        }

    }
}
