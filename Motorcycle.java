public class Motorcycle extends Vehicle
{
	private Engine myEngine;
	private double money;
	private double fuel;
	private int passengers;
	private double cargo;
	private int tires;
	private double odometer;
	private double forwardProgress;
	private double weight;
	
	public Motorcycle()
	{
		this(new Engine(2, 200));
	}
	
	public Motorcycle(Engine e)
	{
		this(e, 3.0, 1, 50.0, 2, 750.0);
	}
	
	public Motorcycle(Engine e, double f , int  passengers, double cargo, int tires, double baseWeight)
	{
		this.myEngine = e;
		this.money = 2000;
		this.fuel = f;
		this.passengers = passengers;
		this.cargo = cargo;
		this.tires = tires;
		this.odometer = 0;
		this.forwardProgress = 0.0;
		
		weight = baseWeight + (passengers * 150) + cargo + myEngine.getWeight();
	}
	
	public Motorcycle(Passenger[] arr)
	{
		super(arr);
	}
}