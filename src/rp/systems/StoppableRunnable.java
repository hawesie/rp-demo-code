package rp.systems;


/**
 * An interface for a runnable that includes a public stop method too. This
 * should cause the runnable to stop running, allowing the thread running it to
 * be joined.
 * 
 * 
 * @author Nick Hawes
 * 
 */
public interface StoppableRunnable extends Runnable {

	void stop();

}
