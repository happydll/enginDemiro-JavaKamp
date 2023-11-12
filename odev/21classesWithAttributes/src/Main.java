
public class Main {

	public static void main(String[] args) {

		Product product = new Product();

		product.setId(1);
		product.setName("Asus Zephyrus g14");
		product.setDescription("güzel pc");
		product.setPrice(40000);
		product.setStockAmount(15);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Asus K55V");
		product2.setDescription("iyi pc");
		product2.setPrice(15000);
		product2.setStockAmount(5);

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.add(product2);

		System.out.println(product.getKod());
	}

}
