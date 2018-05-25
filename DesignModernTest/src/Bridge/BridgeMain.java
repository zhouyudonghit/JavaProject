package Bridge;

/**
 * ге╫сдёй╫
 * @author localuser
 *
 */
public class BridgeMain {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Color color = new White();
        Shape shape = new Circle();
        shape.setColor(color);
        shape.draw();
        
        Shape shape2 = new Rectangle();
        shape2.setColor(color);
        shape2.draw();
	}
}
