package com.bappy.creationalDesignPattern.abstractFactoryPattern;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
