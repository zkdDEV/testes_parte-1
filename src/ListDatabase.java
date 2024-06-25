import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDatabase {

    private List<Person> lista;

    public ListDatabase(){
        if(lista == null){
            lista = new ArrayList<>();
        }
    }

    public List<Person> getLista() {
        return lista;
    }

    public void addPerson(Person p){
        lista.add(p);
    }

    public List<Person> getListWithMen(){
        List<Person> menList = lista.stream()
                .filter(person -> person.getSex().equalsIgnoreCase("masculino"))
                .collect(Collectors.toList());
        return menList;
    }
    public List<Person> getListWithWomen(){
        List<Person> womenList = lista.stream()
                .filter(person -> person.getSex().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());
        return womenList;
    }

    public void printList(List<Person> list){
        list.forEach(System.out::println);
    }
}
