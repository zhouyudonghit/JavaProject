package Observer;

/**
 * ���󱻹۲��߽ӿ�
 * @author localuser
 *
 */
public interface Observerable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
