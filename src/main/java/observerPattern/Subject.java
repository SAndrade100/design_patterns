package observerPattern;

import java.util.*;

// Classe onde as alterações são vigiadas

public class Subject implements ISubject {
    List<Observer> observerList = new ArrayList<Observer>();
    private int _flag;

    public int getFlag() {
        return _flag;
    }

    public void setFlag(int flag) {
        this._flag = flag;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
