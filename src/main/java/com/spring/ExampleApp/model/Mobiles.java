package com.spring.ExampleApp.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Mobiles {
	@Id
	private int id;
	private String name;
	private String model;
	private Integer price;
	private List<String> details;
	
	public Mobiles(int id, String name, String model, int price, List<String> details) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.details = details;
	}
	
	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Mobiles [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + ", details=" + details
				+ "]";
	}
	
}
