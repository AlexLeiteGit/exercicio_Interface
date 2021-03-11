/*
Uma locadora brasileira de carros cobra um valor por hora para loca��es de at�
12 horas. Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o ser�
cobrada com base em um valor di�rio
*/

package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService() {
	}
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		Double hour = (double) (t2 - t1)/1000/60/60;
		
		double basicPayment;
		if (hour <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hour);
		} else {
			basicPayment = pricePerDay * Math.ceil(hour/24);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
