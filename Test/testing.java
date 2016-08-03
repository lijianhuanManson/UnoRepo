
package Test;


import Model.Card;
import Model.DiscardPile;
import Model.DrawPile;
import Model.Game;
import Model.Player;

import java.util.*;

public class testing {

	public static void main(String[] args) {
		
		//distribute cards
		Game g = new Game(1);
		g = addPlayers(g);
		g.starGame(g.getPlayerList());
		printPlayerHandCards(g);
		System.out.println("The number of remaining cards: "+g.getDrawPile().cardList.size());
		
		
		//draw a card into discard pile
		firstDiscard(g);
		System.out.println("The Top Card Of Discard Pile :"+g.getDiscardPile().discardList.get(0));
		
		

	}

	private static Game addPlayers(Game game) {

		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		Player player3 = new Player("player3");
		Player player4 = new Player("player4");
		Player player5 = new Player("player5");

		game.addPlayer(player1);
		game.addPlayer(player2);
		game.addPlayer(player3);
		game.addPlayer(player4);
		game.addPlayer(player5);

		return game;
	}

	private static void printPlayerHandCards(Game g) {
		for (int i = 0; i < g.getPlayerList().size(); i++) {
			ArrayList<Card> playerHandCard = g.getPlayerList().get(i).getHandCardList();
			System.out.println();
			int totalValue = totalValueOfPlayer(g.getPlayerList().get(i));
			System.out.println("Player: " + g.getPlayerList().get(i).toString() +" Total Value = "+ totalValue);
			for (int j = 0; j < playerHandCard.size(); j++) {

				System.out.println(playerHandCard.get(j));
			}
		}

	}

	private static int totalValueOfPlayer(Player p) {
		p.getHandCardList();
		int totalValue = 0;
		for (Card c : p.getHandCardList()) {
			totalValue += c.getValue();
		}

		return totalValue;
	}

	private static void firstDiscard(Game g){
		
		Card c = g.getDrawPile().drawCard();
		g.getDiscardPile().addCard(c);		
		g.setStatus("Started");
	}

}
