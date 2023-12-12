package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{

	public void add(Product product) {
		//db erişim kodları buraya yazılır.. SQL
		System.out.println("jdbs ile dbye eklendi");
	}
}
