/*
Além do valor da locação, é acrescido no preço o valor do imposto conforme regras do país que, 
no caso do Brasil, é 20% para valores até 100.00, ou 15% para valores acima de 100.00.
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
