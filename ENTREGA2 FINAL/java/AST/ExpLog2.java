 package AST;
import Compiler.*;
import Errors.*;

 public class ExpLog2 implements ExpLog{

  public final ExpLog a1;
    public final ExpLog a2;

 public ExpLog2(ExpLog a1, ExpLog a2){
        this.a1=a1;
        this.a2=a2;
    }
   public ExpLog2(ExpLog a1){
        this.a1=a1;
        this.a2=null;
    }

	public void Comprobar() throws CompilerExc{
		 //System.out.println("\tExp2");
		this.a1.Comprobar();
		if(this.a2 != null){
			// System.out.println("\tExp2 extra");
			this.a2.Comprobar();
		}
	}
}
