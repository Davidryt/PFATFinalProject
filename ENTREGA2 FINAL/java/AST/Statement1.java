package AST;
import Compiler.*;
import Errors.*;

   public class Statement1 implements Statement, ExpLog, StatementList{
		 public final int cint;
		 public final String ident;
		 public final ExpLog a3;
		 public final StatementList s4;
		 public Statement1(int cint){
			 this.cint= cint;
			 this.s4=null;
			 this.a3=null;
			 this.ident=null;
		 }
		public Statement1(){
			this.cint=-1;
			this.s4=null;
			this.a3=null;
			this.ident=null;
		}

		public Statement1(String ident, ExpLog a3){
			this.ident=ident;
			this.cint=-1;
			this.a3=a3;
			this.s4=null;
		}

		public Statement1(ExpLog a3, StatementList s4){
			 this.a3=a3;
			 this.s4=s4;
			 this.cint=-1;
			 this.ident=null;
		}

		public void Comprobar() throws CompilerExc{
			if(this.ident != null){
				//System.out.println("STRING --> " + this.ident);
				table.asigsearch(ident, 4, 7);
			}

			if(this.a3!=null){
				//System.out.println("EXP --> ");
				this.a3.Comprobar();
			}

			 //System.out.println("NUMERO --> "+ this.cint);


			if(this.s4!=null){
				//System.out.println("ESTAMOS EN UN IF ");
				//this.a3.Comprobar();
				//System.out.println("NUMERO --> "+ this.cint);
				this.s4.Comprobar();
			}
		}
	}
