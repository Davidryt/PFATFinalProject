package AST;
import Compiler.*;
import Errors.*;

 public class TransBehaviour implements StatementList{
		public final StatementList o1;
		public TransBehaviour(StatementList o1){
			this.o1=o1;
		}
		
		public void Comprobar() throws CompilerExc{
			if(this.o1!=null){
			this.o1.Comprobar();
			}
		}
	}