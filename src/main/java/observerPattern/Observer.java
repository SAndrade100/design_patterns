package observerPattern;

// Classe para observar alterações

public class Observer implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("Observer1: flag possui agora o valor: "+ i);
    }
}
