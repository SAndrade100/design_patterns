package observerPattern;

import java.util.*;

// Classe onde as alterações são vigiadas

public class Subject implements ISubject {
    List<IObserver> observerList = new ArrayList<IObserver>();
    private int _flag;

    public int getFlag() {
        return _flag;
    }

    public void setFlag(int flag) {
        this._flag = flag;
        notifyObservers(this.getFlag());
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
    public void notifyObservers(int flag) {
        for (IObserver observer : observerList) {
            observer.update(flag);
        }
    }
}
