public class Main {

	public static void main(String[] args) {
		
		Sincronizar objeto = new Sincronizar();
		
		do{

			System.out.println("Informe o valor, o sinal de operação e o outro valor abaixo:");
			
			objeto.run();	//executar
			System.out.println(objeto.calculo());
			
		} while(true);
	}
}