package com.TravelBookingApplication;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="JPA_TRAVEL_INFO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Travel {
	@Id
	@Column(name="TRAVEL_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String destination;
	private String transportationMode;
	private Double price;
	
	public Travel(String destination, String transportationMode, Double price) {
		
		this.id = id;
		this.destination = destination;
		this.transportationMode = transportationMode;
		this.price = price;
	}
	
	 public Long getId() {
	        return id;
	    }

	    public String getDestination() {
	        return destination;
	    }

	    public void setDestination(String destination) {
	        this.destination = destination;
	    }

	    public String getTransportationMode() {
	        return transportationMode;
	    }

	    public void setTransportationMode(String transportationMode) {
	        this.transportationMode = transportationMode;
	    }

	    public Double getPrice() {
	        return price;
	    }

	    public void setPrice(Double price) {
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Travel [id=" + id + ", destination=" + destination +
	               ", transportationMode=" + transportationMode + ", price=" + price + "]";
	    }
	}