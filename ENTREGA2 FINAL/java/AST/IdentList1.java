package AST;
import Compiler.*;
import Errors.*;

 public class IdentList1 implements IdentList{

	public final String w1;
	public final IdentList w2;

	public IdentList1(String w1){
		this.w1=w1;
		this.w2 =null;
	}

	public IdentList1(String w1, IdentList w2){
		this.w1=w1;
		this.w2=w2;
	}

  public void Comprobar(int type) throws CompilerExc{
		table.newEntry(this.w1, type);
		if(this.w2 != null){
			this.w2.Comprobar(type);
		}
  }
  
  public void Comprobar() throws CompilerExc{ /* Borrar?*/
  }
}
