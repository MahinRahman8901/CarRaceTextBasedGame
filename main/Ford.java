class Ford extends Vehicle{ //ford is a subclass of vehicle
    private int horsepower;
    boolean checkmod;//a boolean type to check if the user wants the modification
    private int exhaustmod;//the modification

    public Ford(String type, String make, int horsepower) {
        super(type, make);
        this.horsepower = horsepower;
    }

    public boolean setModification() {
        return checkmod = true;//setter method for checkmod
    }

    public void getModification() {//getter method for mod
        if (checkmod = true) {
            System.out.println("Status: Exhaust Modded has been added to Ford");//if the user adds a modification then it increases the horsepower of the vehicle
            exhaustmod = 150;
            horsepower = horsepower + exhaustmod;//adds the new amount of horsepower
            System.out.println("Status: Updated Horsepower..");
        }
    }

    @Override
    public int getHorsepower() {//getter method for the horsepower
        return horsepower;
    }
    @Override
    public void carStats() {
        System.out.println("Status: The Car is has a horsepower rating of " + getHorsepower() + " and model is " + super.getMake() + super.getType());//gets the super type of the car make and type and implements it in this and adds the new horsepower depending on players choices
    }
}