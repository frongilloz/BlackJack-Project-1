
import java.util.Scanner;
import java.util.Random;
public class Project1V2
{
    //private int randCardNamNum = 0;
    //private String cardName = "";
    /*
    public String cardNames(int randCardNamNum, String cardName) {
    {

    }


    public newGame(int totalGames, int selection)
    {
        Scanner scnr = new Scanner(System.in);
        Random randCard = new Random();
        int firstCard = randCard.nextInt(13) + 1; // +1 for min and max is exclusive
        String cardName = "";
        System.out.println("START GAME #" + totalGames);
        System.out.println("Your card is a " + cardName + "!");
        System.out.println("");
        System.out.println("1. Get another card");
        System.out.println("2. Hold hand");
        System.out.println("3. Print game statistics");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.print("\nChoose an option (1-4): ");
        selection = scnr.nextInt();
    }
*/



    public static void main(String args[])
    {
        //Start
        //generate first hand
        int totalHand = 0;
        int dealerHand = 0;
        int playerWins = 0;
        int dealerWins =0;
        int numTies = 0;
        Scanner scnr = new Scanner(System.in);
        Random randCard = new Random();
        int firstCard = randCard.nextInt(13) + 1; // +1 for min and max


        //NEED TO DEBUG RAND NUM GENERATOR TO MAKE SURE IT CANT HIT 14
        //then DF to change it agian in the loop below


        int totalGames = 1;

        //names
        //int randCardNamNum = firstCard;
        String cardName = "";
        switch (firstCard) {
            case 1:
                cardName = "ACE";
                break;
            case 2:
                cardName = "2";
                break;
            case 3:
                cardName = "3";
                break;
            case 4:
                cardName = "4";
                break;
            case 5:
                cardName = "5";
                break;
            case 6:
                cardName = "6";
                break;
            case 7:
                cardName = "7";
                break;
            case 8:
                cardName = "8";
                break;
            case 9:
                cardName = "9";
                break;
            case 10:
                cardName = "10";
                break;
            case 11:
                cardName = "JACK";
                break;
            case 12:
                cardName = "QUEEN";
                break;
            case 13:
                cardName = "KING";
                break;
        }


        //card values
        // KING, QUEEN, JACK
        int randCardNum = firstCard;
        if (randCardNum == 11)
        {
            firstCard = 10;
        } else if (randCardNum == 12)
        {
            firstCard = 10;
        } else if (randCardNum == 13)
        {
            firstCard = 10;
        }
        //print
        System.out.println("START GAME #1");
        System.out.println("Your card is a " + cardName + "!");
        totalHand = totalHand + firstCard;  //CALC total hand
        System.out.println("Your hand is: " + totalHand);
        System.out.println("");
        System.out.println("1. Get another card");
        System.out.println("2. Hold hand");
        System.out.println("3. Print game statistics");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.print("Choose an option: ");
        int selection = scnr.nextInt();



        while ( !(selection == 4))
        {
            //prevent invalid options
            while ( ( selection < 1 ) || (selection > 4) )
            {
                System.out.println("Invalid input! \n Please enter an integer value between 1 and 4.");
                System.out.println("");
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print game statistics");
                System.out.println("4. Exit");
                System.out.println("");
                System.out.print("Choose an option: ");
                selection = scnr.nextInt();
            }

            //SELECTION 1
            if (selection == 1)
            {
                //System.out.println("1");
                //generate new card
                int newCard = randCard.nextInt( 13 ) + 1;

                //print names of cards
                String cardName2 = "";
                switch (newCard) {
                    case 1:
                        cardName2 = "ACE";
                        break;
                    case 2:
                        cardName2 = "2";
                        break;
                    case 3:
                        cardName2 = "3";
                        break;
                    case 4:
                        cardName2 = "4";
                        break;
                    case 5:
                        cardName2 = "5";
                        break;
                    case 6:
                        cardName2 = "6";
                        break;
                    case 7:
                        cardName2 = "7";
                        break;
                    case 8:
                        cardName2 = "8";
                        break;
                    case 9:
                        cardName2 = "9";
                        break;
                    case 10:
                        cardName2 = "10";
                        break;
                    case 11:
                        cardName2 = "JACK";
                        break;
                    case 12:
                        cardName2 = "QUEEN";
                        break;
                    case 13:
                        cardName2 = "KING";
                        break;
                }


                //card values
                // KING, QUEEN, JACK
                int randCardNum2 = newCard;
                if (newCard == 11)
                {
                    randCardNum2 = 10;
                }
                else if (newCard == 12)
                {
                    randCardNum2 = 10;
                }
                else if (newCard == 13)
                {
                    randCardNum2 = 10;
                }


                //selection 1 scenarios
                if (totalHand == 21)
                {
                    System.out.println("BLACKJACK! You win!");
                    playerWins++;
                    totalGames++;
                    System.out.println("START GAME #" + totalGames);
                }
                else if (totalHand > 21)
                {
                    System.out.println("You exceeded 21!  Your lose :(");
                    dealerWins++;
                    totalGames++;
                    System.out.println("START GAME #" + totalGames);
                }
                else if (totalHand < 21)
                {
                    System.out.println("");
                    System.out.println("Your card is a " + cardName2 + "!");
                    totalHand = totalHand + randCardNum2;
                    System.out.println("Your hand is: " + totalHand);
                }   //NEED TO RE ARRANGE, OUTPUT IS STILL PRINTING MENU WHEN CARDS EXCEED 21 AND PLAYER SHOULD LOSO



            } //end of selction 1

            //SELECTION 2
            if (selection == 2)
            {
                //generate new card for Dealer
                int dealerCard = randCard.nextInt((26 - 16) +1 ) + 16;
                System.out.println("Dealer's hand: " + dealerCard);  //check to see if rand variable randCard interfers with original randCard for player

                if (dealerCard == 21)
                {
                    System.out.println("Dealer Won Blackjack!");
                    dealerWins++;
                    totalGames++;
                }
                else if (dealerCard > 21 )
                {
                    System.out.println("Dealer's hand exceeded 21, You win!");
                    playerWins++;
                    totalGames++;
                }
                else if (dealerCard == totalHand)
                {
                    System.out.println("It's a tie!  No one wins!");
                    numTies++;
                }
                else    //ending round, CHECK instructions to confirm the game rules are correct
                {
                    if (dealerCard > totalHand)
                    {
                        System.out.println("Dealer wins!");
                        dealerWins++;
                        totalGames++;
                    }
                    else if (dealerCard < totalHand)
                    {
                        System.out.println("You win!");
                        playerWins++;
                        totalGames++;
                    }
                }



            }   //end of selection 2

            //SELECTION 3
            if (selection == 3)
            {
                /*
                System.out.println("");
                System.out.println("START GAME #" + totalGames);
                System.out.println("Your card is a " + cardName + "!");
                */
                System.out.println("");
                System.out.println("FOR DEBUG TOTALGAMES: " + totalGames);
                System.out.println("Number of games won for Player: " + playerWins);
                System.out.println("Number of games won for Dealer: " + dealerWins);
                System.out.println("Number of games tied: " + numTies);  //need to define ties varibale and calculate
                // *EXCLUDE, BACKUP ONLY* System.out.println("Percentage of player wins: " + playerWins / totalGames);
                double percentageOfPlayer = playerWins / totalGames;
                System.out.printf(" Percentage of Player Wins %1.1f \n" , percentageOfPlayer);

            }   //end of selection 3

            //User input for re-entry

            System.out.println("");
            System.out.println("1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print game statistics");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("\nChoose an option (1-4): ");
            selection = scnr.nextInt();


    }

        if (selection == 4)
        {
            System.out.println("Thank you for playing.  We will exit now.");
        }

    }

}
