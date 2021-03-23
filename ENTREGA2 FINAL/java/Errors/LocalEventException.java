package Errors;

public class LocalEventException extends CompilerExc {

	private String name;


  public  LocalEventException(String name) {
     this.name = name;
       }


  public String toString() {
         return "Error bad declaration (local or OutputEventDecl)" + name;
       }
}
