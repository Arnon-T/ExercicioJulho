package polimorfismo;

import java.time.LocalDateTime;

abstract public class Funcionario {

	private String 	nomeFunc;
	private double	salarioFunc;
	private LocalDateTime	registroEntrada;
	private LocalDateTime	registroSaida;
	
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	public LocalDateTime getRegistroEntrada() {
		return registroEntrada;
	}
	public void setRegistroEntrada(LocalDateTime registroEntrada) {
		this.registroEntrada = registroEntrada;
	}
	public LocalDateTime getRegistroSaida() {
		return registroSaida;
	}
	public void setRegistroSaida(LocalDateTime registroSaida) {
		this.registroSaida = registroSaida;
	}				
}
