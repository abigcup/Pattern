
interface FiveVolt{
	public int getVolt5();
}


class Volt220{
	
	public int getVolt220(){
		return 220;
	}
	
}


class ClassAdapter extends Volt220 implements FiveVolt{
	
	@Override
	public int getVolt5(){
		return 5;
	}
	
}


//class Test{
//	public static void main(String args[]){
//		
//		ClassAdapter ca = new ClassAdapter();
//		
//		System.out.println(ca.getVolt5());
//		System.out.println(ca.getVolt220());
//		
//	}
//}