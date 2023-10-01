package atividade;
import atividade.entities.Person;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {
    ArrayList<Person> personList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public ArrayList<Person> registerPerson(Person person){

        person = new Person();

        System.out.print("ID: ");
        person.setIdPerson( sc.nextInt());
        System.out.print("Name: ");
        sc.nextLine();
        person.setName(sc.nextLine());
        System.out.print("Age: ");
        person.setAge(sc.nextInt());
        System.out.print("Cpf: ");
        person.setCpf(sc.next());

        personList.add(person);

        return personList;
    }

    public void listPerson(ArrayList<Person> list){

        for (int i = 0; i < personList.size();i++){
            System.out.println("==== Person #" + (i+1) + " ====");
            System.out.println("ID: " + list.get(i).getIdPerson());
            System.out.println("Name: " + list.get(i).getName());
            System.out.println("Age: " + list.get(i).getAge());
            System.out.println("Cpf: " + list.get(i).getCpf());
            System.out.println("=====================");
            }

        }

    public void searchPerson(int idPerson){

        int confirm = 0;
        for(int i = 0; i < personList.size();i++) {
            if (personList.get(i).getIdPerson() == idPerson) {
                System.out.println("ID: " + personList.get(i).getIdPerson());
                System.out.println("Name: " + personList.get(i).getName());
                System.out.println("Age: " + personList.get(i).getAge());
                System.out.println("Cpf: " + personList.get(i).getCpf());
                confirm = 1;
            }
        }
        if (confirm < 1){
            System.out.println("This id does not exist or has not been entered correctly");
        }

    }

    public void searchPerson(Person person, String name){
        int confirm = 0;
        for(int i = 0; i < personList.size();i++) {
            if (personList.get(i).getName().equals(name)) {
                System.out.println("ID: " + personList.get(i).getIdPerson());
                System.out.println("Name: " + personList.get(i).getName());
                System.out.println("Age: " + personList.get(i).getAge());
                System.out.println("Cpf: " + personList.get(i).getCpf());
                confirm = 1;
            }
        }
        if (confirm < 1){
            System.out.println("This person does not exist or has not been entered correctly");
        }
    }

    public ArrayList<Person> deletedPerson(int idPerson){

        int confirm = 0;
        for(int i = 0; i < personList.size();i++) {
            if (personList.get(i).getIdPerson() == idPerson) {
                personList.remove(i);
                System.out.println("User removed with success!");
                confirm += 1;
            }
        }
        if (confirm < 1){
            System.out.println("This id does not exist or has not been entered correctly");
        }
        return personList;
    }


}
