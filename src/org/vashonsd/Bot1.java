package org.vashonsd;

public class Bot1{

    private String name;

    public Bot1(String yourName){
        name = yourName;
    }

    public void greeting(){
        System.out.print("Good day ");
        System.out.print(name);
        System.out.println("! I am Lord Martha! I'm here to converse with you!");

    }

    public void goodbye(){
        System.out.print("Well met ");
        System.out.print(name);
        System.out.println(", I bid thee farewell!");
    }

    public void favoriteNumber(int yourNumber){
        System.out.println("Aye, tis but a fair number");
        System.out.println("The most fair number to me is 16.");
        System.out.print("tis a mere ");
        System.out.print(yourNumber - 16);
        System.out.println(" away from your number.");
    }

    public void dailyMood(String yourMood){
        System.out.print("Why that is splendid! I hope thy day continues to be ");
        System.out.print(yourMood);
        System.out.println(" , I'm doing pleasant today! ");
    }

    public void home(String location){
        System.out.print("I heard it is fairly nice in ");
        System.out.print(location);
        System.out.println(".");
        System.out.println("I am from the most bottom pits of the Earth.");
    }

}

