import java.util.Scanner;

class EmployeeEncap {
    private int Account_balance;;
    private int upi_pin = 998899;
    
    public void setBalance(int balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter UPI pin");
        int pin = sc.nextInt();
        if(pin == upi_pin){
            Account_balance = balance;
            System.out.println("congratulations salary is credited");
        }
        else{
            System.out.println("salary not credited");
        }
    }

    public int getBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("to know balance please enter UPI pin");
        int pin = sc.nextInt();
        if(pin == upi_pin){
            System.out.println("your balance is: " + Account_balance);
            return Account_balance;
        }
        else{
        System.out.println("invalid pin");
        }
        return -1;
    }
}

public class EmployeeEncapsulation {
    public static void main(String[] args) {
        EmployeeEncap e = new EmployeeEncap();
        e.setBalance(100000);
        e.getBalance();
    }
}