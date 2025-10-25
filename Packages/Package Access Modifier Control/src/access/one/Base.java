package access.one;

public class Base {
    public void publicMethod() {
        System.out.println("Public Method: Accessible Everywhere");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible in subclass or same package");
    }

    void defaultMethod() {
        System.out.println("Default Method: Only within same package");
    }

    private void privateMethod() {
        System.out.println("Private Method: Only within Base");
    }
}
