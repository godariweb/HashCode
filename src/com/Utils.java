package com;

import java.lang.reflect.Array;
import java.util.ArrayList;

import models.Product;

public class Utils {
  public static int getNumberOfProduct(ArrayList<Product> products, int type) {
	  int counter = 0;
	  for(Product product : products) {
		  if (product.getType() == type) {
			  counter++;
		  }
	  }
	  
	  return counter;
  }
  
  public static void removeProducts(ArrayList<Product> products, int type, int numberOfProducts ) {
	  int i = 0;
	  for(i =0;  i < products.size(); i++) {
		  if (products.get(i).getType() == type) {
			  numberOfProducts--;
			  products.remove(i);	
		  }
		  if(numberOfProducts == 0) {
			  break;
		  }
	  }
  }
}
