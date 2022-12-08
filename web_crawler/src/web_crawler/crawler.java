package web_crawler;

public class crawler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.amazon.in/New-Apple-iPhone-12-128GB/dp/B08L5TNJHG/ref=sr_1_3?crid=4LIZI4NL6MGJ&keywords=iphone&qid=1670137179&sprefix=iphone%2Caps%2C253&sr=8-3";
		
		Connection con = Jsoup.connect(url);

	}

}
