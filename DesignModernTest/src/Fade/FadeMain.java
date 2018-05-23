package Fade;

/**
 * 门面模式
 * 使用门面模式还有一个附带的好处，就是能够有选择性地暴露方法。一个模块中定义的方法可以分成两部分，一部分是给子系统外部使用的，
 * 一部分是子系统内部模块之间相互调用时使用的。有了Facade类，那么用于子系统内部模块之间相互调用的方法就不用暴露给子系统外部了。
 * @author localuser
 *
 */
public class FadeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fade fade = new Fade();
        fade.test();
	}

}
