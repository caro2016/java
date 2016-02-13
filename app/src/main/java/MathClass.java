/**
 * Created by Student on 2/13/2016.
 */
public class MathClass {
    public static void main(String args[]){
        addition();
        subtraction();
        multiplication();
        division();
    }

    //Addition method
public static void addition(){
    int a=400;
    int b=500;
    int answer=a+b;
    System.out.println(answer);
}
    // Subtraction method
    public static void subtraction(){
        int a=1000;
        int b=600;
        int answer=a-b;
        System.out.println(answer);
    }


//Addition method
public static void multiplication(){
    int a=200;
    int b=20;
    int answer=a*b;
    System.out.println(answer);
}

//Division method
public static void division(){
    int a=5000;
    int b=50;
    int answer=a/b;
    System.out.println(answer);
}
}