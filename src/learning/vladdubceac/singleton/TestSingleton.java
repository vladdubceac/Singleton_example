package learning.vladdubceac.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");

        MakeACaptain captain = MakeACaptain.getInstance();

        System.out.println("Trying to make another captain for our team");
        MakeACaptain captain1 = MakeACaptain.getInstance();

        if(captain1 == captain){
            System.out.println("captain and captain1 are the same instance");
        }
    }
}
