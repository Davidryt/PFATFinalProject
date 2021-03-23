package AST;
import Compiler.*;
import Errors.*;

  public class Transition1 implements Transition{

  public final InitialState f1;
	public final Event f2;
	public final FinalState f3;
	public final TransBehaviour f7;
	 public final Conditional f11;

	public Transition1(InitialState f1, Event f2, FinalState f3){
		this.f1=f1;
		this.f2=f2;
		this.f3=f3;
		this.f7=null;
		this.f11=null;
	}

	public Transition1(InitialState f1, Event f2, FinalState f3, TransBehaviour f7){
		this.f1=f1;
		this.f2=f2;
		this.f3=f3;
		this.f7=f7;
		this.f11=null;
	}

 public Transition1(InitialState f1, Event f2, FinalState f3, Conditional f11){
	 this.f1=f1;
	 this.f2=f2;
	 this.f3=f3;
	 this.f7=null;
	 this.f11=f11;
 }

 public Transition1(InitialState f1, Event f2, FinalState f3, Conditional f11, TransBehaviour f7){
	 this.f1=f1;
	 this.f2=f2;
	 this.f3=f3;
	 this.f7=f7;
	 this.f11=f11;
 }

 public void Comprobar() throws CompilerExc{
   table.newEntry(f1.getString(), f2.getString(), 6);
   this.f1.Comprobar();
   this.f2.Comprobar();
   this.f3.Comprobar();
   if(this.f7!=null){
	   //System.out.println("\n\n TRANSBEHAVIOUR\n");
	   this.f7.Comprobar();
   }
   if (this.f11!=null){
	    //System.out.println("\n\n CONDICIONAL\n");
   this.f11.Comprobar();
   //System.out.println("\n\n");}
 }

 }
 }
