package Oct_Exercises.exe_16102024;

public class Lab_014_InputsInJavaUsingARGS {
    public static void main(String[] args) { //basically its a string so we need to parse it

        // to integer to take as an input from user if its integer

        System.out.printf("The First no in args is: " + "%s" + '\n' + "The second no in args is: " + "%s", args[0], args[1]);
        System.out.println();
        //System.out.println("The max is:" + ((args[0] > args[1] ) ? args[0] : args[1]));//this is not valid as the args are in string format
        int num1 = Integer.parseInt(args[0]); //needs to be parsed from string to int before using it
        int num2 = Integer.parseInt(args[1]);
        System.out.println("The Max of two args is:" + ((num1 > num2) ? num1 : num2));




    }
}
