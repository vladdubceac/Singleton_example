package learning.vladdubceac.singleton;

public class MakeACaptain {

    private MakeACaptain(){
    }

    private static class CaptainHelper {
        private final static MakeACaptain INSTANCE = new MakeACaptain();
    }

    public static MakeACaptain getInstance(){
        return CaptainHelper.INSTANCE;
    }
}
