package Observer;

/**
 * 抽象被观察者接口
 * @author localuser
 *
 */
public interface Observerable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
