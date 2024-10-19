package singletonPattern;

public class MakeACaptain3 {
    public static MakeACaptain3 _instance;
    private MakeACaptain3() {}

    private static class SingletonHolder {
        private static final MakeACaptain3 _instance = new MakeACaptain3();
    }

    public static MakeACaptain3 getInstance() {
        return SingletonHolder._instance;
    }
}
