class Mercedes extends Vehicle{ //mercedes is an subclass of vehicle but also implements the interface
    private int horsepower; //introduces new variable called horsepower
    
    public Mercedes(String type, String make, int horsepower) {
        super(type, make); //initialises the variables of the super class
        this.horsepower = horsepower;//initialises the variable in
    }

    public void sethorsepower(int newHorsePower){ //setter method for the vehicle
        this.horsepower = newHorsePower;
    }

    public int getHorsepower() {//getter method for the vehicle
        return horsepower;
    }

    @Override
    public void carStats() {
        System.out.println("Status: The Car is has a horsepower rating of " + getHorsepower() +" and model is " + super.getMake() + super.getType()); //gets the super type of the car make and type and implements it in this
    }

}