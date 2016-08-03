package Model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class DrawPile {
	
	String [] cardType = new String[]{"0","1","2","3","4","5","6","7","8","9","Skip","TakeTwo","Reverse","Wild","WildDropFour"};
	String [] cardColor = new String[]{"Green","Bule","Yellow","Red"};
	int [] cardValue = new int []{0,1,2,3,4,5,6,7,8,9,20,20,20,50,50};
	public LinkedList <Card> cardList;
	
	
	
	public DrawPile(){
		setCardProperty();
		
	}
	
	private void setCardProperty(){
		
		cardList = new LinkedList<Card>();
		//center card
		for (int i = 1; i < cardType.length-2; i++) {			
			Card c = new Card();
			if (i<10) {
				c.setType("Nomal");
			}
			else{c.setType(cardType[i]);}
			
			c.setValue(cardValue[i]);
											
			for (int j = 0; j < cardColor.length; j++) {
				Card n = new Card();
				String image;
				
				n.setType(c.getType());
				n.setValue(c.getValue());
				n.setColor(cardColor[j]);				
				image =  c.getValue() +c.getType().toString()+ n.getColor();				
				n.setImage(image);	
				cardList.add(n);
				cardList.add(n);			
				
			}
		}
		
		//zero card
		for (int i = 0; i < cardColor.length; i++) {
			Card c = new Card();
			c.setType("Nomal");
			c.setValue(0);
			c.setColor(cardColor[i]);
			String image = cardValue[i]+c.getType().toString()+cardColor[i];
			c.setImage(image);
			cardList.add(c);
		}
		
		//wild card
		for (int i = 0; i < 8; i++) {
			Card c = new Card();
			String image;
			c.setColor("Black");
			c.setValue(50);
			if (i<4) {
				c.setType("Wild");
			}
			c.setType("WildDropFour");
			image= cardValue[i]+c.getType().toString()+c.getColor();
			c.setImage(image);
			cardList.add(c);
		}
	
		
		Collections.shuffle(cardList);
		
		
		
	}
	
	 
	public Card drawCard(){		
		Card c =new Card();
		c= cardList.getLast();
		cardList.remove(cardList.size()-1);
		return c;
	}
	

}
