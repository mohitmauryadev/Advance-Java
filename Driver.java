public class Driver {
    String name= "Mohit Maurya";
    int age =19;
    String Id = "2024Mohit-Maurya";
    public void showDriverDetails(){
       System.out.println("Driver Name :"+ name);
       System.out.println("Driver Age :"+ age);
       System.out.println("Driver Id :"+ Id); 
       System.out.println("Driving experience : 2 years");
    }
    String Othername;
    int Otherage;
    String OtherId;
    int experience;
    public void showOtherDriverDetails(String Othername, int Otherage, String OtherId, int experience){
       System.out.println("Driver Name :"+ Othername);
       System.out.println("Driver Age :"+ Otherage);
       System.out.println("Driver Id :"+ OtherId); 
       System.out.println("Driving experience of "+ Othername + " is "+ experience +" years");
    }
}
