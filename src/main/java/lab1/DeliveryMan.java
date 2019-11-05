package lab1;

import java.util.List;

public class DeliveryMan {
    private List<Client> clients;
    String name;
    String data;

    public List<Client> getClients() {
        return clients;
    }

    void addClient (Client client){
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DeliveryMan(List<Client> clients, String name, String data) {
        this.clients = clients;
        this.name = name;
        this.data = data;
    }
}
