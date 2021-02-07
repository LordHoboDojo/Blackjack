import java.util.*;

public class Blackjack
{
    public static ArrayList<Card> makeDeck()
    {
        ArrayList<Card> deck = new ArrayList<>();
        for (int rank = 1; rank <= 13; rank = rank + 1)
        {
            for (int suit = 0; suit <= 3; suit = suit + 1)
            {
                deck.add(new Card(rank,suit));
            }
        }

        return deck;  //change
    }

    public static void swap(ArrayList<Card> cards, int i, int j)
    {
    	//TODO
        Card temp = cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,temp);
    }

    public static void dealOneCard(ArrayList<Card> deck, ArrayList<Card> hand)
    {
    	//TODO
        hand.add(deck.remove(0));
    }

    public static int getScore(ArrayList<Card> hand)
    {
    	//TODO
        int score =0;
        int aces = 0;
        for (Card c: hand){
           if (c.getRank() >=10){
               score+=10;
           }
           else if (c.getRank()==1){
               aces++;
           }
           else{
               score += c.getRank();
           }
        }
        if ((21-score) >= 11 + (aces-1)){
            score += 11 + (aces-1);
        }
        else{
            score += aces;
        }
        return score;
    }
}