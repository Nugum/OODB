package lab2;


import lab1.Client;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClientsWork {

    public static Client findClientByName(List<Client> clients, String searchName) {
        Client result = null;

        for (Client client : clients) {
            if (client.getFirstName().equals(searchName)) {
                result = client;
            }
        }

        return result;
    }

    public static Client findClientByLastName(List<Client> clients, String searchLastName) {
        Client result = null;

        for (Client client : clients) {
            if (client.getLastName().equals(searchLastName)) {
                result = client;
            }
        }

        return result;
    }

    public static List<Client> sortByName(List<Client> clients) {
        return clients.stream().sorted(Comparator.comparing(Client::getFirstName)).collect(Collectors.toList());
    }

}
