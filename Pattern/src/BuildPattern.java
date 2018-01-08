import java.util.ArrayList;


public class BuildPattern {
	
	ArrayList<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		for(String s:parts){
			System.out.println(s);
		}
	}
	
	
}




abstract class Builder{
	
	public abstract void buildHead();
	public abstract void buildBody();
	public abstract void buildHand();
	public abstract void buildFeet();
	public abstract BuildPattern getResult();
	
}




class FatPersonBuilder extends Builder{
	
	private BuildPattern product = new BuildPattern();
	
	public void buildHead(){
		product.add("����ͷ");
	}
	
	public void buildBody(){
		product.add("��������");
	}
	
	public void buildHand(){
		product.add("������");
	}
	
	public void buildFeet(){
		product.add("���˽�");
	}
	
	
	public BuildPattern getResult(){
		return product;
	}

}


class ThinPersonBuilder extends Builder{
	
	private BuildPattern product;
	
	public void buildHead(){
		product.add("����ͷ");
	}
	
	public void buildBody(){
		product.add("��������");
	}
	
	public void buildHand(){
		product.add("������");
	}
	
	public void buildFeet(){
		product.add("���˽�");
	}
	
	
	public BuildPattern getResult(){
		return product;
	}
}

class Director{
	
	public void construct(Builder builder){
		builder.buildHead();
		builder.buildBody();
		builder.buildHand();
		builder.buildFeet();
	}
	
}


//class test{
//	
//	public static void main(String args[]){
//		Director director = new Director();
//		Builder fat = new FatPersonBuilder();
//		Builder thin = new ThinPersonBuilder();
//		
//		director.construct(fat);
//		
//		Product product = fat.getResult();
//		
//		product.show();
//		
//		
//	}
//	
//}
