package Model;

import java.util.ArrayList;

public class Player {

	
	private String name;
	private ArrayList<Card> handCardList;
	
	public Player (String name){
		this.name=name;
		this.handCardList =new ArrayList<Card>();
	}

	
	public void AddHandCard(Card c){
		
		handCardList.add(c);
		
	}
	
	public Card RemoveHandCard(Card c){
		
		
		handCardList.remove(c);
		return c;
	}
	
	
	//getter setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Card> getHandCardList() {
		return handCardList;
	}


	public void setHandCardList(ArrayList<Card> handCardList) {
		this.handCardList = handCardList;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}




	
	
	
	
	
}
