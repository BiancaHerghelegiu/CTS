package seminar11_facade;

public class Program {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Mihai", "1980825567780");
		
		//utilizare Facade
		if(Facade.verificaPersoanaPentruCreareCont(persoana)) {
			System.out.println("A fost creat contul");
		}
	}
}
