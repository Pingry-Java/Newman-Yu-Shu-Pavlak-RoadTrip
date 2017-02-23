public class Truck extends Vehicle
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
	
	public Truck()
	{
		this(new Engine(8, 800));
	}
	
	public Truck(Engine e)
	{
		this(e, 150.0, 4, 15000.0, 16, 31000.0);
	}
	
	public Truck(Engine e, double f , int  passengers, double cargo, int tires, double baseWeight)
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
	
	public Truck(Passenger[] arr)
	{
		super(arr);
	}
}