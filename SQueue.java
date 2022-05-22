package tubes;

public class SQueue {
    Client[] clients;
    int head;
    int tail;

    public SQueue(int maxWaiting) {
        clients = new Client[maxWaiting];
        for (int i = 0; i < maxWaiting; i++) {
            clients[i] = new Client();
        }
    }

    public int search(String nama) {
        int index = -1;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].username != null) {
                if (clients[i].username.equalsIgnoreCase(nama)) {
                    index = i;
                }
            }

        }
        return index;
    }

    void print() {
        for (Client client : clients) {
            System.out.println("nama : " + client.username);
        }
    }
}
