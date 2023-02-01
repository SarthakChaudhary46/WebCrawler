//CODE BY SARTHAK CHAUDHARY
//TO FIND PRICE AND TITLE OF AMAZON PRODUCT

import java.util.*;

import javax.management.loading.PrivateClassLoader;
import javax.print.DocFlavor.STRING;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class App {

	public static void getData()throws Exception {
 	  

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter the url: ");
			String url = sc.nextLine();
			  
			Document doc= Jsoup.connect(url).get();
			Elements element = doc.select("#titleSection");
			Elements price = doc.getElementsByClass("a-price-whole");
			Element price1 = price.get(0);
			String price2 = price1.text().replace(".", "");
		


			System.out.println("your product's title is: " + element.text());

			System.out.println("your product's price is:" + price2.replace(",", ""));
			

		}
	}

	public static void main(String[]args) throws Exception {
		System.out.println("Welcome to SOAA");
		getData();
	}

}
