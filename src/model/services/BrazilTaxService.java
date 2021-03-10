/*
Al�m do valor da loca��o, � acrescido no pre�o o valor do imposto conforme regras do pa�s que, 
no caso do Brasil, � 20% para valores at� 100.00, ou 15% para valores acima de 100.00.
*/

package model.services;

public class BrazilTaxService {
	
	public Double tax(Double amount) {
		if (amount <= 100.00) {
			return amount * 0.20;
		} else {
			return amount * 0.15;
		}
		
	}

}
