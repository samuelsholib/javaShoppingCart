package shoppingCartProject;

public class HomePage {



	

	public static void main(String[] args) {
		
		ShoppingCart samCart = new ShoppingCart();
			Product nike = new Product();
			nike.setProdName("Nike Shoes");
			nike.setPrice(100);
			
			Product chanel = new Product();
			chanel.setProdName("Chanel Perfume");
			chanel.setPrice(300);
			
			Product iphone = new Product();
			iphone.setProdName("iPhone");
			iphone.setPrice(1200);
		
		
			samCart.addToCart(nike);
			samCart.addToCart(chanel);
			samCart.addToCart(iphone);
			samCart.addToCart(iphone);
		
		System.out.println("Number of Products in Cart - " + samCart.getCartLength());
		System.out.println();
		samCart.showAllProducts();
		samCart.cartTotal();
		samCart.subTotal();

	}

}