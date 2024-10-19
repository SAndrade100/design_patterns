package singletonPattern;

public class MakeACaptain1 {
    private static MakeACaptain1 _instance;
    private MakeACaptain1() {};

    // Lazy initialization
    public static synchronized MakeACaptain1 getInstance() {
        if(_instance == null) {
            _instance = new MakeACaptain1();
            System.out.println("Novo capitão selecionado para o time de futebol.");
        } else {
            System.out.println("Seu time já tem um capitão.");
        }
        return _instance;
    }
}
