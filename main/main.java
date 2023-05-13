import java.nio.file.WatchService;
import java.util.Scanner;

class main {

    
   public static void main(String[] args) throws InterruptedException {
       System.out.println("==========================================="); //Display Gui for the game
       System.out.println("Welcome to the Drag Race");
       System.out.println("===========================================");
       System.out.println("");

       System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------"); 
       System.out.println("This is a game of choice and the choice YOU make will affect the odds of the game! Please follow the instructions in () to play the game... ");//Display Gui for the game
       System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------"); 

       System.out.println("");

       Player a = new Player("", 0); //Creats a new object called player
       a.setName();//sets the name of the player by asking name 
       a.setMoney();//sets the player to have £1000

       System.out.println("");

       System.out.println("Your Current Total Money Available to you" + a.getName() + " is £" + a.getMoney()); //displays how much money is in the current account of player

       System.out.println("");

        System.out.println("Here is the Track!");
        System.out.println("S                                      F");
        System.out.println("T BMW ---------------------------------I");//Display Gui for the game
        System.out.println("A MERCEDES ----------------------------N");//Display Gui for the game
        System.out.println("R FORD --------------------------------A");//Display Gui for the game
        System.out.println("T                                      L");

        Vehicle c = new Mercedes("AMG GT", "Mercedes ", 450); //Creates a new vehicle of type Mercedes AMG GT with Horespower 450
        System.out.println("Would you like to see the Mercedes Stats? (yes/no)");//asks the user if they want to view the stats of the mercedes
        Scanner keyboard = new Scanner(System.in);//takes user input
        String checkstats = keyboard.nextLine();//checks the input
        if (checkstats.equals("yes")){//if the input is equal to yes then it displays the stats of the car else it will move on to the next question.
            c.carStats(); 
        }

        Vehicle b = new BMW("M4", "BMW ", 370);//Creates a new vehicle of type BMW M4 with 380 horsepower base
        System.out.println("Would you like to see the BMW Stats? (yes/no)");//asks the user if they want to view the stats of the BMW
        String checkstats2 = keyboard.nextLine();//takes user input
        if (checkstats2.equals("yes")){//checks the input
            b.carStats(); //if the input is equal to yes then it displays the stats of the car else it will move on to the next question
        }

        System.out.println("Would you like to change the Heat Status of the car [Inc Horsepower]? (yes/no)");//asks user if they want to change the heat status of the car
        String overheatcheck = keyboard.nextLine();//takes user input
        if (overheatcheck.equals("yes")){//checks the input
            b.changeOverHeat(); //if they say yes then it changes the overheat to true and therefore adds horsepower to the vehicle. 
            b.getHeatStatus();//Shows user that it has been changed
            b.carStats();
        }
        
        Ford f = new Ford("Mustang", "Ford ", 300);//Creates a new vehicle of type Ford Mustang with 300 horsepower base
        System.out.println("Would you like to see the Ford Stats? (yes/no)" );//asks the user if they want to view the stats of the Ford
        String checkstats3 = keyboard.nextLine();//takes user input
        if (checkstats3.equals("yes")){//checks the input
            f.carStats(); //if the input is equal to yes then it displays the stats of the car else it will move on to the next question
        }
        System.out.println("Would you like to add an exhaust mod to the Mustang [Inc Horsepower]?  (yes/no)" );//asks user if they want to add the modification to the car
        String newmod = keyboard.nextLine();//takes user input
        if (newmod.equals("yes")){//checks the input
            f.setModification();//if they say yes then it sets the mod onto the car and then increases the horsepower
            f.getModification();//gets the modification
        }
        System.out.println("The current Odds are....");
        Thread.sleep(1500);


        System.out.println("Mercedes to win = 11/1");//Displays the odds for the user to choose
        System.out.println("BMW to win = 9/1");
        System.out.println("Ford to win 7/1");

        System.out.println("Who Would You Like To Bet On! (mercedes/bmw/ford)");//Asks user who they would like to bet on
        String Answer = keyboard.nextLine();//takes user input
        if (Answer.equals("mercedes")){//checks input
            System.out.println("You Have Chosen Merecedes");//displays the users choice
        }
        else if (Answer.equals("bmw")){//checks input
            System.out.println("You Have Chosen BMW");//displays the users choice
        }
        else if (Answer.equals("ford")){//checks input
            System.out.println("You Have Chosen Ford");//displays the users choice
        }
        else{
            System.out.println("This is an invalid Car Type Please Try Again!");//if they dont enter the right one then the game will say incorrect car type
        }

        
        System.out.println("How much would you like to bet?");//asks user how much they want to bet
        System.out.println("To view current total in bank type (yes) or (no) to continue and place your bet");//lets user check their bet
        String Answer1 = keyboard.nextLine();//checks input
        if (Answer1.equals("yes")){//checks input
            System.out.println("You Have £" +a.getMoney());//if they say yes it will show the money from the superclass which is just the total amount in the account
            System.out.println("Enter Bet Amount: ");//lets user enter bet amount
        }
        else{
            System.out.println("Enter Bet Amount");//lets user enter bet amount
        }

        

        Scanner scan = new Scanner(System.in);//creates a scanner for an input
        int numofbet = scan.nextInt();//stores the int value of the bet inside numofbet
        Player a2 = new BettingSystem(numofbet, a.getName());//creates a player of type betting system
        BettingSystem a3 = new WinningSystem(numofbet, a.getName(), 0.0, 0.0, false);//creates a bettingsystem of type winningsystem

        if (numofbet>a.getMoney()){//if the users inputted amount is > then what they have in their account 
            System.out.println("Error: Insufficient Funds");//will display this error 
        }
        System.out.println("You have bet £" +numofbet);//Otherwise it will display the amount of the bet
        System.out.println("Your Current Total in account remaining is £" + a2.getMoney());//will display the overriden calss which is the totalmoney deducting the bet amount

        
        System.out.println("To begin the Race Type: (x)"); //user enters x to begin the race
        String beginrace = keyboard.nextLine();//checks input
        if (beginrace.equals("x")){
            System.out.println("The Race will begin in ");
            System.out.println("3");
            Thread.sleep(1000);//this waits 1000ms between the two outputs to create the effect of seconds
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("GOOO!!!!");
            
        }

        //===========================Commentary==========================================================
        Thread.sleep(1000);
        System.out.println("Commentator: They all start equal, but mercedes takes a quick corner and steams into pole position");
        Thread.sleep(1200);
        System.out.println("Commentator: But watch out, Ford is steady on his tracks and looking for an opportunity to take the lead");
        Thread.sleep(1100);
        System.out.println("Commentator: Lets hope BMW can mount a huge comeback and take overtake BMW in second place");
        Thread.sleep(1200);
        System.out.println("Commentator: Ouuuf! that was a poor corner from the Mercedes Team and now both second and third have caught up in the final straigh");
        Thread.sleep(1300);
        System.out.println("Commentator: The BMW is starting to smoke a little bit...");
        if (((BMW) b).returnHeat() == false) {//checks if the user added the overheat if they didnt then thge output below will be displayed
            System.out.println("Commentator: The Overheating issue may play a factor in this race");
        }
        Thread.sleep(1300);
        System.out.println("Commentator: We are into the final Stretch, who will take the edge!");

        if (c.getHorsepower() > b.getHorsepower() && c.getHorsepower() > f.getHorsepower()){//checks if the horsepower of the mercedes is greater than the other cars, if it is then the mercedes wins
            System.out.println("Commentator: Mercedes Takes the Lead");
            Thread.sleep(1200);
            System.out.println("Mercedes has taken Pole Position");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("                 --1st--                ");
            System.out.println("                 Mercedes               ");
            System.out.println("     --2nd--                            ");
            System.out.println("       BMW                   --Third--  ");
            System.out.println("                               Ford     ");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");

            if (Answer.equals("mercedes")){ //when the bet was made if the user originally chose to enter mercedes
                a3.setChampion();//then mercedes is set champion
                ((WinningSystem) a3).MercWin();//and it will run the mercwin method
                System.out.println("Your Total Amount in Account is £" + a3.getMoney());//this is the third overriden method of getmoney and it will return the winnings from odds and add it onto the total amounnt remaining in the balance of the user
            }
            else{
                System.out.println("Ahhhh shoot!, Maybe next time buddy");
                System.out.println("Sadly You have lost £" + ((BettingSystem) a2).getBetAmount());//if the user didnt choose BMW then it will show how much they have lost by returning the bet total
                System.out.println("Your Total Amount in Account is £" + a2.getMoney());//will deduct the bet from the total balance and will display it
                
            }

        }
        else if (b.getHorsepower() > c.getHorsepower() && b.getHorsepower() > f.getHorsepower()){//checks if the horsepower of the BMW is greater than the other cars, if it is then the BMW wins
            System.out.println("Commentator: BMW Storms in front!");
            Thread.sleep(1200);
            System.out.println("BMW has taken Pole Position");                  //Disply GUI
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("                 --1st--                ");
            System.out.println("                   BMW                  ");
            System.out.println("     --2nd--                            ");
            System.out.println("      Ford                   --Third--  ");
            System.out.println("                              Mercedes  ");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");

            if (Answer.equals("bmw")){
                a3.setChampion();//when the bet was made if the user originally chose to enter BMW
                ((WinningSystem) a3).BMWWin();//then BMW is set champion and BMWWin() will run
                System.out.println("Your Total Amount in Account is £" + a3.getMoney());//this is the third overriden method of getmoney and it will return the winnings from odds and add it onto the total amounnt remaining in the balance of the user
            }
            else{
                System.out.println("Ahhhh shoot!, Maybe next time buddy");
                System.out.println("Sadly You have lost £" + ((BettingSystem) a2).getBetAmount());//if the user didnt choose BMW then it will show how much they have lost by returning the bet total
                System.out.println("Your Total Amount in Account is £" + a2.getMoney());//will deduct the bet from the total balance and will display it
            }
            
        }
        else if(f.getHorsepower() > b.getHorsepower() && f.getHorsepower() > c.getHorsepower()){//checks if the horsepower of the Ford is greater than the other cars, if it is then the Ford wins
            
            if (f.checkmod = true){
                System.out.println("Commentator: That Mod really has given them the edge");
            }
            System.out.println("Commentator: Ford has gone straight to the top");
            Thread.sleep(1200);
            System.out.println("They've won it at the death!");             //Display GUI
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("                 --1st--                ");
            System.out.println("                  Ford                  ");
            System.out.println("     --2nd--                            ");
            System.out.println("       BMW                   --Third--  ");
            System.out.println("                              Mercedes  ");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");

            if (Answer.equals("ford")){
                a3.setChampion();//when the bet was made if the user originally chose to enter Ford
                ((WinningSystem) a3).FordWin();//then BMW is set champion and fordwin() will run 
                System.out.println("Your Total Amount in Account is £" + a3.getMoney());//this is the third overriden method of getmoney and it will return the winnings from odds and add it onto the total amounnt remaining in the balance of the user
            }
            else{
                System.out.println("Ahhhh shoot!, Maybe next time buddy");
                System.out.println("Sadly You have lost £" + ((BettingSystem) a2).getBetAmount());//if the user didnt choose BMW then it will show how much they have lost by returning the bet total
                System.out.println("Your Total Amount in Account is £" + a2.getMoney());//will deduct the bet from the total balance and will display it
            }
            


        }



            
    }
}       