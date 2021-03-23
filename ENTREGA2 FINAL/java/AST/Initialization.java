package AST;
import Compiler.*;
import Errors.*;

public class Initialization implements SimpleStatementList{

	public final String ident;
	public final SimpleStatementList s2;

	public Initialization(String ident, SimpleStatementList s2){
     this.ident=ident;
		 this.s2=s2;
	}

	public void Comprobar() throws CompilerExc{
		//System.out.println("\n INIT \n");
		table.startsearch(this.ident, 1);
		//System.out.println("\n LISTADO \n");
		this.s2.Comprobar();
	}
}
