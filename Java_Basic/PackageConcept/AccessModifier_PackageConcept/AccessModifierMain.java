/*
ClassA:
- Defines variables and methods with private, default, protected, and public access modifiers.
- Represents a base class showcasing encapsulation and access control in Java.
- Demonstrates different levels of access for members within the same package.

ClassB:
- Located in the same package as ClassA (AccessModifier_Package).
- Utilizes ClassA's public members to showcase access across classes in the same package.
- Contains a method to print the contents of ClassA from ClassB.

ClassC:
- Located in a different package (AnotherAccessModifier_Package) from ClassA.
- Extends ClassA, inheriting its public and protected members.
- Demonstrates accessing ClassA's public members directly and inherits its protected members.
- Contains additional members with public access.
- Illustrates inheritance and access to superclass members from a subclass in a different package.

AccessModifierMain:
- Entry point for the program.
- Creates instances of ClassA, ClassB, and ClassC.
- Demonstrates usage of access modifiers by accessing members of ClassA, ClassB, and ClassC.
- Provides a comprehensive overview of access control in Java through practical usage in the main program.
*/

package AccessModifier_PackageConcept;

import AccessModifier_PackageConcept.AccessModifier_Package.*;
import AccessModifier_PackageConcept.AnotherAccessModifier_Package.*;

public class AccessModifierMain {
    public static void main(String[] args) {
        System.out.println("Main--------------------------------------------------------------");
        // Create objects of classes from AccessModifier_Package
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        
        // Accessing variables and methods of ClassA from AccessModifierMain
        System.out.println("Printing contents of ClassA from AccessModifierMain:");
        // objA.defaultVarA; // Error: defaultVarA is not visible outside AccessModifier_Package
        // objA.protectedVarA; // Error: protectedVarA is not visible outside AccessModifier_Package
        System.out.println("Public variable in ClassA: " + objA.publicVarA);
        System.out.println("Public method in ClassA called from AccessModifierMain:");
        objA.publicMethodA();
        
        // Accessing variables and methods of ClassB from AccessModifierMain
        objB.printClassAContents(objA);
        
        // Create object of ClassC from AnotherAccessModifier_Package
        ClassC objC = new ClassC();
        
        // Accessing variables and methods of ClassC from AccessModifierMain
        objC.printClassAContents(objA);
        
        // Accessing variables and methods of ClassC from AccessModifierMain
        System.out.println("Printing contents of ClassC from AccessModifierMain:");
        System.out.println("Public variable in ClassC: " + objC.publicVarC);
        System.out.println("Public method in ClassC called from AccessModifierMain:");
        objC.publicMethodC();

        System.out.println("-------------------------------------------------------------------");
    }
}



    