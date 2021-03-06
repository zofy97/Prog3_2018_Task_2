package Crossing;

/**
 * @Sophie Schauer s0559289
 * This class creates the event object
 */
public class EventObject implements java.io.Serializable{
    protected transient Object source;
    public EventObject (Object source)  {
        if(source == null)
            throw new IllegalArgumentException("null source");
        this.source = source;
    }
    public Object getSource()   {
        return source;
    }

    public String toString()    {
        return getClass().getName() + "(source=" + source + "]";
    }
}
