/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;

/**
 *
 * @author Ev0gamer
 */
public class Card {
    
    private int xPos;
    private int yPos;
    private String content;
    private int pairnumber;

    public Card(int pXPos, int pYPos, String pContent, int pPairnumber) {
        xPos = pXPos;
        yPos = pYPos;
        content = pContent;
        pairnumber = pPairnumber;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public String getContent() {
        return content;
    }

    public int getPairnumber() {
        return pairnumber;
    }
    
    public void turn ()
    {
        //Karte visuell umdrehen
        //Falls erste umgedrehte Karte des Zugs->bleibe umgedreht
        //Falls zweite umgedrehte Karte des Zugs->bleibe eine Sekunde lang umgedreht und dreh anschließend beide um
    }
    
}
