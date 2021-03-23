import Parser.*;
import Lexer.*;
import java.io.*;
import AST.*;

public class Main
{
  public static void main(String args[]) throws Exception{
    java.io.BufferedReader in;
    Yylex_skel sc;
    parser p;
    java_cup.runtime.Symbol sroot;
    boolean error=false;
	S Prog;

    //El primer parametro es el nombre del fichero con el programa
    if (args.length < 1) {
      System.out.println(
        "Uso: java Main <nombre_fichero>");
      error=true;
    }

    //Análisis léxico y sintáctico

    if (!error) {  
	try {
	    in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
	    sc = new Yylex_skel(in);
	    p = new parser(sc);
	    sroot = p.parse();
		Prog = (S)sroot.value;
		System.out.println("Se viene");
		Prog.Comprobar();
		System.out.println("Se vino");
	    System.out.println("Analisis lexico y sintactico correctos");
	} catch(IOException e) {
	    System.out.println("Error abriendo fichero: " + args[0]);
	    error= true;
	}
    }
	//profe yasuo player
  }
}
