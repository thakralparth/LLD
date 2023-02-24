package D4.Inheritence;

public class Client {
    public static void main(String[] args) {
        Instructor i = new Instructor();

        i.avgRating=4.5;
        i.login();
        i.username="Parth";  // if I am extending a class I am able to access both attribues and methods of parent class

        i.scheduleClass(); //

        User u=new User();  //❌ ✔

        u.login(); // correct

      //  u.scheduleClass();  // not possible




    }
}
