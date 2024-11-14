package Nov_exercises.exe_12112024;

public class Super {
    public static void main(String[] args) {
        child1 kid = new child1();
        kid.f1();
        kid.f3();
        System.out.println(kid.f2(0,1));
        System.out.println(kid.f5("Nageena"));
        System.out.println(kid.f7(34,43));
        kid.display();


    }
}


class parent {
    int a = 23;
    int b = 67;
    parent(){
        System.out.println("Executing DC-Parent");
    }
    public void f1(){

        System.out.println("Basic " +
                "Functions");
    }
    public int f2(int a, int b){
        return a+b;
    }
    public String f5(String name){
        return name;
    }
}


class child1 extends parent {
    int a,b;
    child1(){
        System.out.println("Executing DC-Child1");
            }
    public void f3(){
        System.out.println("Am executing child function by calling parent function");
        System.out.println(f2(3,5));
    }
    public int f7 (int a, int b){
        this.a = a;
        this.b = b;
        return a*b;
    }
    public void display(){
        System.out.println(this.a);
        System.out.println(this.b);
        int res = super.a + super.b;
        System.out.println("Executing parent super a + b = " + res);
    }

}
