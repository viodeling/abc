public class Test1 {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.print("Please enter your age:");
        int age=s.nextInt();
        LifePhase l=new LifePhase();
        l.getLifePhase(age);
    }
}

class LifePhase{
    public void getLifePhase(int age){
        String phase="elder";
        if(age<0 || age>150){
            System.out.println("Your age is invalid");
            return;
        }else if(age<=5){
            phase="toddler";
        }else if(age<=10){
            phase="children";
        }else if(age<=18){
            phase="teenager";
        }else if(age<=35){
            phase="adult";
        }else if(age<=55){
            phase="middle-aged";
        }
        System.out.println(phase);
    }

}