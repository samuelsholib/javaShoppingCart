package shoppingCartProject;

public class HomePage {



	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cart antonioCart = new Cart();
			Product nike = new Product();
			nike.setProdName("Nike Shoes");
			nike.setPrice(100);
			
			Product chanel = new Product();
			chanel.setProdName("Chanel Perfume");
			chanel.setPrice(300);
			
			Product iphone = new Product();
			iphone.setProdName("iPhone");
			iphone.setPrice(1200);
		
		
		antonioCart.addToCart(nike);
		antonioCart.addToCart(chanel);
		antonioCart.addToCart(iphone);
		antonioCart.addToCart(iphone);
		
		System.out.println("Number of Products in Cart - " + antonioCart.getCartLength());
		System.out.println();
		antonioCart.showAllProducts();
		antonioCart.cartTotal();

	}

}