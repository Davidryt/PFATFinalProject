package AST;
import Compiler.*;
import Errors.*;

public class TransitionList1 implements Transition,TransitionList{
	public final Transition t1;
	public final TransitionList t2;
	public TransitionList1(Transition t1){
		this.t1=t1;
		this.t2=null;
	}

	public TransitionList1(Transition t1, TransitionList t2){
		this.t1=t1;
		this.t2=t2;
	}
	
  public void Comprobar() throws CompilerExc{
		this.t1.Comprobar();
		if(this.t2 != null){
			this.t2.Comprobar();
		}
  }
}