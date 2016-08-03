package Model;

import java.util.ArrayList;
import java.util.List;

public class DiscardPile {
	
	private int numberOfCard;
	public ArrayList<Card> discardList;	
	
	public DiscardPile(){
		discardList = new ArrayList<>();
	}
	
	public void addCard(Card c){
		discardList.add(c);		
	}
	
	public void getTopCard(){
		
	//	return cardList.get(cardList.size())
	}
}
