package Observer;

/**
 * ���󱻹۲��߽ӿ�
 * @author localuser
 *
 */
public interface IObserverable {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObserver();
}
