package lamda_in_depth.Thread;

import java.util.Random;

//Your code demonstrates the use of multithreading in Java to simulate
//a random player that can play games and music concurrently. The program uses
//lambda expressions to create Runnable tasks and starts two separate threads to execute t
//hese tasks.
class RandomOccurance {
    public void playgame(String gamename) throws InterruptedException{
        System.out.println(gamename+" is started");
        Thread.sleep(5000);
        System.out.println(gamename+" is stopped");
    }
    public void playmusic(String musicname) throws InterruptedException{
        System.out.println(musicname);
        Thread.sleep(5000);
        System.out.println(musicname);
    }
}
public class RandomPlayer {
    static String[] games = { "COD",      "Prince Of Persia", "GTA-V5", "Valorant", "FIFA 22", "Fortnite" };
    static String[] tracks = { "Believer", "Cradles", "Taki Taki", "Sorry","Let Me Love You" };
    public static void main(String[] args) {
        RandomPlayer player=new RandomPlayer();
        RandomOccurance occurance=new RandomOccurance();
        Random random=new Random();

        Runnable runnable=()->{
            try {
                occurance.playgame(games[random.nextInt(games.length)]);
            }catch (InterruptedException e){
                e.getMessage();
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

        Runnable runnable1=()->{
            try {
                occurance.playmusic(tracks[random.nextInt(tracks.length)]);
            }catch (InterruptedException e){
                e.getMessage();
            }
        };

        Thread thread1=new Thread(runnable1);
        thread1.start();



    }
}
