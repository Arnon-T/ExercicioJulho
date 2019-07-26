package interfaces;

interface ClasseInterface {

	abstract void deposita(double valor, Conta contadestino);
	
	abstract void saca(double valor, Conta contaorigem);		
	
	abstract void geradorExtrato(Conta contaextrato);
	
}
