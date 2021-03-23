package AST;
import Compiler.*;
import Errors.*;

public class LocalVarDecl implements IdentList{

	public final IdentList x2;
	public LocalVarDecl(IdentList x2){
		this.x2=x2;
	}

	public void Comprobar() throws CompilerExc{
		this.x2.Comprobar(4);
	}
	public void Comprobar(int type){

	}
}
