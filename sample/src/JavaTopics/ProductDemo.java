package JavaTopics;

import java.util.*;

class Product{
	private int id;
	private String name;
	private int price;
	private int quantity;
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	Product(int id,String name,int price){
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = 1;
		
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> al = new ArrayList<>(Arrays.asList(
												new Product(1,"naveen",10000),
												new Product(2,"nandhini",10000),
												new Product(3,"raja",10000)));
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			String s = sc.next();
			switch(s){
			case "ADD":
				int id = sc.nextInt();
				String name = sc.next();
				int price = sc.nextInt();
				boolean flag = true;
				for(Product p : al) {
					if(p.getId()==id) {
						p.setQuantity(p.getQuantity()+1);
						flag = true;
						break;
					}
				}
				if(!flag) {
					al.add(new Product(id,name,price));
					System.out.println("ADDED...");
				}
				break;
			
			case "REMOVE":
				int remove_id = sc.nextInt();
				for(Product p : al) {
					if(p.getId()==remove_id) {
						al.remove(p);
						break;
					}
				}
				System.out.println("Value not found");
				break;
				
			case "TOTAL":
				int total=0;
				for(Product p : al) {
					total+=p.getPrice();
				}
				System.out.println(total);
				break;
				
			case "INFO":
				for(Product p : al) {
					System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice()+" "+p.getQuantity());
				}
				break;
			}
		}
		
	}

}
