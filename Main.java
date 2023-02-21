import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String  [] darr={"Meshach", "Intelligence","AI"};
        System.out.println("Pick  a choice and app  will design selected word ");
        for (int loop=0,p=1;loop<3;loop++,p++)
        {
            System.out.println(p+darr[loop]);

        }
        System.out.println("Enter an option");
        Scanner ama=new Scanner (System.in);
        int detect=ama.nextInt();

        for(int u=0;u<4;u++)
        {

            switch(u)
            {
                case 0:
                    System.out.println("-----------------------");

                    break;

                case 1:
                    for (int re = 0; re < 2; re++) {

                        System.out.print("|");
                        if (re==(0)) {
                            System.out.print("Word is :"+darr[detect-1]);

                        }

                    }
                    break;
                case 2:
                    System.out.print("\n"); System.out.println("-----------------------");

            }

        }
    }
}