import java.util.Scanner;

class Player{ //new class called Player
    private String name;//string variable for the name of the player
    private double money;//a type of double that checks the account of the player

    public Player (String name, double money){
        this.name = name; //initalises the variable
        this.money =money;
    }

    public void setMoney(){//setter method that makes it so that the player starts with £1000
        this.money = 1000;
    }

    public void setName(){ //setname method takes takes user input and displays their name
       System.out.println("Welcome Player, What is your Name?");
       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();
       System.out.println("Hello " + name + " Welcome to Race Day");

    }

    public double getMoney(){//getter method for the money
        return money;
    }

    public String getName(){//getter method for the name of the user
        return name;
    }
}