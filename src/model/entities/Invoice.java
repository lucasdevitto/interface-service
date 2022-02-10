package model.entities;

public class Invoice {

	public Double basicPayment;
	public Double tax;
	
	public Invoice() {
		
	}

	public Invoice(Double basicPayment, Double tex) {
		this.basicPayment = basicPayment;
		this.tax = tex;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTex() {
		return tax;
	}

	public void setTex(Double tex) {
		this.tax = tex;
	}
	
	public Double getTotalPayment() { 
		return getBasicPayment() + getTex();
	}
}
