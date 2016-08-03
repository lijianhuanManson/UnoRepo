package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Game {
	
	private int id;
	private ArrayList<Player> playerList;
	private String status;
	private DrawPile drawPile;
	private DiscardPile discardPile;
	
	public Game(int id){
		this.id=id;
		this.playerList= new ArrayList<Player>();
		this.status="Watting";
		this.drawPile = new DrawPile();
		this.discardPile = new DiscardPile();
						
	}
	
	public void starGame(ArrayList<Player> playList ){	
		// one player one card
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < playList.size(); j++) {
				Card c = drawPile.drawCard();
				playList.get(j).AddHandCard(c);									
			}
		}
		
	}

	

	// getter setter
	public void addPlayer(Player p){
		 playerList.add(p);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayList(ArrayList<Player> playList) {
		this.playerList = playList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DrawPile getDrawPile() {
		return drawPile;
	}

	public void setDrawPile(DrawPile drawPile) {
		this.drawPile = drawPile;
	}

	public DiscardPile getDiscardPile() {
		return discardPile;
	}

	public void setDiscardPile(DiscardPile discardPile) {
		this.discardPile = discardPile;
	}
	
	
}
	
   
