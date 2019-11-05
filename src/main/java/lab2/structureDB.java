package lab2;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import lab1.Client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class structureDB {

    public static List<Client> loadPersonList() throws IOException, JsonSyntaxException {
        String cStr = "";
        File file = new File("clients.json");

        if (file.exists()) {
            cStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File clients.json not found!");
        }

        Gson gson = new Gson();

        Client[] clst = gson.fromJson(cStr, Client[].class);

        return Arrays.asList(clst);
    }

    public static void saveClientList(List<Client> clients) throws IOException {

        if (clients != null && clients.size() > 0) {
            Gson gson = new Gson();

            String clientsAsJson = gson.toJson(clients);

            System.out.println(clientsAsJson);

            try (OutputStream os = new FileOutputStream(new File("clients.json"))) {
                os.write(clientsAsJson.getBytes("UTF-8"));
                os.flush();
            }

        }
    }
}
