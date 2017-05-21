package app;

public class Toode implements Calculator{

	int amount;
	double price;
	String name;

	public Toode(String name, int amount, double price){
		
		this.name = name;
		this.amount = amount;
		this.price = price;
	
	}
	public void increment(){
	
		this.amount = this.amount+1;
	
	}
	public double sum(){
	
		return this.amount*price;
		
	}
	public String getName(){
	
		return this.name;
	}
	@Override
	public String toString(){

		return "Number of "+this.name+"s: "+this.amount+". Price for one: "+price+". Sum: "+sum();
	
	}
	
}