import java.util.List;

public class Person {

    private List<Person> database;
    private String name;
    private String sex;

    public Person(String name, String sex){
        this.name = name;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Nome: " + name;
    }
}
