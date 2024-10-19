package singletonPattern;

public class MakeACaptain2 {
    // Eager initialization
    private static MakeACaptain2 _instance = new MakeACaptain2();
    private MakeACaptain2() {}

    public static MakeACaptain2 getInstance() {
        return _instance;
    }
}
