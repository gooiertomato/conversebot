package org.vashonsd;
import java.util.Scanner;
//bot1tester aka main
public class Bot1Tester
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hail, what be thy tide?");
        String name = input.nextLine();

        Bot1 bot = new Bot1(name);
        bot.greeting();
      //runs greet
        System.out.println("How are thy!");

        String a = input.nextLine();
     //how are you feeling, repeats feeling
        bot.dailyMood(a);
        System.out.println("Where are thou from?");

        String h = input.nextLine();

        bot.home(h);
//asks where you are stationed
        System.out.println("What is thy favorite number?");

        int n = input.nextInt();

        bot.favoriteNumber(n);
//asks number
        bot.goodbye();

    }

}
