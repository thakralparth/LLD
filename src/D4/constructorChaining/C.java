package D4.constructorChaining;

public class C extends B{
    C(){
        System.out.println("Constructor of class C");
    }

    C(String c){
        System.out.println("Cons with 1 param");
    }

    C(String a, String b){
        System.out.println("Cons with params as and b");
    }
}
