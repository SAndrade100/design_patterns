package singletonPattern;

public class SingletonPatternEx {
    public static void main(String[] args) {
        System.out.println("*** Singleton Pattern Demo ***\n");
        System.out.println("Tentando escolher um novo capitão");

        MakeACaptain1 c1 = MakeACaptain1.getInstance();
        System.out.println("Tentando escolher um segundo capitão.");
        MakeACaptain1 c2 = MakeACaptain1.getInstance();

        if(c1 == c2) {
            System.out.println("c1 e c2 são a mesma instância.");
        }
    }
}
