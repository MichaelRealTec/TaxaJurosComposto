package services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService{
	// Atributos
	private double interestRate;
	
	
	// Métodos Getters e Setters

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
	// Método construtor
	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
		
	// Métodos

}
