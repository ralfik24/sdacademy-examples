package pl.sdacademy.thread.concurrency;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationExample {
	public static void main(String[] args)throws InterruptedException {


		class ProductCatalog {
			private List<String> products;

			public ProductCatalog() {
				products = new ArrayList<>();

			}

			void addProducts(String newProducts) {
				products.add(newProducts);
			}

			void removeProducts() {

			}
		}
	}
}



