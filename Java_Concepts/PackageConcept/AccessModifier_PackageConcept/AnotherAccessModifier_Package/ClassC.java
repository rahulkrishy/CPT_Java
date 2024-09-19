package AccessModifier_PackageConcept.AnotherAccessModifier_Package; // Different package from ClassA and ClassB

import AccessModifier_PackageConcept.AccessModifier_Package.ClassA;

public class ClassC {
    // Private variable accessible only within the class
    @SuppressWarnings("unused")
    private int privateVarC = 50;
    
    // Public variable accessible from anywhere
    public int publicVarC = 80;
    
    // Private method accessible only within the class
    @SuppressWarnings("unused")
    private void privateMethodC() {
        System.out.println("Private method in ClassC called");
    }
    
    // Public method accessible from anywhere
    public void publicMethodC() {
        System.out.println("Public method in ClassC called");
    }
    
    // Method to print contents of ClassA from ClassC
    public void printClassAContents(ClassA objA) {
        System.out.println("ClassC-------------------------------------------------------");
        // Accessing variables and methods of ClassA
        System.out.println("Printing contents of ClassA from ClassC:");
        //objA.defaultVarA; // Error: defaultVarA is not visible from AnotherAccessModifier_Package
        //objA.protectedVarA; // Error: protectedVarA is not visible from AnotherAccessModifier_Package
        System.out.println("Public variable in ClassA: " + objA.publicVarA);
        System.out.println("Public method in ClassA called from ClassC:");
        objA.publicMethodA();
        System.out.println("-------------------------------------------------------------");
    }
}
