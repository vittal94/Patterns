package org.example.javaCode.decorator.notificationService;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapped;
    protected final DataBaseService dataBaseService;

    BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        dataBaseService = new DataBaseService();
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }

    @Override
    public String getUserName() {
        return wrapped.getUserName();
    }
}
