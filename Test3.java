public class Test3 {
    public static void main(String[] args) {
        Week w=new Week();
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.print("Please entrer your number:");
        int inputNum=s.nextInt();
        w.showWeek(inputNum);
    }
}

class Week{
    public void showWeek(int num){
        String week;
        switch(num){
            case 1:
                week="Today is Monday";
                break;
            case 2:
                week="Today is Tuesday";
                break;
            case 3:
                week="Today is Wednesday";
                break;
            case 4:
                week="Today is Thursday";
                break;
            case 5:
                week="Today is Friday";
                break;
            case 6:
                week="Today is Saturday";
                break;
            case 7:
                week="Today is Sunday";
                break;
            default:
                week="Sorry, your number is invalid!";
        }
        System.out.println(week);
    }

}