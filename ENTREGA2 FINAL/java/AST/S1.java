package AST;
import Compiler.*;
import Errors.*;

public class S1 implements S {

	public final StateDeclList statedeclist; //Estado Inicial
	public final FinalStateDeclList finalstatedecllist; //Estado Final
	public final InputEventDecl inputeventdecl; //Evento de entrada
	public final LocalVarDecl localvardecl;  //Variable de entrada y de salida
	public final OutputEventDecl outputevendecl; //Evento de salida
	public final Initialization initialization; //Inicializaciones
	public final Transitions transitions;       //Transiciones


	public S1( StateDeclList statedeclist, FinalStateDeclList finalstatedecllist, InputEventDecl inputeventdecl,LocalVarDecl localvardecl,
	OutputEventDecl outputevendecl, Initialization initialization, Transitions transitions){

		this.statedeclist= statedeclist;
		this.finalstatedecllist = finalstatedecllist;
		this.inputeventdecl = inputeventdecl;
		this.localvardecl = localvardecl;
		this.outputevendecl = outputevendecl;
		this.initialization = initialization;
		this.transitions = transitions;

	}

	 public S1( StateDeclList statedeclist, FinalStateDeclList finalstatedecllist,InputEventDecl inputeventdecl, OutputEventDecl outputevendecl, Initialization initialization,
   Transitions transitions){

    	this.statedeclist= statedeclist;
    	this.finalstatedecllist= finalstatedecllist;
    	this.inputeventdecl = inputeventdecl;
    	this.outputevendecl = outputevendecl;
    	this.initialization = initialization;
    	this.transitions = transitions;
		this.localvardecl = null;


    }

	public S1( StateDeclList statedeclist, InputEventDecl inputeventdecl, LocalVarDecl localvardecl,OutputEventDecl outputevendecl,Initialization initialization,
   Transitions transitions){
      this.statedeclist = statedeclist;
	  this.finalstatedecllist = null;
      this.inputeventdecl= inputeventdecl;
      this.localvardecl = localvardecl;
      this.outputevendecl = outputevendecl;
      this.initialization = initialization;
      this.transitions= transitions;



 	}

	public S1(StateDeclList statedeclist,InputEventDecl inputeventdecl, OutputEventDecl outputevendecl,Initialization initialization,Transitions transitions){
	   this.statedeclist = statedeclist;
	   this.finalstatedecllist = null;
       this.inputeventdecl = inputeventdecl;
	   this.localvardecl = null;
       this.outputevendecl = outputevendecl;
       this.initialization = initialization;
       this.transitions = transitions;


    }

		public void Comprobar() throws CompilerExc{
			// if(initialstate.Comprobar().equals(finalstate.Comprobar())){
				// throw new DoubleDefException();
			// }
			// System.out.println("Se add");
			// tabla.newEntry("hola", true);
			// System.out.println("Se ha add");
			if (statedeclist!=null){
				statedeclist.Comprobar();
			}
			if (finalstatedecllist!=null){
				finalstatedecllist.Comprobar();
			}
			if (inputeventdecl!=null){
				inputeventdecl.Comprobar();
			}
			if (localvardecl!=null){
				localvardecl.Comprobar();
			}
			if (outputevendecl!=null){
				outputevendecl.Comprobar();
		
			}
			if (initialization!=null){
				initialization.Comprobar();
			}
			if (transitions!=null){
					transitions.Comprobar();
			}

		}

}
