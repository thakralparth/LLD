package D4.constructorChaining;

public class D extends C{
    D(){
        //super(); //explicitly call the cons of super/parent class .
                    //its alredy calling the cost of parent class but if we want to call the custom constructor
        super("Parth"); // this would call the custome constructor of parent class

        System.out.println("COnstructor of Class D");
    }
}
