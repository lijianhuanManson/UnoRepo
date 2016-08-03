package Model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import javax.tools.ToolProvider;

public class property {
	
	String [] cardType = new String[]{"0","1","2","3","4","5","6","7","8","9","Skip","TakeTwo","Reverse","Wild","WildDropFour"};
	String [] cardColor = new String[]{"Green","Bule","Yellow","Red"};
	int [] cardValue = new int []{0,1,2,3,4,5,6,7,8,9,20,20,20,50,50};
	public LinkedList <card> cardList;
	
//	public enum cardType {Normal,TakeTwo,Skip,Reverse};
//	public enum cardColor {Green, Bule, Yellow, Red};
//	public enum cardValue {0,1,2,3,4,5,6,7,8,9,20};
	
	public property(){
		setCardProperty();
	}
	
	private void setCardProperty(){
		
		cardList = new LinkedList<card>();
		//center card
		for (int i = 1; i < cardType.length-1; i++) {
			String image;
			card c = new card();
			if (i<10) {
				c.setType("Nomal");
			}
			else{c.setType(cardType[i]);}
			
			c.setValue(cardValue[i]);
									
			image=cardType[i]+cardType[i].toString();
			
			for (int j = 0; j < cardColor.length; j++) {
				c.setColor(cardColor[j]);
				image+= cardColor[j];
				c.setImage(image);
				cardList.add(c);
				cardList.add(c);
			}
		}
		
		//zero card
		for (int i = 0; i < cardColor.length; i++) {
			card c = new card();
			c.setType("Nomal");
			c.setValue(0);
			c.setColor(cardColor[i]);
			String image = cardType[i]+cardType[i].toString()+cardColor[i];
			c.setImage(image);
			cardList.add(c);
		}
		
		//wild card
		for (int i = 0; i < 8; i++) {
			card c = new card();
			c.setColor("Black");
			c.setValue(50);
			if (i<4) {
				c.setType("Wild");
			}
			c.setType("WildDropFour");
			
		}
	
		
		
		
		
	}
	
	

}
