public class Main {

	public static void main(String[] args) {
		
		Sincronizar objeto = new Sincronizar();
		
		do{
			
			objeto.run();	//executar
			System.out.println(objeto.calculo());
			
		} while(true);
	}
}