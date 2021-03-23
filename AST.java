
public class S {

	public final int token;
	public final StateDeclList statedeclist;
	public final FinalStateDeclList finalstatedecllist;
	public final InputEventDecl inputeventdecl;
	public final LocalVarDecl localvardecl;
	public final OutputEventDecl outputevendecl;
	public final Initialization initialization;
	public final Transitions transitions;

	public S(int token, StateDeclList statedeclist, FinalStateDeclList finalstatedecllist, InputEventDecl inputeventdecl,LocalVarDecl localvardecl,
	OutputEventDecl outputevendecl, Initialization initialization, Transitions transitions){
		this.token = token;
		this.statedeclist= statedeclist;
		this.finalstatedecllist = finalstatedecllist;
		this.inputeventdecl = inputeventdecl;
		this.localvardecl = localvardecl;
		this.outputevendecl = outputevendecl;
		this.initialization = initialization;
		this.transitions = transitions;

	}
	
	 public S(int token, StateDeclList statedeclist, FinalStateDeclList finalstatedecllist,InputEventDecl inputeventdecl, OutputEventDecl outputevendecl, Initialization initialization,
   Transitions transitions){
    	this.token= token;
    	this.statedeclist= statedeclist;
    	this.finalstatedecllist= finalstatedecllist;
    	this.inputeventdecl = inputeventdecl;
    	this.outputevendecl = outputevendecl;
    	this.initialization = initialization;
    	this.transitions = transitions;
		this.localvardecl = null;

    }
	
	public S(int token, StateDeclList statedeclist, InputEventDecl inputeventdecl, LocalVarDecl localvardecl,OutputEventDecl outputevendecl,Initialization initialization,
   Transitions transitions){
      this.token = token;
      this.statedeclist = statedeclist;
	  this.finalstatedecllist = null;
      this.inputeventdecl= inputeventdecl;
      this.localvardecl = localvardecl;
      this.outputevendecl = outputevendecl;
      this.initialization = initialization;
      this.transitions= transitions;


 	}
	
	public S(StateDeclList statedeclist,InputEventDecl inputeventdecl, OutputEventDecl outputevendecl,Initialization initialization,Transitions transitions){
       this.token = 0;
	   this.statedeclist = statedeclist;
	   this.finalstatedecllist = null;
       this.inputeventdecl = inputeventdecl;
	   this.localvardecl = null;
       this.outputevendecl = outputevendecl;
       this.initialization = initialization;
       this.transitions = transitions;

    }

}




 interface State{}

 interface ExpLog{}

 interface SimpleStatementList{}

 interface StatementList{}

 interface Statement{}

 interface Transition{}

 interface TransitionList{}

 interface IdentList{}

class StateDeclList implements IdentList{
	public final IdentList y2;
	public StateDeclList(IdentList y2){
		this.y2=y2;
	}
}
class FinalStateDeclList implements IdentList{
	public final IdentList y1;
	public FinalStateDeclList(IdentList y1){
		this.y1=y1;
	}
}

 class IdentList1 implements IdentList{
	public final String w1;
	public IdentList1(String w1){
		this.w1=w1;
	}
}
 class IdentList2 implements IdentList{
	public final String w1;
	public final IdentList w2;
	public IdentList2(String w1, IdentList w2){
		this.w1=w1;
		this.w2=w2;
	}
}
class InputEventDecl implements IdentList{
	public final IdentList x3;
	public InputEventDecl(IdentList x3){
		this.x3=x3;
	}
}

class LocalVarDecl implements IdentList{
	public final IdentList x2;
	public LocalVarDecl(IdentList x2){
		this.x2=x2;
	}
}
class OutputEventDecl implements IdentList{
	public final IdentList x1;
	public OutputEventDecl(IdentList x1){
		this.x1 = x1;
	}
}

class Transitions implements TransitionList{
	public final TransitionList t4;
	public Transitions(TransitionList t4){
		this.t4=t4;
	}

}

