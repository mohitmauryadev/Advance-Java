import java.util.Scanner;
public class Operate {
     

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Otherage = 0;
        String OtherId = null;
        String Othername = null;
        int experience =0;
       // int j=1;
        System.out.println("Please enter the name of the driver :");
        String name=sc.nextLine();

        if(name.equals("Mohit Maurya")){
            System.out.println("Driver is already registered with the name of :"+ name);
            System.out.println("So, you can Drive the Car :"+ name);
        }
        else{
            System.out.println("You are not registered ");
            System.out.println("Please register yourself first to drive the car");
            System.out.println("Pleas enter your name :");
             Othername=sc.nextLine();
        System.out.println("Please enter your age :");
            Otherage=sc.nextInt();
        if(Otherage<18){
            System.out.println("You are not eligible to drive the Car as your age is less than 18 years");
        }
        else{
            System.out.println("Please enter your Id :");
            sc.nextLine();
             OtherId=sc.nextLine();
            System.out.println("Please enter your drinving experience in years : ");
             experience=sc.nextInt();
        }
        }
       Driver driver = new Driver();
       CarFunctions car = new CarFunctions();
       int incree = 1;
       while(incree == 1){

       if(Otherage>18 || name.equals("Mohit Maurya")){
        System.out.println("Choose The Option");
        System.out.println("1. Know the details of the Driver");
        System.out.println("2. Know the details of the Car");
        System.out.println("3. Start the Car");
        System.out.println("4. Stop the Car");
        System.out.println("5. Increase the spead of the Car");
        System.out.println("6. Brake the Car");
        System.out.println("7. Change the gear of the Car");
        System.out.println("8. Fill the fuel in the Car");
        System.out.println("9. Get the fule activity of the Car");
        System.out.println("10. Get the speed of the Car ");
        int i=sc.nextInt();
     //  while (j>0) {
        
       

         switch (i){
            case 1:{
                if(name.equals("Mohit Maurya")){
                    driver.showDriverDetails();
                 }
                 else{
                    driver.showOtherDriverDetails(Othername, Otherage, OtherId, experience);
                 }
                 break;
            }
            case 2:{
                car.showDriverDetails();
                break;
            }
          case 3:{
            car.start();
            break;
          }
          case 4:{
            car.stop();
            break;
          }
          case 5:{
            System.out.println(("Please enter the speed you want to increase :"));
            int speed = sc.nextInt();
            car.accelerate(speed);
            break;
          }
        case 6:{
            System.out.println("Please enter the speed you want to decrease :");
            int sp = sc.nextInt();
            car.brack(sp);
                break;        
        }
            case 7:{
                System.out.println("Please enter the gear you want to change :");
                int Gear = sc.nextInt();
                car.gearUp(Gear);
                break;
            }
            case 8:{
                System.out.println("Please enter the fuel you want to fill :");
                int fuel = sc.nextInt();
                car.fuelUp(fuel);
                break;
            }
            case 9:{
                car.fuelactivity();
                break;
            }
            case 10:{
                car.speed();
                break;
            }
            case 11:{
                 i=0;
                 System.out.println("Thank you for using the Car Driving System and have a nice day ahead");
                break;
            }
            default:{
                System.out.println("Please enter a valid option from the above list ");
                break;
            }
         }
         
        }
        System.out.print(" press 1 for continoue otherwise any number you can press : ");
        incree = sc.nextInt();
    }
   sc.close();
    }
}
