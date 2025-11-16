package comparitor;

class C<A,B>{
	A o1;
	B o2;
	
	C(A o1, B o2){
		this.o1 = o1;
        this.o2 = o2;
	}
	public void isEqual(A o1, B o2)
    {
        System.out.println(o1.equals(o2));
    }
	
}

public class Runner {
	public static void main(String[] args) {
		C<Integer,Integer> a = new C<Integer,Integer>(null, null);
		a.isEqual(78,89);
	}
}