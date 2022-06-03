import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount For Food: ");
        int amount=sc.nextInt();

        Demo demo = new Demo();
        Hotel hotel = demo.provideFood(amount);


        if(hotel instanceof TajHotel) {
            ((TajHotel) hotel).welcomeDrink();
        }
        hotel.chickenBiriyani();
        hotel.masalaDosa();
    }


    public Hotel provideFood(int amount){
        if(amount>1000){
            return new TajHotel();
        }
        if(amount>200 && amount<1000){
            return new RoadSideHotel();
        }
        return null;
    }
}
