package AST;
import Compiler.*;
import Errors.*;

public class OutputEventDecl implements IdentList{
	public final IdentList x1;
	public OutputEventDecl(IdentList x1){
		this.x1 = x1;
	}

	public void Comprobar() throws CompilerExc{
		this.x1.Comprobar(7);
	}
	public void Comprobar(int type){

	}
}
