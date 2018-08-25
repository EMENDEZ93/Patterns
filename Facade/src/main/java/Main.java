import facade.CheckFacade;

public class Main {
	
	public static void main(String[] args) {
		
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("25/08/2018", "26/08/2018", "Bucaramanga", "Medellín");
 		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("29/08/2018", "30/08/2018", "Medellín", "Bucaramanga");
 				
		
	}
	
}
