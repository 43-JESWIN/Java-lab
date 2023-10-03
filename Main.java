package Program3.package2;
public class Protected {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.accessProperties();
    }
}
package Program3.package2;
        import Program3.package1.ParentClass;

public class ChildClass extends ParentClass {
    public void accessProperties() {
        System.out.println(protectedProperty);
        // System.out.println(defaultProperty); // This will cause a compile error
    }
}
package package1;

public class ParentClass {
    protected String protectedProperty = "This is a protected property";
    String defaultProperty = "This is a default property";
}