import java.util.ArrayList;

class ConsultantCollection
{
	ArrayList<Consultant> consultants;

	public ConsultantCollection() {
		consultants = new ArrayList<Consultant>();
	}

	public void addConsultant(Consultant consultant) {
		consultants.add(consultant);
	}

	public void removeConsultant(Consultant consultant) {
		consultants.remove(consultant);
	}

	public ArrayList<Consultant> getAllConsultants() {
		return(consultants);
	}

	public Consultant getConsultantByIndex(int n) {
		return(consultants.get(n));
	}

	public int getConsultantCount() {
		return(consultants.size());
	}
}