class TransitionList1 implements Transition,TransitionList{
	public final Transition t1;
	public TransitionList1(Transition t1){
		this.t1=t1;
	}
}
class TransitionList2 implements Transition, TransitionList{
		public final Transition t1;
		public final TransitionList t2;
	public TransitionList2(Transition t1, TransitionList t2){
		this.t1=t1;
		this.t2=t2;
	}
}

  class Transition1 implements Transition{
  public final InitialState f1;
	public final Event f2;
	public final FinalState f3;
	public Transition1(InitialState f1, Event f2, FinalState f3){
		this.f1=f1;
		this.f2=f2;
		this.f3=f3;
	}
 }

 class Transition2 implements Transition{
	public final InitialState f4;
	public final Event f5;
	public final FinalState f6;
	public final TransBehaviour f7;
	public Transition2(InitialState f4, Event f5, FinalState f6, TransBehaviour f7){
		this.f4=f4;
		this.f5=f5;
		this.f6=f6;
		this.f7=f7;
	}
 }
  class Transition3 implements Transition{
 public final InitialState f8;
 public final Event f9;
 public final FinalState f10;
 public final Conditional f11;
 public Transition3(InitialState f8, Event f9, FinalState f10, Conditional f11){
	 this.f8=f8;
	 this.f9=f9;
	 this.f10=f10;
	 this.f11=f11;
 }
 }

 class Transition4 implements Transition{
 public final InitialState f12;
 public final Event f13;
 public final FinalState f14;
 public final TransBehaviour f15;
 public final Conditional f16;
 public Transition4(InitialState f12, Event f13, FinalState f14, TransBehaviour f15, Conditional f16){
	 this.f12=f12;
	 this.f13=f13;
	 this.f14=f14;
	 this.f15=f15;
	 this.f16=f16;
 }
 }

 class InitialState{
	 public final String i3;
	 public InitialState(String i3){
		 this.i3=i3;
	 }
 }
	 class Event{
		public final String i2;
		public Event(String i2){
			this.i2=i2;
		}
	}
	 class FinalState{
		public final String i1;
		public FinalState(String i1){
			this.i1=i1;
		}
	}
 class TransBehaviour implements StatementList{
		public final StatementList o1;
		public TransBehaviour(StatementList o1){
			this.o1=o1;
		}
	}
	 class StatementList1 implements Statement, StatementList{
		public final Statement o2;
		public final StatementList o3;
		public StatementList1(Statement o2,StatementList o3){
			this.o2=o2;
			this.o3=o3;
		}
	}

   class Statement1 implements Statement{
		 public final int cint;
		 public Statement1(int cint){
			 this.cint= cint;
		 }
		 public Statement1(){
			cint=0;
		}
	}

	class Statement2 implements Statement, ExpLog{
		public final String ident;
		public final ExpLog a3;
		public Statement2(String ident, ExpLog a3){
			this.ident=ident;
			this.a3=a3;
		}
	}

	class Statement3 implements Statement, ExpLog, SimpleStatementList{
		public final ExpLog a4;
		public final SimpleStatementList s4;
		public Statement3(ExpLog a4, SimpleStatementList s4){
			 this.a4=a4;
			 this.s4=s4;
		}
	}

class Initialization implements SimpleStatementList{
	public final String ident;
	public final SimpleStatementList s2;
	public Initialization(String ident, SimpleStatementList s2){
     this.ident=ident;
		 this.s2=s2;
	}
}

class SimpleStatementList1 implements SimpleStatementList{
	public final SimpleStatementList s1;
	public final String ident;
	public final boolean clog;
	public SimpleStatementList1(SimpleStatementList s1, String ident, boolean clog){
		this.s1= s1;
		this.ident=ident;
		this.clog=clog;
	}
}
class SimpleStatementList2 implements SimpleStatementList{
	public final String ident;
	public final boolean clog;
	public SimpleStatementList2(String ident, boolean clog){
		this.ident=ident;
		this.clog=clog;
	}
}


 class ExpLog1 implements ExpLog{
  public final boolean clog;
  public ExpLog1(boolean clog){
        this.clog = clog;
     }
 }

 class ExpLog2 implements ExpLog{
    public final String ident;
		public ExpLog2(String ident){
			this.ident=ident;

		}
 }

  class Explog3 implements ExpLog{
    public final ExpLog a1;
    public final ExpLog a2;
    public Explog3(ExpLog a1, ExpLog a2){
        this.a1=a1;
        this.a2=a2;
    }

     public Explog3(ExpLog a1){
        this.a1=a1;
        this.a2=null;
    }
}

  class Conditional implements ExpLog{
    public final ExpLog a;
    public Conditional(ExpLog a){
        this.a= a;
    }
 }
