package it.unibo.es1;

import java.util.*;

public interface Logics {
	
	/**
	 * @return the number of buttons (except Print)
	 */
	int size();
	
	/**
	 * @return ordered integers to appear in buttons
	 */
	List<Integer> values();
	
	/**
	 * @return ordered booleans stating whether a button is enabled
	 */
	List<Boolean> enablings();
	
	/**
	 * @return the new value a button should show after being pressed
	 */
	int hit(int elem);
		
	/**
	 * @return the string to be produced as Print is pressed
	 */
	String result();
	
	/**
	 * @return whether it is time to quit
	 */
	boolean toQuit();
}
