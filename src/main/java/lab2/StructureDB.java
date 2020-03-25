package lab2;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import lab1.Client;
import lab1.Delivery;
import lab1.DeliveryMan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class StructureDB {

    public static List<DeliveryMan> loadPersonList() throws IOException, JsonSyntaxException {
        String cStr = "";
        File file = new File("clients.json");

        if (file.exists()) {
            cStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File clients.json not found!");
        }

        Gson gson = new Gson();

        DeliveryMan[] clst = gson.fromJson(cStr, DeliveryMan[].class);

        return Arrays.asList(clst);
    }

    public static void saveDelivery (Delivery delivery) throws IOException {

        if (delivery != null ) {
            Gson gson = new Gson();

            String deliveryAS = gson.toJson(delivery);

            System.out.println(deliveryAS);

            try (OutputStream os = new FileOutputStream(new File("delivery.json"))) {
                os.write(deliveryAS.getBytes("UTF-8"));
                os.flush();
            }

        }
    }
}
