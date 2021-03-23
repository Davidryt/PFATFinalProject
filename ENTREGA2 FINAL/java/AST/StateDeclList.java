package AST;
import Compiler.*;
import Errors.*;

public class StateDeclList implements IdentList{

	public final IdentList y2;

	public StateDeclList(IdentList y2){
		this.y2=y2;
	}

	public void Comprobar() throws CompilerExc{
		this.y2.Comprobar(1);
	}
	public void Comprobar(int type){

	}
}
