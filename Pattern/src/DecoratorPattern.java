
public class DecoratorPattern {

}


interface Component{
	void method();
}


class ConcreteComponent implements Component{
	@Override
	public void method(){
		System.out.println("原来的方法");
	}
}



abstract class Decorator implements Component{
	
	protected Component component;
	
	public Decorator(Component component){
		super();
		this.component = component;
	}
	
	public void method(){
		component.method();
	}
	
}



class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	public void methodA(){
		System.out.println("被装饰器扩展的功能");
	}
	
	public void method(){
		System.out.println("针对该方法做一层A包装");
		super.method();
		System.out.println("A包装结束");
	}
	
	
	
}


class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	public void methodB(){
		System.out.println("被装饰器扩展的功能");
	}
	
	public void method(){
		System.out.println("针对该方法做一层A包装");
		super.method();
		System.out.println("A包装结束");
	}
	
	
	
}


class test{
	public static void main(String args[]){
		Component component = new ConcreteComponent();
		component.method();
		
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
		concreteDecoratorA.method();
		concreteDecoratorA.methodA();
		
		
		ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
		concreteDecoratorB.method();
		concreteDecoratorB.methodB();
	}
}


