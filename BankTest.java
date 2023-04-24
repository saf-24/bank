class BankTest extends Bank{
public static void main(String[] args) {
    System.out.println("\nwelcome to central bank..\n How can we help you");
    System.out.println("");
    Bank s = new Bank();
    s.logOrSige();
    s.enterPage();

    s.signIn();
    s.servis();
    
}
}