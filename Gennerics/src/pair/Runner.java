package pair;

class P<T,U>{
	T obj1;  
    U obj2;  

    P(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
	
}

public class Runner {
	public static void main(String[] args) {
		P<String, Integer> s = new P<>("Amol", 20);
		System.out.println(s.obj1);
		System.out.println(s.obj2);
	}
}