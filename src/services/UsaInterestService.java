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
	@Override
	public double payment(double amount, int months) {
		if(months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + interestRate / 100.0, months);
	}
}