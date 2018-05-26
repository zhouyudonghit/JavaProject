package TemplatePackage;

public abstract class AbstractCarTemplate {
    protected abstract void start();
    protected abstract void stop();
    protected void execute()
    {
    	start();
    	stop();
    }
}
