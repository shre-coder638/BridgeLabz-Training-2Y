package max;


class Max<T extends Comparable<T>>{
	T a, b, c;
	
	Max(T a, T b, T c){
		this.a = a;
        this.b = b;
        this.c = c;
	}
	public T Maximum(){
		T m = a;
		if(b.compareTo(m)>0){
			m=b;
		}else if(c.compareTo(m)>0) {
			m=c;
		}
		return m;
    }
}

public class Runner {
	public static void main(String[] args) {
		Max<Integer> sd = new Max<>(8,7,4);
		System.out.print(sd.Maximum());
	}
}
