package lab4;

import lab1.Delivery;
import lab1.DeliveryMan;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Lab4Main {
    public static void main(String[] args) throws SQLException, IOException {
        List<DeliveryMan> deliveries = ServiceWithDB.loadJson();

        if (deliveries != null) {
            for (DeliveryMan dlv : deliveries) {
                System.out.println(dlv);
            }
        }

        System.out.println("-------------------");

        deliveries = ServiceWithDB.loadJsonb();

        if (deliveries != null) {
            for (DeliveryMan dlv : deliveries) {
                System.out.println(dlv);
            }
        }

        List<DeliveryMan> personList = ServiceWithJSON.loadDeliveryManList();
        ServiceWithDB.saveDeliveryList(personList);

    }
}
