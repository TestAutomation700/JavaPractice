package JavaPractice.JavaConcepts;


class Engine {      //parentclass
	
	void startEngine() {
		System.out.println("Engine Started");
	}
	
	void stopEngine() {
		System.out.println("Engine Stopped");
	}
}

class Truck {
	
	private Engine engine; //creating object of parent class to use the engine in truck (Composition)
	
	 Truck(Engine engine){  //passing an argument of engine to truck constructor
		 this.engine = engine;
	 }
	 
	 void driveTruck() {
		 engine.startEngine();
	 }
}

class Boat {
	
	private Engine engine;
	
	Boat(Engine engine) {
		this.engine=engine;
	}
	
	void driveBoat() {
		engine.startEngine();
	}
}

public class Inheritance_HASA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//creating truckEngine and boatEngine instance
        Engine truckEngine = new Engine();
        Engine boatEngine = new Engine();

        Boat boat = new Boat(boatEngine);
        Truck truck = new Truck(truckEngine);
        
        boat.driveBoat();
        truck.driveTruck();
        
        
		

	}

}
