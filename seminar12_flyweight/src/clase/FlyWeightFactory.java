package clase;

import java.util.HashMap;

public class FlyWeightFactory {
		private static HashMap<Integer, IClient> clienti=new HashMap<Integer, IClient>();
		public FlyWeightFactory() {
			this.clienti=new HashMap<Integer, IClient>();
		}
		public static  IClient getClient(int numarAsigurare,String nume) {
			IClient client=clienti.get(numarAsigurare);
			if(client==null) {
				client=new ClientFlyweight(numarAsigurare,nume);
				clienti.put(numarAsigurare,client);
				
				
			}
			return client;
		}
		
		
}

