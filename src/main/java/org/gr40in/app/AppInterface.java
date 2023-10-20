package org.gr40in.app;

public interface AppInterface<T> {
    public void showInfo(T message);

    public void showMenu();

    public T getInfo();
}
