class BettingSystem extends Player { //this class is a subclass of Player
    protected double bet;//a new type double called bet that calculates the bet amount
    public BettingSystem(double bet, String name)
    {
        super(name, 1000);//initalises the super
        this.bet = bet;
    }

    public void setnewtBet(int newBet){//setter method for bet
        bet = newBet;
    }

    public double getBetAmount(){//getter method for the bet
        return bet;
    }

    @Override
    public double getMoney(){//overrides the getmoney so now it shows the original amount taking away the bet amount and returns the total and then returns the total
        double total;
        total = super.getMoney()-bet;
        return total;
    }

    public boolean setChampion() {//sets the champion, this will be overriden later
        return false;
    }

}