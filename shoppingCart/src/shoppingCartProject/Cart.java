package shoppingCartProject;


import java.util.ArrayList;

public class Cart {

	//Cart Data Structure
	private ArrayList<String> shoppingCart = new ArrayList<>(); 
	private ArrayList<Product> shopCart = new ArrayList<>(); 
	
	//Methods for Cart Class
	
	//Add Products to Cart
	public void addToCart(Product product) {
		shopCart.add(product);
	}
	public void addToCart(Product product, int quantity) {
		shopCart.add(product);
	}
	
	//Get the number of Products in shopping Cart
	public int getCartLength() {
		return shopCart.size();
		
	}
	
	//Delete Products from Cart
	public Product deleteProduct() {
	return shopCart.remove(getCartLength());	
	}
	
	//Update Products in the Cart
	public Product updateProduct() {
		if (shopCart.isEmpty()) {
			System.out.println("Your cart doesn't have a product");	
		} else {
			
			for (int i = 0; i < shopCart.size(); i++ ) {
				
				System.out.println("Product " + (i+1) + "" + shopCart.get(i).getProdName() + "" + "has been replaced");
				
			}
		}
		return shopCart.set(getCartLength(), null);
	}
//		

	
	//View all Products in the Cart
	public void showAllProducts() {
		
		if (shopCart.isEmpty())
		{
			System.out.println("Your Cart is Empty.");
		}
		else
		{
			for(int i=0; i < shopCart.size(); i++)
			{
				System.out.println("Product - " + (i+1) + " " + shopCart.get(i).getProdName());
			}
		}	
	}
	
	//Cart Total Method
	public void cartTotal()
	{
		int cartTotal = 0;
		for(int i=0; i < shopCart.size(); i++)
		{	
			cartTotal =  shopCart.get(i).getPrice() + cartTotal;
		}
		System.out.println("Total Cart - " + cartTotal);
	}
	
	//Empty all Products in the Cart
	
	
}