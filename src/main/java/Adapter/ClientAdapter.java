
package Adapter;

public class ClientAdapter implements Chef {




    private Client client;

    public ClientAdapter(){
        client = new HungryClient();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String makeFood() {
        return client.orderFood() + " Make food.";
    }

}
