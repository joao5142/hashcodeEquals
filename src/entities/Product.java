package entities;

import java.util.Objects;

public class Product {
	private Integer cod;
	private String name;
	private Double price;

	
	public Product(String name, Double price,Integer cod) {
		this.name = name;
		this.price = price;
		this.cod=cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [" + name + ", " + price + "R$]";
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(cod, other.cod) && Objects.equals(name, other.name);
	}
	
	

}
