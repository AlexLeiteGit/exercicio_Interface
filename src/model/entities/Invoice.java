/*
 O programa deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela. 
*/

package model.entities;

public class Invoice {
	
	private Double basicPayment;
	private Double tax;
	
	public Invoice() {
	}
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double totalPayment() {
		return getBasicPayment() + getTax();
	}
	
	
	
	

}
