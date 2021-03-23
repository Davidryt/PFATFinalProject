package AST;
import Compiler.*;
import Errors.*;

public class FinalStateDeclList implements IdentList{
	public final IdentList y1;
	public FinalStateDeclList(IdentList y1){
		this.y1=y1;
	}

	public void Comprobar() throws CompilerExc{
		this.y1.Comprobar(2);
	}
	public void Comprobar(int type){

	}
}
