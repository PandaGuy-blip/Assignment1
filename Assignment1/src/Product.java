
/***
 * Johnson Seto
 * 20116600
 * COMP503/10
 * Programming Assignment Part A 
 * 
 * Product Class
 * Set the Product's names and attributes 
 * Create a Reliable Rate Method 
 * Create a toString for OnlineShop
 */

//- Model name (e.g. “T-800”) 
//- Manufacturer’s name (e.g. “Cyberdyne Systems”) 
//- Retail price (as a double value) 
//- Overall rating (‘A’, ‘B’, ‘C’, ‘D’, or ‘F’) 
//- Reliability rating, based on aggregated consumer ratings, a double number between 0.0 and 
//5.0 
//- The number of consumers who have rated the product 

public class Product {
	private String Model_Name;
	private String Manufacturer_Name;
	private double Retail_Price;
	private char Overall;
	private double Reliable_Rating;
	private int num_consumers;
//Model Name
	public String getModel_Name() {
		return Model_Name;
	}
	public void setModel_Name(String model_Name) {
		Model_Name = model_Name;
	}
//Manufacturer Name
	public String getManufacturer_Name() {
		return Manufacturer_Name;
	}
	public void setManufacturer_Name(String manufacturer_Name) {
		Manufacturer_Name = manufacturer_Name;
	}
//Retail Price
	public double getRetail_Price() {
		return Retail_Price;
	}
	public void setRetail_Price(double retail_Price) {
		Retail_Price = retail_Price;
	}
//Overall
	public char getOverall() {
		return Overall;
	}
	public void setOverall(char overall) {
		if(overall >= 'A' && overall <= 'F')
		{
			this.Overall = overall;
		}
	}
//Reliable Rating
	public double getReliable_Rating() {
		return Reliable_Rating;
	}
	public void setReliable_Rating(double Reliable_Rating) {
		if(Reliable_Rating >= 0 && Reliable_Rating <= 5)
		{
			this.Reliable_Rating = Reliable_Rating;
		}
	}
//Consumers 
	public int getNum_consumers() {
		return num_consumers;
	}
	public void setNum_consumers(int num_consumers) {
		this.num_consumers = num_consumers;
	}
	
//Constructor 1
	public Product(String Model_Name, String Manufacturer_Name, double Retail_Price,
	char Overall, double Reliable_Rating, int num_consumers) 
	{
		this.Model_Name = Model_Name;
		this.Manufacturer_Name = Manufacturer_Name;
		this.Retail_Price = Retail_Price;
		this.Overall = Overall;
		this.Reliable_Rating = Reliable_Rating;
		this.num_consumers = num_consumers;
	}
//Constructor 2
	public Product(String Model_Name, String Manufacturer_Name)
	{
		this.Model_Name = Model_Name;
		this.Manufacturer_Name = Manufacturer_Name;
		this.Retail_Price = 1800;
		this.Overall = 'B';
		this.Reliable_Rating = 3.6;
		this.num_consumers = 80;
	}
//toString 
	public String toString()
	{
		return "Model Name: " +this.Model_Name+ " Manufacturer Name: " +this.Manufacturer_Name+
				" Retail Price: " +this.Retail_Price+ " Overall: " +this.Overall+
				" Reliable Rating: " +this.Reliable_Rating+ " Out of: " +this.num_consumers;
	}
	
//rateReliability  method
	public void rateReliability(double new_reliable) 
	{
		int new_consumers = this.num_consumers + 1;
		new_reliable = (this.Reliable_Rating * this.num_consumers + 1.0)/ new_consumers;
		this.Reliable_Rating = new_reliable;
		this.num_consumers = new_consumers;
	}

}

