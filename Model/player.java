package Model;

public class player {

	private int id;
	private String name;
	private int handCard;
	
	
	public player(int id, String name, int handCard) {
		super();
		this.id = id;
		this.name = name;
		this.handCard = handCard;
	}
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
	public int getHandCard() {
		return handCard;
	}
	public void setHandCard(int handCard) {
		this.handCard = handCard;
	}
	
	
	public void AddHandCard(card c){
		
		
		handCard += 1;
	}
	
	public void RemoveHandCard(){
		
		handCard -= 1;
	}
	@Override
	public String toString() {
		return "player [id=" + id + ", name=" + name + ", handCard=" + handCard + "]";
	}
	
	
	
}
