package AccessModifier_PackageConcept.AccessModifier_Package;

public class ClassB {
    public void printClassAContents(ClassA objA) {
        System.out.println("ClassB-------------------------------------------------------");
        // Accessing variables and methods of ClassA
        System.out.println("Printing contents of ClassA from ClassB:");
        //objA.privateVarA; // Error: privateVarA has private access in ClassA
        //objA.defaultVarA; // No error: defaultVarA is visible within the package
        System.out.println("Default variable in ClassA: " + objA.defaultVarA);
        System.out.println("Protected variable in ClassA: " + objA.protectedVarA);
        System.out.println("Public variable in ClassA: " + objA.publicVarA);
        //objA.privateMethodA(); // Error: privateMethodA() has private access in ClassA
        //objA.defaultMethodA(); // No error: defaultMethodA() is visible within the package
        System.out.println("Public method in ClassA called from ClassB:");
        objA.publicMethodA();
        System.out.println("-------------------------------------------------------------");
    }
}


