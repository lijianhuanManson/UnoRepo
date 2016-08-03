
package Test;


import Model.card;
import Model.property;
import java.util.*;


public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		property p = new property();
		
		List<card> cardList = p.cardList;
		
		for (card c : cardList) {
			System.out.println(c);
		}
		
	
		
	}
	

	
}
