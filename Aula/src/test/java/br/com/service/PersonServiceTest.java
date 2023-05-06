package br.com.service;

import br.com.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {
        Person person = new Person(null);
        PersonService service = new PersonService();
    @Test
    public void checkAgeOver18(){
        person.setAge(18);
        Boolean result = service.isAdult(person);
        Assertions.assertTrue(result);
    }
    @Test
    public void verificaVotoOpcional(){
        person.setAge(71);
        String result = service.podeVotar(person);
        Assertions.assertEquals("Voto Opcional", result);
    }
    @Test
    public void verificaVotoNaoObrigatorioEntre16e18(){
        person.setAge(17);
        String result = service.podeVotar(person);
        Assertions.assertEquals("Voto Opcional", result);
    }
    @Test
    public void verificaVotoObrigatorio(){
        person.setAge(18);
        String result = service.podeVotar(person);
        Assertions.assertEquals("Voto Obrigatório", result);
    }

}
