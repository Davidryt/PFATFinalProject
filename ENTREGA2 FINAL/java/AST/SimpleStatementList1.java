package AST;
import Compiler.*;
import Errors.*;

public class SimpleStatementList1 implements SimpleStatementList{
	public final SimpleStatementList s1;
	public final String ident;
	public final boolean clog;

	public SimpleStatementList1(SimpleStatementList s1, String ident, boolean clog){
		this.s1= s1;
		this.ident=ident;
		this.clog=clog;
	}

	public void Comprobar() throws CompilerExc{
		//System.out.println("****** String " + ident + " and " + clog);
		table.getType(ident);
		table.initsearch(ident, 8);
		this.s1.Comprobar();
	}
}
