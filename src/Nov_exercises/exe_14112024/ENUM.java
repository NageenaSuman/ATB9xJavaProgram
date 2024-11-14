package Nov_exercises.exe_14112024;

public class ENUM {
    public static void main(String[] args) {
        // Example -1
        System.out.println(months.February);
        // Example -2
        System.out.println(APIEndpoints.CHATBOT_PAGE.getValue());

        if(APIEndpoints.LOGIN_PAGE.getValue() == "https://app.vwo.com/login") {
            System.out.println("Its a login page");
        }
    }
}

enum months {
    January, February, March, April, May;
}

enum APIEndpoints {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private String endpoints;   //either to be protected or private

    //Constructor
    APIEndpoints (String endpoints) {
        this.endpoints = endpoints;
    }
    //method - FUnction with return type and no parameter can be used to get value
    public String getValue (){
        return endpoints;
    }



}