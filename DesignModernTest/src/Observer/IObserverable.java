package Observer;

/**
 * 抽象被观察者接口
 * @author localuser
 *
 */
public interface IObserverable {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObserver();
}
