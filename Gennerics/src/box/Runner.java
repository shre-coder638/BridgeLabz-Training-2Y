package box;

class Test<T>{
	T o;
	Test(T o){
		this.o=o;
	}
	public T getO(){
		return this.o;
	}
}

public class Runner {
	public static void main(String[] args) {
		Test<Integer> iobj = new Test<Integer>(15); 
		Test<Double> dobj = new Test<Double>(84.778); 
		Test<String> sobj = new Test<String>("Grumpa"); 
		System.out.println(iobj.getO());
		System.out.println(dobj.getO());
		System.out.println(sobj.getO());	
	}
}