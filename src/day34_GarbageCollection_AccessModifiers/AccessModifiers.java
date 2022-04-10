package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200; // access modifier: default
    private static int privateData = 300;

    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }



    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }
}
/* // Access modifiers: define the accessibility, controls the access level.
      1.public : The code is always reachable (visible) by any other class, meaning that it is used to set the access level for classes, attributes, methods, and constructors.
      2.protected: The code is accessible in the same package and subclasses.
      3.default: (no modifier): The code is always visible(reachable) within the same class and the same package.
      4.private: The code is only reachable( accessible, visible) within the same/ declared class.
      P.S: Variables, constructors , and methods can have all 4 access modifiers.
 */