package Errors;

public class StartStateException extends CompilerExc {

	private String name;

  public StartStateException(String name) {
     this.name = name;
       }

  public String toString() {
     return "Incorrect start state : " + this.name;
       }
}
