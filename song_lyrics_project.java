import java.util.Scanner;

class valentine extends Thread{
    public void run (){
        //lyrics
        String[] lyrics= {
                "I need a lover to keep me sane\n" +
                        "Pull me from hell, bring me back again\n" +
                        "Play me the classics\n" +
                        "Something romantic\n" +
                        "Give him my all when I don't even have it\n" +
                        "I always dreamed of a solemn face\n" +
                        "Someone who feels like a holiday\n" +
                        "But now I'm in pieces\n" +
                        "Barely believing\n" +
                        "Starting to think that I've lost all feeling\n" +
                        "You came out the blue on a rainy night\n" +
                        "No lie\n" +
                        "I'll tell you how I almost died\n" +
                        "While you're bringing me back to life\n" +
                        "I just wanna live in this moment forever\n" +
                        "'Cause I'm afraid that living couldn't get any better\n" +
                        "Started giving up on the word \"forever\"\n" +
                        "Until you gаve up heaven, so we could be together\n" +
                        "You're my angel\n" +
                        "Angel baby, angel\n" +
                        "You're my angel, baby\n" +
                        "Baby, you're my angel\n" +
                        "Angel baby\n" +
                        "I fall in love with the little things\n" +
                        "Counting the tattoos on your skin\n" +
                        "Tell me a secret\n" +
                        "And baby, I'll keep it\n" +
                        "And maybe we could play house for the weekend\n" +
                        "You came out the blue on a rainy night\n" +
                        "No lie\n" +
                        "I'll tell you how I almost died\n" +
                        "While you're bringing me back to life\n" +
                        "I just wanna live in this moment forever\n" +
                        "'Cause I'm afraid that living couldn't get any better\n" +
                        "Started giving up on the word \"forever\"\n" +
                        "Until you gаve up heaven, so we could be together\n" +
                        "You're my angel\n" +
                        "Angel baby, angel\n" +
                        "You're my angel, baby\n" +
                        "Baby, you're my angel\n" +
                        "Angel baby\n" +
                        "All the sick and twisted nights that I've been waiting for ya\n" +
                        "They were worth it all along, yeah\n" +
                        "I just wanna live in this moment forever\n" +
                        "'Cause I'm afraid that living couldn't get any better\n" +
                        "Started giving up on the word \"forever\" (on the word \"forever\")\n" +
                        "Until you gаve up heaven, so we could be together\n" +
                        "You're my angel\n" +
                        "Angel baby, angel\n" +
                        "You're my angel, baby\n" +
                        "Baby, you're my angel\n" +
                        "Angel baby\n"
        };
        //printing the lyrics
        for(String item:lyrics){
            printWithDelay(item);
            delay(5000);
        }

    }
    //method print the words line by line with delay
    private void printWithDelay(String s){
       String[] words = s.split(" ");
       for(String word:words){
           System.out.print(word+" ");
           delay(640);
       }
    }
    //method delay
    private void delay (long milliSec){
        try{
            Thread.sleep(milliSec);
        }
        catch(InterruptedException e){
            System.out.println("Occure!"+ e.getMessage());
        }
    }
}
//main class
public class song {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        valentine song = new valentine();
        song.start(); //thread start
        song.interrupt();
    }
}

