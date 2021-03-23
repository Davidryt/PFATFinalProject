package AST;
import Compiler.*;
import Errors.*;

 public interface S{
   public static SymbolTable table = new SymbolTable();
   public void Comprobar() throws CompilerExc;
 }
