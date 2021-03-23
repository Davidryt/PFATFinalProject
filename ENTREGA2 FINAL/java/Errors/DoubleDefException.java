package Errors;

public class DoubleDefException extends CompilerExc {

	private String name;

  public DoubleDefException(String name) {
     this.name = name;
       }

  public String toString() {
     return "Double Definition Exception found at: " + this.name;
       }
}
