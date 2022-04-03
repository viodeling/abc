public class Test2 {
    public static void main(String[] args) {
        Weather weather=new Weather();
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("Welcome to use our simple weather system!");
        System.out.println("Indication1: 1 represent rain, 0 represent shinning day");
        System.out.println("Indication2: 1 represent male, 0 represent female");
        System.out.println("Indication3: tempreature should be a number");
        System.out.print("Please enter the weather:");
        int w=s.nextInt();
        System.out.print("Please enter your sex:");
        int b=s.nextInt();
        System.out.print("Please enter the tempreture:");
        int temp=s.nextInt();
        weather.showWeather(w, b, temp);

    }
}

class Weather{
    public void showWeather(int weather, int sex, int temp){
        if(weather==1){
            System.out.println("It is a raining day!");
            System.out.println("Bring umbrella");
            if(sex==1){
                System.out.println("Bring big black umbrella");
            }else if(sex==0){
                System.out.println("Bring small colorful umbrella");
            }else{
                System.out.println("Sorry, the number you entered is not valid");
            }
        }else if(weather==0){
            System.out.println("It is a shinning day!");
            if(temp>=30){
                if(sex==1){
                    System.out.println("Bring sunglasses");
                }else{
                    System.out.println("Bring sunscreen cream");
                }
            }
        }else{
            System.out.println("Sorry, your number you entered is not valid");
        }
    }
}