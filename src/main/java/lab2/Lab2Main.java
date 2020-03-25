package lab2;


import lab1.Client;
import lab1.Delivery;
import lab1.DeliveryMan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab2Main {

    public static void main(String[] args) {
        try {
            Delivery deliver = new Delivery();

            List<DeliveryMan> persons = new ArrayList<>();//StructureDB.loadPersonList();
            DeliveryMan man1 = new DeliveryMan("MANNN", " ");
            DeliveryMan man2 = new DeliveryMan("MANNNAAA", " ");
            DeliveryMan man3 = new DeliveryMan("MANNNDD", " ");
            persons.add(man1);
            persons.add(man2);
            persons.add(man3);
            deliver.setDeliveryManList(persons);

            
            
            persons.forEach(System.out::println);

           // Client prs = ClientsWork.findClientByName(persons, "Иван");

            /*if (prs != null) {
                prs.setPhoneNumber("+71111111111");
                prs.setAdress("Гвардейская 52");
            }
*/
            StructureDB.saveDelivery(deliver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
