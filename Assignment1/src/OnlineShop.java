
/***
 * Johnson Seto
 * 20116600
 * COMP503/10
 * Programming Assignment Part A 
 * 
 * OnlineShop
 * Continuation of Product 
 */

public class OnlineShop {
	private Product[] inventory;
	private int nProduct;
//Inventory Set
	public OnlineShop(int n)
	{
		n = 5;
		this.inventory = new Product[n];
		this.nProduct = 0;
	}
	public OnlineShop()
	{
		this(5);
	}
//AddMethod 
	public void add(Product inventory)
	{
		if(this.nProduct < this.inventory.length)
		{
			this.inventory[nProduct] = inventory;
			this.nProduct++;
		}
	}
//toString 
	public String toString()
	{	
		String out = "";
		for(int i = 0; i < this.nProduct; i++)
		{
			out+= this.inventory[i]+"\n";
		}
		return out;
	}

//getProduct
	public Product getProduct(int i) {
        if(i >= 1 && i <=5) {
            return inventory[i - 1];
  
        }else {
            System.out.println("Invalid Inventory number");
            return null;
          
        }
    }
//Test Out Main on ShopApp
}
