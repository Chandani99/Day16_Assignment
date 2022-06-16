package Question1;

import java.util.Comparator;

public class SortWithIdCom implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getProductId()>p2.getProductId()) {
			return +1;
		}
		return -1;
		
	}

}
