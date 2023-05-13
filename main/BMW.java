class BMW extends Vehicle{ //bmw is a subclass of vehicle
    
    private int horsepower;
    private boolean Overheat; //introduces new variable called overheat
    
    public BMW(String type, String make, int horsepower) {
        super(type, make); //initalises super
        this.Overheat = false;//sets the overheat status to false so it does overheat
        this.horsepower = horsepower;
    }
    @Override
    public int getHorsepower() {
        return horsepower; //returns the new horsepower of a different car
    }

    public void changeOverHeat(){
        Overheat=true;  //if the user chooses to change the overheat function, its set to true
        horsepower = horsepower + 90; //this then adds more horsepower to the vehicle and makes it more likely to win the race
    }

    public void getHeatStatus(){ 
        System.out.println("Status: Does the car No Longer OverHeat: " + Overheat); //Display method to show that the heat status has changed
    }
    public boolean returnHeat(){
        return Overheat; //getter method for overheat
    }

    @Override
    public void carStats() {
        System.out.println("Status: The Car is has a horsepower rating of " + getHorsepower() +" and model is " + super.getMake() + super.getType()); //gets the super type of the car make and type and implements it in this and adds the new horsepower depending on players choices
    }
}