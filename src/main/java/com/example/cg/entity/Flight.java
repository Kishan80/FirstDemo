package com.example.cg.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table
public class Flight {

	@Id
	@Pattern(regexp="^[0-9]${3}",message="Please enter valid flight number")  
	//@Size(min=1,max=1000)
	private int flightNo;
	@NotEmpty
	private String carrier;
	@NotEmpty
	private String source;
	@NotEmpty
	private String destination;
	@NotNull
	private int price;

	public Flight() {
		super();
	}

	public Flight(int flightNo, String carrier, String source, String destination, int price) {
		super();
		this.flightNo = flightNo;
		this.carrier = carrier;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", carrier=" + carrier + ", source=" + source + ", destination="
				+ destination + ", price=" + price + "]";
	}
}
