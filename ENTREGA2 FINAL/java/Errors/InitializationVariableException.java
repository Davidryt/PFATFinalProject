package Errors;

public class InitializationVariableException extends CompilerExc {

	private String name;

  public InitializationVariableException(String name) {
     this.name = name;
       }

  public String toString() {
     return "The variable " + this.name + " is not an OutputEventDecl or LocalVarDecl initialized only once";
       }
}
