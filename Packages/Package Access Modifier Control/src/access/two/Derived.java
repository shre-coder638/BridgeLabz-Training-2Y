package access.two;

import access.one.Base;

public class Derived extends Base {

    public void accessTest() {
        System.out.println("Accessing from subclass in another package:");

        publicMethod();       
        protectedMethod();    

  }
}
