package AST;
import Compiler.*;
import Errors.*;

 public class ExpLog3 implements ExpLog{
    public final String ident;
	public ExpLog3(String ident){
		this.ident=ident;
	}

	public void Comprobar() throws CompilerExc{
		 table.expcheck(this.ident);
		 //System.out.println("\n \n \tExp3:" + this.ident);
	}
}
