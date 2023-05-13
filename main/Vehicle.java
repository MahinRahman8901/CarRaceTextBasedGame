import java.nio.file.WatchService;
import java.util.Scanner;
class Vehicle{
    private String type; //variable called type
    private String make; //variable called make
    
    public Vehicle(String type, String make){
        this.type = type; //initialises the type and make in the super class
        this.make = make;
    }

    public String getType(){ //getter method for type
        return type;
    }

    public String getMake(){ //getter method for make
        return make;
    }

    public void newMake(String secondMake){ //setter method for make
        make = secondMake;
    }
    public void carStats(){
        System.out.println(""); //used to be overriden in later sections of he code
    }

	public int getHorsepower() { //overriden in later parts of code
		return 0;
	}

    public void changeOverHeat() { //overriden in later parts of code
        //Empty
    }

    public void getHeatStatus() { //overriden in later parts of code
        //Empty 
    }
}
    