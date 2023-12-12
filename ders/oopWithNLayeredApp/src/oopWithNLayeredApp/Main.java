package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1,"iphone", 20000);
		
		//ProductManager productManager = new ProductManager(new JdbcProductDao());
		ProductManager productManager = new ProductManager(new HibernateProductDao());
		
		//managerin hiçbir fikri yok jdbcye mi gdecek hibernate e mi. önemli de değil
		//ProductDaou interfaceinin tutabildiği bir şey gönder de ne gönderirsen gönder
		
		productManager.add(product1);
		

	}

}
