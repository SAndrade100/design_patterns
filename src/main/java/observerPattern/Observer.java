package observerPattern;

import java.util.*;

// Classe para observar alterações

public class Observer implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("Observer1: myValue in Subject is now: "+i);
    }
}
