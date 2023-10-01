package atividade;

import atividade.entities.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    Scanner sc = new Scanner(System.in);
    PersonService personService = new PersonService();

    ArrayList<Person> list = new ArrayList<>();
    Person person = new Person();

    public void menu(){
        int opcao;
        do {

            System.out.println("==== Select the function ====");
            System.out.println("(1) - Register Person");
            System.out.println("(2) - To List Person");
            System.out.println("(3) - Search Person with id");
            System.out.println("(4) - Search Person");
            System.out.println("(5) - Delete Person");
            System.out.println("(0) - Exit");
            System.out.print("-> ");
            opcao = sc.nextInt();


            if (opcao == 1){
                System.out.println("==== Register Person ====");
                list = personService.registerPerson(person);
            }

            if (opcao == 2){
                System.out.println("==== List Person ====");
                personService.listPerson(list);

            }

            if (opcao == 3){
                System.out.println("==== Search Person With ID ====");
                System.out.print("Enter the id of  person do you want search for: ");
                int id = sc.nextInt();
                personService.searchPerson(id);

            }
            if (opcao == 4){
                System.out.println("==== Search Person ====");
                System.out.print("Enter the name of  person do you want search for: ");
                sc.nextLine();
                String pearsonName = sc.nextLine();
                personService.searchPerson(person, pearsonName);

            }
            if (opcao == 5){
                System.out.println("==== Delete Person ====");
                System.out.print("Enter the id of person do you want to remove: ");
                int id = sc.nextInt();
               list =  personService.deletedPerson(id);

            }


        } while (opcao != 0);
    }
}
