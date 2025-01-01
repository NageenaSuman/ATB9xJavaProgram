package Tasks;

public class SumOfAllElementsInArray {

    public static void main(String args[]){

        int[] array = {23,33,1,45};
        int sum = 0;

        for(int i=0; i<array.length; i++){
            sum = sum + array[i];

        }
        System.out.println("Sum of all numbers in an array: " + sum);

        System.out.println("Enhanced For loop");
        sum = 0;
        for (int num: array){
            sum = sum + num;
        }
        System.out.println("Sum of all numbers in an array using enhanced For loop: " + sum);
    }
}
