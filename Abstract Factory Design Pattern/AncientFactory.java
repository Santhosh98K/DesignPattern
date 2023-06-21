package designPatter.abstarctFactory;

public class AncientFactory implements abstractFactory {

	public chair createChair(){
		
		return new AncientChair();
	}
	public sofa createSofa(){
		
		return new AncientSofa();
	}
	public table createTable(){
		
		return new AncientTable();
	}
}
