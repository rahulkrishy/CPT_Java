package AccessModifier_PackageConcept.AccessModifier_Package;

public class ClassA {
    // Private variable accessible only within the class
    @SuppressWarnings("unused")
    private int privateVarA = 10;
    
    // Default variable accessible within the package
    int defaultVarA = 20;
    
    // Protected variable accessible within the package and by subclasses
    protected int protectedVarA = 30;
    
    // Public variable accessible from anywhere
    public int publicVarA = 40;
    
    // Private method accessible only within the class
    @SuppressWarnings("unused")
    private void privateMethodA() {
        System.out.println("Private method in ClassA called");
    }
    
    // Default method accessible within the package
    void defaultMethodA() {
        System.out.println("Default method in ClassA called");
    }
    
    // Protected method accessible within the package and by subclasses
    protected void protectedMethodA() {
        System.out.println("Protected method in ClassA called");
    }
    
    // Public method accessible from anywhere
    public void publicMethodA() {
        System.out.println("Public method in ClassA called");
    }
}
