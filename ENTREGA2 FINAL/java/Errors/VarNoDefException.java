package Errors;

public class VarNoDefException extends CompilerExc {

	private String name;

  public VarNoDefException(String name) {
     this.name = name;
       }

  public String toString() {
     return "The variable " + this.name + " is not defined";
       }
}
