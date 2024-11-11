package Nov_exercises.exe_08112024.Encapsulation;

public class Lab_057_Encapsulation {
    public static void main(String[] args) {
    //Basic Login anybody can change
        Login l1 = new Login("admin", "admin123");
        l1.display();

        Good_Login l2 = new Good_Login("PK", "admin123");
        //l2.username // cant access as it is private for to access it create a method and call it
        l2.display();

        Good_Login_Getter_Setter gs = new Good_Login_Getter_Setter("Nageena", "Pass123");
        //getting details
        System.out.println(gs.getUsername());
        System.out.println(gs.getPassword(true));
        //setting details

        gs.setUsername("NewUser123");
        gs.setPassword("admin123###", true);
        System.out.println(gs.getUsername());
        System.out.println(gs.getPassword(true));

    }
}
//Anybody can access - BAD PRACTISE
class Login{
    //Attributes
    String username, password;
    //Constructor
    Login(String username, String password){
        this.username = username;
        this.password = password;

    }
    public void display(){
        System.out.println("The details of Webpage Login: " + this.username + " - " + this.password);
    }
}
class Good_Login { //Can access it via methods even when making the attributes as private
    private String username;
    private String password;
    Good_Login(String username, String password){
        this.username = username;
        this.password = password;

    }
    //creating a method to be called it outside
    public void display(){
        System.out.println("The details of Webpage Login: " + username + " - " + password);
    }

}
class Good_Login_Getter_Setter {
    //Attributes
    private String username;
    private String password;
    //Constructor
    Good_Login_Getter_Setter(String username, String password){
        this.username = username;
        this.password = password;

    }
    //Getter method
    public String getUsername() {
        return username; //always remember if you are returning something from method then you need to
        //store it in some variable to print or else use it in direct sout
    }
    //to make it more secure use true/false
    public String getPassword(boolean isAdmin) {
        if (isAdmin) {
            return password;
        }
        return "Not allowed as you are not admin";

    }
    //Setter method
    public void setUsername(String username) {
        this.username = username; //if you dont use this. here it will access last class value
    }
    //to make it more secure use true/false
    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not Allowed");
        }

    }


}