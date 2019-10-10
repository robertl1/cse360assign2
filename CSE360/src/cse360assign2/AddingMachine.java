package cse360assign2;
/*
 * https://github.com/robertl1/cse360assign2/blob/master/CSE360/src/cse360assign2/AddingMachine.java
 * User: robertl1
 * Pass: Gghhjjkkll1
 */
public class AddingMachine {
	
	/**
	 * Total variable will keep total amount of added or removed.
	 * History variable will keep track of what is added or removed.
	 */
	private int total;
	private String history;
	
	/**
	 * This is a constructor that initializes the total variable to 0.
	 * Initializing history variable to 0 to make first value to be 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	
	/**
	 * Returns the total value of total.
	 * But for now it is returning 0.
	 * @return returns the total variable
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * The method adds the parameter value to the total.
	 * @param adds value the value variable to total.
	 * History will keep track of addition operator and what value is being added.
	 */
	public void add (int value) {
		total += value;
		history = history + " + ";
		history = history + value;
	}
	
	/**
	 * The method subtracts the value given from the total variable.
	 * @param value to be subtracted from total.
	 * History will keep track of when a subtraction is done and the value that is being used to subtract
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - ";
		history = history + value;
	}
		
	/**
	 * This method will return a history of method commands to the user.
	 * @return Returns the history of additions and subtractions done.
	 */
	public String toString () {
		return history;
	}

	/**
	 * Resets the AddingMachine variables.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
