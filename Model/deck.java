package Model;

public class deck {

	private int numberOfCard;

	
	public deck(){
		 
	  numberOfCard = 108;
	}


	public int getNumberOfCard() {
		return numberOfCard;
	}


	public void setNumberOfCard(int numberOfCard) {
		this.numberOfCard = numberOfCard;
	}
	
	
	
	public void CreateNewDeck(){
		
		
	}
	
	public void TakeCard(){
		
		numberOfCard -=1;
	}
	
	
}
