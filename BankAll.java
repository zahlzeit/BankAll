import java.util.Scanner;
public class BankAll
{
    // Here, we will have the data types.
    static Scanner take = new Scanner(System.in);
    static String bankName = "BankAll";
    static String bankAddress = "Mero Ghar";
    int customerId;
    long accountNumber;
    String customerName;
    String address;
    long dateOfBirth;
    String parentName;
    boolean maritalStatus;
    double yearlyIncome;
    
    //Constructors go over here.
    BankAll()
    {
        //This is the default constructor.
    }
    
    //This part will hold the methods.
    static void welcomeMethod()
    {
        //This is a simple method to display the name and slogan of the bank.
        System.out.println("Welcome to " + bankName);
        System.out.println("We succeed together.");
    }
    
    static void options()
    {
        //This is a method to display the options for selecting business of visit.
        System.out.println("Please select your business.");
        System.out.println("Cordially press 1. for Opening bank account.");
        System.out.println("\t 2. for checking Balance");
        System.out.println("\t 3. for balance Deposit.");
        System.out.println("\t 4. for balance Withdrawal.");
        System.out.println("\t 5. for balance POS.");
        System.out.println("\t 6. for balance Transfer.");
        System.out.println("\t 7. for asking Loan.");
        //System.out.println("\t 8. for checking Loan details.");
        System.out.println("\t 8. for closing the Account");
    }
    
    static void openAccount()
    {
        BankAll customerOne = new BankAll();
        System.out.println("Enter your Name.");
        customerOne.customerName = take.next();
        System.out.println("Enter your Citizenship number.");
        customerOne.customerId = take.nextInt();
        System.out.println("Enter your Address.");
        customerOne.address = take.nextLine();
        System.out.println("Enter your Date of birth.");
        customerOne.dateOfBirth = take.nextLong();
        System.out.println("Enter your Parent's name.");
        customerOne.parentName = take.next();
        System.out.println("Please type true, if you are married and false, if you are single.");
        customerOne.maritalStatus = take.nextBoolean();
        System.out.println("Please enter your Yearly income.");
        customerOne.yearlyIncome = take.nextDouble();
    }
    
    static void checkBalance()
    {
    }
    
    public static void main(String[] args)
    {
        //This is the main function.
        boolean flag = true;
        do
        {
            welcomeMethod();
            options();
            int a;
            a = take.nextInt();
            switch(a)
            {
                case 1:
                {
                    // BankAll customer = new BankAll();
                    openAccount();
                    break;
                }
                case 2:
                {
                    break;
                }
                case 3:
                {
                    break;
                }
                case 4:
                {
                    break;
                }
                case 5:
                {
                    break;
                }
                case 6:
                {
                    break;
                }
                case 7:
                {
                    break;
                }
                case 8:
                {
                    break;
                }
                default:
                {
                    break;
                }
            }
        }
        while(flag);
    }
}