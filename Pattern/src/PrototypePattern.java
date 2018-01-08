
public class PrototypePattern implements Cloneable{
	
	public PrototypePattern clone(){
		PrototypePattern prototype = null;
		
		try {
			prototype = (PrototypePattern)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return prototype;
	}
	
	
	public void show(){
		System.out.println("prototype father");
	}
	
	
}



class ConcretePrototype extends PrototypePattern{
	
	public void show(){
		System.out.println("prototype son");
	}
	
}

//class Client{
//	
//	public static void main(String args[]){
//		
//		ConcretePrototype c = new ConcretePrototype();
//		
//		for(int i = 0 ; i < 10 ; i ++){
//			ConcretePrototype cp = (ConcretePrototype)c.clone();
//			cp.show();
//		}
//		
//		
//		PrototypePattern p = new PrototypePattern();
//		
//		for(int i = 0 ; i < 10 ; i ++){
//			PrototypePattern pt = p.clone();
//			pt.show();
//		}
//		
//	}
//	
//}