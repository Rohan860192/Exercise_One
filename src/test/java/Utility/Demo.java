package Utility;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		
		
		ReadConfig conf = new ReadConfig();
		String url = conf.get_AppURL();
		
		System.out.println(url);

	}

}
