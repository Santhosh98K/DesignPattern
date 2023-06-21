package designPatter.abstarctFactory;

public class OrderApplication {

	public static void main(String[] args) {
		String input1 = "Ancient";
		String input2 = "chair";
		abstractFactory factObj = getfactory(input1) ;
		chair chairObj = factObj.createChair();
		chairObj.createChairOrder();

	}

	static abstractFactory getfactory(String input) {
		// TODO Auto-generated method stub
		if(input == "Modern")
			return new ModernFactory();
		else if(input =="Ancient") {
			return new AncientFactory();
		}
		return null;
	}

}
