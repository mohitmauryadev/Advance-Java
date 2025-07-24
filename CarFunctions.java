public class CarFunctions implements Car{
     int fuel =0;
     int speed = 0;
     int Gear =0;

    @Override
    public void start() {
        if(fuel<1){
            System.out.println("Fuel is not enough to start the Car please fill the fuel first");
        }
        else{
            System.out.println("Car is Starting Brooooommm......");
            speed = 10;
            fuel = fuel -1;
            System.out.println("Car is started with speed of : "+ speed + " Km/h ");
        }
       
    }

    @Override
    public void stop() {
       System.out.println("Car is stoping");
       speed=0;
       System.out.println("Car is stoped with speed of : "+ speed + " Km/h ");
    }

    @Override
    public void accelerate(int speed) {
       
       if(speed <  51 && speed > 0){
        if(this.speed<200){
            this.speed = speed + this.speed;
            System.out.println("Car's speed is up with : "+ speed + " km/h and Your current speed is : "+ this.speed + " Km/h ");
        }
        else{
            System.out.println("Car has already reached too high speed of : "+ this.speed + " Km/h ");
        }
       
        
       fuel=fuel -1;   
       if(fuel<1){
        System.out.println("Fuel is too low please fill the fuel first");
     }
       }
    }
    @Override
    public void brack(int sp) {
        System.out.println("Car is breaking down");
        if(speed>sp){
            speed = speed - sp;;
            System.out.println("Car has down it's speed of :" + sp + " Km/h");
        }
    }

    @Override
    public void gearUp(int Gear) {
      
       if(Gear <6 && Gear > 0){
        if(this.Gear<6){
            this.Gear = Gear + this.Gear;
            System.out.println("Gear are changing ");
            System.out.println("Gear is changed to : "+ this.Gear);
        }
       else{
           System.out.println("Gear has already reached to max of :"+ this.Gear);
       }
       }
       fuel = fuel -1;
       if(fuel<1){
        System.out.println("Fuel is too low please fill the fuel first");
       }
    }

    @Override
    public void fuelUp(int fuel) {
        if(this.fuel>=50){
            if(fuel>20){
                System.out.println("fuel is already full : "+ this.fuel + " Liters");
            }
        }
        else{
            this.fuel=fuel + this.fuel;
            System.out.println("Fuel is filling up : "+ fuel + " Liters and now the fuel is :" + this.fuel + " Liters");
        }   
        
    }

    @Override
    public void fuelactivity() {
     System.out.println("Your current fule is : "+ fuel + " Liters");
    }

    @Override
    public void speed() {
        System.out.println("Current speed is : "+ speed + " Km/h");

    }
    public void showDriverDetails(){
        System.out.println("Number of tires : "+ tires);
        System.out.println("Number of doors : "+ doors);
        System.out.println("Color of the Car : "+ color);
        System.out.println("Price of the Car : "+ price);
        System.out.println("Modol of the Car : "+ modol);
        System.out.println("Make of the Car : "+ make);
    }
    
}
