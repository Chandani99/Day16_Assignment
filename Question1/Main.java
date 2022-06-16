package Question1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Set<Product> sp= new TreeSet<>(new SortWithIdCom());
		Set<Product> sp1= new TreeSet<>(new SortNameCom());
		Set<Product> sp2= new TreeSet<>(new SortWithPriceCom());
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
			System.out.println("Enter product id:");	
			 int id=sc.nextInt();
			 System.out.println("Enter product name:");
			 String name=sc.next();
			 
			 System.out.println("Enter product price:");
			 double price=sc.nextDouble();
			 
			 sp.add(new Product(id,name,price));
			 sp1.add(new Product(id,name,price));
			 sp2.add(new Product(id,name,price));

		}
		
		System.out.println(" 1 for sorting the product according to the productPrice\r\n"
				+ " 2 for sorting the product according to the productName\r\n"
				+ " 3 for sorting the product according to the productId\\r\\n"
				+"Enter your choice===");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println(sp2);
			break;
		case 2:
			System.out.println(sp1);
			break;
		case 3:
			System.out.println(sp);
			break;
		default:
				System.out.println(sp);
				break;
			
		}
		
	}

}
