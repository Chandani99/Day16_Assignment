package Question2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<Employee> se=new TreeSet<>(new SalarySortComp());
       
       Scanner sc=new Scanner(System.in);
       for(int i=1; i<=2; i++) {
    	   System.out.println("Enter Employee Id: ");
    	   
    	   int id=sc.nextInt();
    	   
           System.out.println("Enter Employee name: ");
    	   
    	   String name=sc.next();
    	   
           System.out.println("Enter Employee salary: ");
    	   
    	   double sal=sc.nextDouble();
    	   
    	   se.add(new Employee(id,name,sal));
    	   
    	   
       }
       for(Employee ee:se ) {
    	   System.out.println(ee);  
       } 
	}

}
