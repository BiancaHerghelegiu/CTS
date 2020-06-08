package clase;

public class StareLibera implements State {
	
	@Override
	public void schimbareStare(Masa masa) {
		masa.setStare(this);
		
	}

	@Override
	public void printStare(int nrMasa) {
		System.out.println("Masa "+ nrMasa+ " este libera");
		
	}

}
