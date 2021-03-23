package AST;
import Compiler.*;
import Errors.*;

public class SimpleStatementList2 implements SimpleStatementList{
	public final String ident;
	public final boolean clog;
	public SimpleStatementList2(String ident, boolean clog){
		this.ident=ident;
		this.clog=clog;
	}

	public void Comprobar() throws CompilerExc{
		//System.out.println("****** String " + ident + " and " + clog);
		table.getType(ident);
		table.initsearch(ident, 8);
	}
}
