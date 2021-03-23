package AST;
import Compiler.*;
import Errors.*;

	 public class FinalState implements S{
		public final String i1;
		public FinalState(String i1){
			this.i1=i1;
		}
	public void Comprobar() throws CompilerExc{
		table.transsearch(i1, 2);
	}
	
	}
