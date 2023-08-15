import java.util.Scanner;

public class App1 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "\u1F4B0 Welcome to Smart Banking";
        final String OPEN_NEW_ACCOUNT = "\u2795 Open New Account";
        final String DEPOSIT_MONEY = "\u1F4B5 Deposit Money";
        final String WITHDRAW_MONEY = "\u1F4B3 Withdraw Money";
        final String TRANSFER_MONEY = "\\u1F4B8 Transfer Money";
        final String CHECK_ACCOUNT_BALANCE = "\u1F4B2 Check Account Balance";
        final String DROP_EXISTING_ACCOUNT = "\u274C Drop Existing Account";
        final String EXIT = "\u1F911 Exit";

        //System.out.println(DASHBOARD);

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);
    
        //String[] accountID = new String[0];
        String[] customerNames = new String[0];

        String screen = DASHBOARD;

        mainLoop:
        do{
            final String APP_TITLE = String.format("%s%s%s",COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){
                case DASHBOARD: 
                    System.out.println("\t[1]. Open New Account");
                    System.out.println("\t[2]. Deposit Money");
                    System.out.println("\t[3]. Withdraw Money");
                    System.out.println("\t[4]. Transfer Money");
                    System.out.println("\t[5]. Check Account Balance");
                    System.out.println("\t[6]. Drop Existing Account");
                    System.out.println("\t[7]. Exit\n");
                    System.out.print("\tEnter an option to continue: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option){
                        case 1: screen = OPEN_NEW_ACCOUNT; break;
                        case 2: screen = DEPOSIT_MONEY; break;
                        case 3: screen = WITHDRAW_MONEY; break;
                        case 4: screen = TRANSFER_MONEY; break;
                        case 5: screen = CHECK_ACCOUNT_BALANCE; break;
                        case 6: screen = DROP_EXISTING_ACCOUNT; break;
                        case 7: System.out.println(CLEAR); System.exit(0);
                        default: continue;
                    }
                    

        }
        }while (true); 
    }
}
    
        
    

