package Errors;

public class DoubleTransitionException extends CompilerExc {

	private String name;
	private String name2;

  public DoubleTransitionException(String name, String name2) {
     this.name = name;
		 this.name2= name2;
       }

  public String toString() {
     return "Double Transition Exception found at: " + this.name + " and " + this.name2;
       }
}
