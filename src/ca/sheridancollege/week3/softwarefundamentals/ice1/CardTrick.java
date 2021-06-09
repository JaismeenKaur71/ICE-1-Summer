/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama
 * @modifier Jaismeen Kaur
 *StudentNumber-991632196
 *
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random randomlygenerated= new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
             c.setValue(randomlygenerated.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[randomlygenerated.nextInt(4)]);
            magicHand[i]=c;
        }
        for(int i=0;i<magicHand.length;i++){
            System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Card Cardobj=new Card();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the value of card in between 1-13: ");
        int cardValue = sc.nextInt();
        System.out.println("Please enter a suit type- diamonds, spades, hearts, club");
        String suitType =sc.next();
        Cardobj.setValue(cardValue);
        Cardobj.setSuit(suitType);
        
        Card LuckyCard= new Card();
        LuckyCard.setValue(4);
        LuckyCard.setSuit(Card.SUIT[3]);
         boolean matchToBeConfirmed=false;
        for(int i=0; i<magicHand.length;i++)
        {
            matchToBeConfirmed=(magicHand[i].getValue()==Cardobj.getValue()&&magicHand[i].getSuit().equalsIgnoreCase(Cardobj.getSuit()));
            if(matchToBeConfirmed==true)
            {
                break;
            }
        }
        if(matchToBeConfirmed)
            System.out.println("Congractulations, you matched the card!");
            else
                System.out.println("Sorry, no match!!");
            
        }
    }
    

