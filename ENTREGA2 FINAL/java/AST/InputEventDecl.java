package AST;
import Compiler.*;
import Errors.*;

public class InputEventDecl implements IdentList{

	public final IdentList x3;
	public InputEventDecl(IdentList x3){
		this.x3=x3;
	}

	public void Comprobar() throws CompilerExc{
		this.x3.Comprobar(3);
	}
	public void Comprobar(int type){

	}
}
