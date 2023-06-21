package designPatter.abstarctFactory;

public class ModernFactory implements abstractFactory {

	public chair createChair(){
		return new ModernChair();
	}
	public sofa createSofa(){
		return new ModernSofa();
	}
	public table createTable(){
		return new ModernTable();
	}
}
