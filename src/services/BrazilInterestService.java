package services;

public class BrazilInterestService implements InterestService{
	// Atributos
	private double interestRate;
	
	
	// Métodos Getters e Setters

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
	// Método construtor
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
		
	// Métodos

}
