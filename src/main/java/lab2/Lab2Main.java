package lab2;


import lab1.Client;

import java.io.IOException;
import java.util.List;

public class Lab2Main {

    public static void main(String[] args) {
        try {

            List<Client> persons = structureDB.loadPersonList();

            persons.forEach(System.out::println);

            Client prs = ClientsWork.findClientByName(persons, "Иван");

            if (prs != null) {
                prs.setPhoneNumber("+71111111111");
                prs.setAdress("Гвардейская 52");
            }

            structureDB.saveClientList(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
