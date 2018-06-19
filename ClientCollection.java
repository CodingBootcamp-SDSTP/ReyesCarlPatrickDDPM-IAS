import java.util.ArrayList;

public class ClientCollection
{
	private ArrayList<Client> clients;

	public ClientCollection() {
		clients = new ArrayList<Client>();
	}

	public void addClient(Client client) {
		clients.add(client);
	}

	public void removeClient(Client client) {
		clients.remove(client);
	}

	public ArrayList<Client> getAllClients() {
		return(clients);
	}

	public Client getClientByIndex(int n) {
		return(clients.get(n));
	}

	public int getClientCount() {
		return(clients.size());
	}

	// public ArrayList<Client> search(String s) {
	// 	Client c = null;
	// 	ArrayList<Client> 
	// }
}
