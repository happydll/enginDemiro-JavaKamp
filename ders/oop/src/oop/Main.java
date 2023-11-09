package oop;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product();
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(2);
		product1.setImgUrl("image1.jpg");

		
		Product product2 = new Product();

		product1.setName("Smeg Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(2);
		product1.setUnitsInStock(10);
		product1.setImgUrl("image2.jpg");
		
		Product product3 = new Product();
		
		product3.setName("Kitchen aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(4);
		product3.setImgUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndvidualCustomer indvidualCustomer = new IndvidualCustomer();
		indvidualCustomer.setId(1);
		indvidualCustomer.setPhoneNumber("052558555771");
		indvidualCustomer.setCustomerNumber("12456");
		indvidualCustomer.setFirstName("Ali");
		indvidualCustomer.setLastName("Yılmaz");
		
		CorporeteCustomer corporeteCustomer = new CorporeteCustomer();
		corporeteCustomer.setId(2);
		corporeteCustomer.setCompanyName("Ecorp");
		corporeteCustomer.setPhoneNumber("05366666666");
		corporeteCustomer.setTaxNumber("1256975699");
		corporeteCustomer.setCustomerNumber("12568699");
		
		Customer[] customer = {corporeteCustomer, indvidualCustomer};
		
		
		
		
	}

}
