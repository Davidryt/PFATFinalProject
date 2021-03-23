package AST;
import Compiler.*;
import Errors.*;

	 public class Event implements S{
		public final String i2;
		public Event(String i2){
			this.i2=i2;
		}

		public void Comprobar() throws CompilerExc{
			table.transsearch(i2, 3);
		}

		public String getString(){
			return i2;
		}
	}
