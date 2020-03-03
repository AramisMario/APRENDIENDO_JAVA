package singelton;

public class Singelton {
	private String info;
	private static Singelton singelton;
	
	private Singelton() {
		
	}
	
	public static synchronized Singelton getSingelton() {
		if(singelton == null) {
			singelton = new Singelton();
		}
	
		return singelton;
	}
	
//	public static synchronized Singelton getSingelton() {
//		 // synchronized para aplicaciones multihilo
//		if(singelton == null) {
//			singelton = new Singelton();
//		}
//		
//		return singelton;
//	}
	
	public String getInfo() {
		return this.info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	

}
