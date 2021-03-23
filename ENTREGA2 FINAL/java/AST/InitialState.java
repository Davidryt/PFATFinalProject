package AST;
import Compiler.*;
import Errors.*;

 public class InitialState implements S {

	 public final String i3;

	 public InitialState(String i3){
		 this.i3=i3;
	 }

 public void Comprobar()throws CompilerExc{
	 table.transsearch(i3,1);
 }
 public String getString(){
   return i3;
 }
 }
