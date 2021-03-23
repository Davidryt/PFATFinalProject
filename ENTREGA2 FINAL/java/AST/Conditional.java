package AST;
import Compiler.*;
import Errors.*;

 public class Conditional implements ExpLog{
    public final ExpLog a;
    public Conditional(ExpLog a){
        this.a= a;
    }
	
	public void Comprobar() throws CompilerExc{
		this.a.Comprobar();
	}
 }