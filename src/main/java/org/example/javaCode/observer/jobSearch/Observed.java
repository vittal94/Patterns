package org.example.javaCode.observer.jobSearch;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
