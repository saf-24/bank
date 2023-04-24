
import java.util.*;

public class Bank {
    static String userName;
    String password;
    static String userName2;
    String password2;
    String userName1;
    String password1;
    int deposit=1;
    int drag=2;
    int showBalance=3;
    int chose;
    int depositMoney;
    int dragMoney;
    String agree;
    int len1;
    int len2;
    int lenn;
    int lennn;
    public void logOrSige(){
        Scanner d = new Scanner(System.in);

        System.out.println("\nfor Log ln please enter \"1\"");
        System.out.println("\nto create account please enter \"2\"");
        chose = d.nextInt();
        while (chose>2) {
            System.out.println("The option you selected does not exist, try again");
            chose = d.nextInt();
        }
        
        if (chose==1) {
            System.out.println("Enter your usarname: ");
            userName2 = d.next();
            lenn = userName2.length();
            System.out.println("enter your password");
            password2 = d.next();
            lennn = password2.length();
            if (lenn<5 || lennn<6) {
                System.out.println("The username or password you entered is short, in order to remember it must be greater than 5 characters and password greater than 6 ");
                logOrSige();
            }
            else { 
                System.out.println("\ncorrect, now chose from betwean these servis.. ");
                servis();
            }
        }
        if (chose==2) {
            enterPage();
        }
    }
        

    public void enterPage(){
        
        System.out.println("let's create your account...");
        System.out.println("Enter your usarname: ");
        Scanner a = new Scanner(System.in);
        userName = a.next();
        len1 = userName.length();
        if (len1<=4) {
            System.out.println("for your safety Select the number of fields more than 5 characters ");
            enterPage();
        }
       
        System.out.println("enter your password");
        password = a.next();
        len2 = password.length();
        if (len2<=5) {
            System.out.println("for your safety Select the number of fields more than 5 characters ");
            enterPage();
        }

        System.out.println("now we create your accawnt..");
        System.out.println("please sign in..");
        signIn();
        
    }
        
        public void signIn(){
            Scanner a = new Scanner(System.in);
            System.out.println("Enter yuor username.");

            userName1 = a.next();
            System.out.println("Enter yuor password..");
            password1 = a.next();
        if (userName.equals(userName1) && password.equals(password1)){
            System.out.println("correct, now chose from betwean these servis.. ");
        }
        else {
            System.out.println("your password or user name is not correct ):");
            signIn();
        }
        servis();
    }
    public void servis(){
       
        System.out.println("\n=========================================");
        System.out.println("\nchose between these sarvise...");
        System.out.println("\n1- deposit\n2- drag\n3- show balance");
        Scanner s = new Scanner(System.in);
        chose = s.nextInt();
        while (chose>3) {
            System.out.println("The option you selected does not exist, try again");
            chose = s.nextInt();
        }
        if (chose==3) {
            c();
        }
        if (chose==1){
            System.out.println("you chose deposit..");
            System.out.println("How much do you want to deposit money?");
            depositMoney = s.nextInt();
            System.out.println("You deposited "+depositMoney +"\nDo you want any help? (y/n)");
            agree = s.next();
            if (agree.equals("y")) {
                servis();
            }
            else if (agree.equals("n")) {
                System.out.println("Have a nice day (:");
                System.exit(0);
            }
            else {
                System.out.println("your chose are not valid ): try again..");
                servis();
            }

        }
        if (chose==2) {
            System.out.println("you chose drag..");
            System.out.println("How much do you want to drag money?");
            dragMoney = s.nextInt();
            if (dragMoney == depositMoney ) {
                System.out.println("The money has been successfully draged!");
                    System.out.println("You draged "+ dragMoney );
                    depositMoney = dragMoney - depositMoney;
                    System.out.println("your balance has beem: "+ depositMoney);
                    System.out.println("Do you want any help? (y/n)");
                    agree = s.next();
                    if (agree.equals("y")) {
                        servis();
                    }
                    else if (agree.equals("n")) {
                        System.out.println("Have a nice day (:");
                        System.exit(0);
                    }
                    else {
                        System.out.println("your chose are not valid ): try again..");
                        servis();
                    }
                }
                else if (dragMoney>depositMoney) {
                    System.out.println("you don't have enough money ): try again..");
                    servis();
                }
                else if (dragMoney<=depositMoney) {
                    System.out.println("The money has been successfully draged!");
                    System.out.println("You draged "+ dragMoney );
                    depositMoney = depositMoney - dragMoney;
                    System.out.println("your balance has beem: "+ depositMoney);
                    System.out.println("Do you want any help? (y/n)");
                    agree = s.next();
                    if (agree.equals("y")) {
                        servis();
                    }
                    else if (agree.equals("n")) {
                        System.out.println("Have a nice day (:");
                        System.exit(0);
                    }
                    else {
                        System.out.println("your chose are not valid ): try again..");
                        servis();
                    }
                }
                if (agree.equals("y")) {
                    servis();
                }
                else if (agree.equals("n")){
                    System.out.println("Have a nice day (:");
                    System.exit(0);
                }
                else {
                    System.out.println("your chose are not valid ): try again..");
                    servis();


                }
            }
        }

            public void c(){
                 Scanner h = new Scanner(System.in);
                    System.out.println("you chose show balance..");
                    

                    if (depositMoney == 0) {
                        System.out.println("sorry!, you don't have any money ):");
                        
                    }
                    else if (depositMoney > 0){
                        System.out.println("your balance is: "+depositMoney);
                    }

                        System.out.println("Do you want any help? (y/n)");
                        agree = h.next();
                        if (agree.equals("y")) {
                            servis();
                        }
                        else if (agree.equals("n")) {
                            System.out.println("Have a nice day (:");
                            System.exit(0);
                        }
                        else {
                            System.out.println("your chose are not valid ): try again..");
                            servis();
                        }
                    }
                }
            


        

    




