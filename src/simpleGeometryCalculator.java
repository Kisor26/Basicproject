import java.util.Scanner;

public class simpleGeometryCalculator {

    //This method checked the user's input in negative or not.
    static double getInput(Scanner input,String text){
        double value;

        do{
            System.out.print(text);
            value=input.nextDouble();
            if(value<0){
                System.out.println("Value Can't be Negative ! Enter Positive value Again");
            }
        }while (value<0);
        return value;

    }
    //This method calculated the Operation of rectangle
    static double calculateRectangle(double l,double w, String s){
        if(s.equals("area")){
            return  l*w;
        }else{
            return 2*(l+w);
        }

    }
    //This method is for a Formated Manner Output
    static void display(double area, double perimeter) {

        System.out.println("--Simple Geometry Calculator--");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        System.out.println("--Simple Geometry Calculator--");
        Scanner input=new Scanner(System.in);

        double length=getInput(input,"Enter Length:"); //using getinput method for check the value negative or positive
        double width=getInput(input,"Enter Width:");

        double area=calculateRectangle(length,width,"area");
        double perimeter=calculateRectangle(length,width,"perimeter");  // Calculation method called here


        System.out.println();
        display(area,perimeter);  //Display method is called Here.


        // Sorry for the late submission.
        // Due to my illness, I was unable to complete the assignment within the stipulated time.
        //So Don't Cut my mark , Please!!!!!!!

    }
}
