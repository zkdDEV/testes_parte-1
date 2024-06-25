import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TesteHomens {

    @Test
    public void listaDeHomensTeste() {
        // Criando dados de homens e mulheres para a simulação
        Person man1 = new Person("Matheus", "masculino");
        Person woman1 = new Person("Bruna", "feminino");
        Person man2 = new Person("Renato", "masculino");
        Person woman2 = new Person("Maria", "feminino");

        // Criando um "Banco de dados"
        ListDatabase database = new ListDatabase();

        // Adicionando dados de homens e mulheres na lista do "Banco de dados"
        database.addPerson(woman1);
        database.addPerson(man1);
        database.addPerson(woman2);
        database.addPerson(man2);

        // Pegando lista que só tem homens a partir do método do "Banco de dados" que separa por sexo
        List<Person> menList = database.getListWithMen();

        // Checando se a lista contém apenas homens
        for(Person man : menList){
            Assert.assertEquals("masculino", man.getSex());
            System.out.println(man);
        }
    }
}
