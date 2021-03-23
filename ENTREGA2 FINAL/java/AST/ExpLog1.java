package AST;
import Compiler.*;
import Errors.*;

 public class ExpLog1 implements ExpLog{
    public final boolean clog;

  public ExpLog1(boolean clog){
        this.clog = clog;
     }

	 public void Comprobar() throws CompilerExc{
		 //System.out.println("\n \n \t Exp1:" + this.clog);
	 }
}
