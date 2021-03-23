package AST;
import Compiler.*;
import Errors.*;

	 public class StatementList1 implements Statement, StatementList{
		public final Statement o2;
		public final StatementList o3;
		public StatementList1(Statement o2,StatementList o3){
			this.o2=o2;
			this.o3=o3;
		}
		public StatementList1(Statement o2){
			this.o2=o2;
			this.o3=null;
		}
		
		public void Comprobar() throws CompilerExc{
			if(this.o2!=null){
			this.o2.Comprobar();
			}
			if(this.o3!=null){
				this.o3.Comprobar();
			}
		}
	}