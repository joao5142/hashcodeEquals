package entities;

import java.util.ArrayList;
import java.util.List;

public class Client extends ClientDefault implements Comparable<Client> {
	private List<Product> listProduct = new ArrayList<>();

	public Client() {
	}
	public Client(String name, String email,Integer cod) {
		 super(name,email,cod);
	}
	public void removeProduct(Product product) {
		this.listProduct.removeIf(p->p.equals(product));
	}
	public void addProduct(Product product) {
		this.listProduct.add(product);
	}
    public List<Product> getProductList(){
    	return this.listProduct;
    }
	@Override
	public int compareTo(Client other) {
		return  this.getName().compareTo(other.getName());
	}
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(getName());
		sb.append(", ");
		sb.append(this.getEmail());
		sb.append(", ");
		sb.append(this.getCod());
		
		return sb.toString();
	}
	
    
	
	
	
}
