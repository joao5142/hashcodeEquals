package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Client;
import entities.Product;

public class Program {
	
	public static List<Client> getClientList(){
		Client c1=new Client("Maria","maria@gmail.com",1233);
		Client c2=new Client("Maria","maria12@gmail.com",1233);
		Client c3=new Client("Joao","joao@gmail.com",5142);
		Client c4=new Client("Roberta","roberta@gmail.com",2232);
		Client c5=new Client("Anna","anna@gmail.com",5541);
		
		return Arrays.asList(c1,c2,c3,c4,c5);
	}
	public static void setProductList(Client obj){
		obj.addProduct(new Product("Arroz", 5.0,1));
		obj.addProduct(new Product("Feijao", 8.0,2));
		obj.addProduct(new Product("Sabonete", 1.0,3));
		obj.addProduct(new Product("Refri", 7.0,4));
		obj.addProduct(new Product("Macarrao", 3.5,5));
		obj.addProduct(new Product("Biscoito", 1.4,6));
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//lista de clientes retirada do metodo estático  getClientList
		List<Client>clientList= getClientList();
		System.out.println("Client List :\n");
		clientList.forEach(System.out::println);
		
		Collections.sort(clientList);
		System.out.println("\nClient List Sorted :\n");
		clientList.forEach(System.out::println);
		
		
		Client c1 = clientList.get(0);
		//setando a lista de produtos  para o objeto c1 
		setProductList(c1);
		System.out.println("\n");
		for(Product product : c1.getProductList()) {
			   System.out.println(product);
		}
		
		c1.removeProduct(new Product("Arroz", 5.0, 1));
		System.out.println("\nNew Product List :\n");
		for(Product product : c1.getProductList()) {
			   System.out.println(product);
		}
	    
	}
	
	 

}
