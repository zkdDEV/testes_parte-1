import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class TesteMulheres {

    @Test
    public void listaDeMulheresTeste() {
        // Criando dados de homens e mulheres para a simulação
        Person woman1 = new Person("Bruna", "feminino");
        Person man1 = new Person("Matheus", "masculino");
        Person woman2 = new Person("Maria", "feminino");
        Person man2 = new Person("Renato", "masculino");

        // Criando um "Banco de dados"
        ListDatabase database = new ListDatabase();

        // Adicionando dados de homens e mulheres na lista do "Banco de dados"
        database.addPerson(woman1);
        database.addPerson(man1);
        database.addPerson(woman2);
        database.addPerson(man2);

        // Pegando lista que só tem mulheres a partir do método do "Banco de dados" que separa por sexo
        List<Person> womenList = database.getListWithWomen();

        // Checando se a lista contém apenas mulheres
        for(Person woman : womenList){
            Assert.assertEquals("feminino", woman.getSex());
            System.out.println(woman);
        }
    }
}
