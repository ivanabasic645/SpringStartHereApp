package service;

import org.springframework.stereotype.Service;
import model.*;
import java.util.ArrayList;

@Service
public class ProductService {

	private ArrayList<Product> products = new ArrayList<>();

	public void addProduct(Product p) {
		products.add(p);
	}

	public ArrayList<Product> findAll() {
		return products;
	}

}
