package AST;
import Compiler.*;
import Errors.*;

public class Transitions implements TransitionList{
	public final TransitionList t4;
	public Transitions(TransitionList t4){
		this.t4=t4;
	}
	
	public void Comprobar() throws CompilerExc{
		this.t4.Comprobar();
	}

}