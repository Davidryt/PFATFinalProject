package Errors;

public class LocalEventExpException extends CompilerExc {

	private String name;

  public LocalEventExpException(String name) {
     this.name = name;
       }

  public String toString() {
     return "Error bad declaration (local or OutputEventDecl) in Explog " + this.name;
       }
}
