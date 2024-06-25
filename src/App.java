import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    private static ListDatabase database = new ListDatabase();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite: 1 - Adiconar uma Pessoa | 2 - Ver lista de Homens | 3 - Ver lista de Mulheres");
        String answer = s.nextLine();

        while(!isValidOption(answer)){
            System.out.println("***************************************************************");
            System.out.println("Você digitou um valor inválido!");
            System.out.println("***************************************************************");
            System.out.println("Digite: 1 - Adiconar uma Pessoa | 2 - Ver lista de Homens | 3 - Ver lista de Mulheres");
            answer = s.nextLine();
        }

        while(isValidOption(answer)){
            if("1".equals(answer)){
                addPerson();
            } else if("2".equals(answer)){
                seeMenList();
            } else if("3".equals(answer)){
                seeWomenList();
            }
            System.out.println("Digite: 1 - Adiconar uma Pessoa | 2 - Ver lista de Homens | 3 - Ver lista de Mulheres");
            answer = s.nextLine();
        }

    }

    private static void seeMenList() {
        List<Person> menList = database.getListWithMen();
        if(menList.isEmpty()){
            System.out.println("---------------------------------------------------------------");
            System.out.println("A lista de homens está vazia!");
            System.out.println("---------------------------------------------------------------");
        } else{
            database.printList(menList);
        }
    }

    private static void seeWomenList() {
        List<Person> womenList = database.getListWithWomen();
        if(womenList.isEmpty()){
            System.out.println("---------------------------------------------------------------");
            System.out.println("A lista de mulheres está vazia!");
            System.out.println("---------------------------------------------------------------");
        } else{
            database.printList(womenList);
        }
    }

    private static void addPerson() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa");
        String name = s.nextLine();
        System.out.println("Digite o sexo dessa pessoa - Masculino | Feminino");
        String sex = s.nextLine();
        if(sex.equalsIgnoreCase("masculino")){
            Person homem = new Person(name.toLowerCase().trim(), sex.toLowerCase().trim());
            database.addPerson(homem);
            System.out.println("---------------------------------------------------------------");
            System.out.println(name + " foi adicionado a lista de Homens");
            System.out.println("---------------------------------------------------------------");

        }else if(sex.equalsIgnoreCase("feminino")){
            Person mulher = new Person(name.toLowerCase().trim(), sex.toLowerCase().trim());
            database.addPerson(mulher);
            System.out.println("---------------------------------------------------------------");
            System.out.println(name + " foi adicionado a lista de Mulheres");
            System.out.println("---------------------------------------------------------------");
        } else{
            System.out.println("***************************************************************");
            System.out.println("Você digitou um valor inválido!");
            System.out.println("***************************************************************");
        }
    }

    private static boolean isValidOption(String answer) {
        try{
            Long numberAnswer = Long.parseLong(answer);
            if(numberAnswer <= 3 && numberAnswer >= 1){
                return true;
            } else{
              return false;
            }
        } catch (Exception e){
            return false;
        }
    }
}
