package lab4;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import lab1.Delivery;
import lab1.DeliveryMan;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class ServiceWithJSON {

    public static List<DeliveryMan> loadDeliveryManList() throws IOException, JsonSyntaxException {

        String personStr = "";
        File file = new File("delivery.json");

        if (file.exists()) {
            personStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File delivery.json not found!");
        }

        Gson gson = new Gson();

        DeliveryMan[] dlv = gson.fromJson(personStr, DeliveryMan[].class);

        return Arrays.asList(dlv);
    }
}
