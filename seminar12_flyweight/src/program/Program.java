package program;

import clase.ClientFlyweight;
import clase.FlyWeightFactory;
import clase.IClient;
import clase.Reteta;

public class Program {
	
	public static void achizitieReteta() {
		IClient client=FlyWeightFactory.getClient(1, "Ion");
		Reteta r2=new Reteta(2, 50, 3);
		client.printareReteta(r2);
		
		
	}
	
	public static void main(String[] args) {
		
		Reteta r1=new Reteta(1, 200, 20);
		
		IClient client1=FlyWeightFactory.getClient(1, "Ion");
		Reteta r2=new Reteta(3, 50, 3);
		IClient client2=(ClientFlyweight) FlyWeightFactory.getClient(1,"Ion");
		
		client1.printareReteta(r2);
		client2.printareReteta(r1);
		
		//achizitieReteta();
		
		
	}

}
