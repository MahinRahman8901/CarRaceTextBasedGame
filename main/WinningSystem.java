class WinningSystem extends BettingSystem{//this class is a subclass of bettingsystem
    private boolean Champion;//new variable thats a boolean that chceks which car won the race
    private double  winnings;//checks the winnings
    private double losses;//checks the losses
    public WinningSystem(double bet, String name, Double winnings, Double losses, boolean Champion) {
        super(bet, name);//initalising all the variables
        this.winnings = winnings;
        this.losses = losses;
        this.Champion = false;
    }

    public void setWinnings(int newWinnings){//setter method for winnings
        winnings = newWinnings;
    }

    public void setLosses(int newLosses){//setter method for the losses
        losses = newLosses;
    }

    public double getWinnings(){//getter method for the winnings
        return winnings;
    }
    
    public double getLosses(){//getter method for the losses
        return losses;
    }
    
    public void MercWin(){ 
        winnings = bet*11;//if the mercedes wins then it will multiply the bet by "x" amount depending on the betting odds 
        System.out.println("Congratulations your bet was on the money!");
        System.out.println("Your Returns are " + winnings); //displays the returns they have made on their bet
    }

    public void BMWWin(){
        winnings = bet*9;//if the BMW wins then it will multiply the bet by "x" amount depending on the betting odds 
        System.out.println("Congratulations your bet was on the money!");
        System.out.println("Your Returns are " + winnings);//displays the returns they have made on their bet
    }

    public void FordWin(){
        winnings = bet*7;//if the Ford wins then it will multiply the bet by "x" amount depending on the betting odds 
        System.out.println("Congratulations your bet was on the money!");
        System.out.println("Your Returns are " + winnings);//displays the returns they have made on their bet
    }
    
    @Override
    public double getMoney(){ //Overrides the get money once again but this time 
        double total;
        total = super.getMoney() + getWinnings();//it caluclates the total amount that has been won after adding the winnings to the original amount in the users account from the super class
        return total;//returns the new total
    }
    
        @Override
    public boolean setChampion(){//setter method for the champion
        boolean newChamp;
        Champion = true;//if the car is set as a champion it will return true rather than false
        newChamp = Champion;
        return newChamp;
    }


}