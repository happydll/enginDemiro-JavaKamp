package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

	public void add(Product product) {
		//db erişim kodları buraya yazılır.. SQL
		System.out.println("Hibernate ile dbye eklendi");
	}
	
}