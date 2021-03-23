package Compiler;
import Errors.*;
import java.util.*;

public class SymbolTable{

  private static Vector<TableEntry> table;

 public SymbolTable(){
   this.table = new Vector<TableEntry>();
 }

  public static void newEntry(String name, Integer type ) throws DoubleDefException{
    TableEntry e = search(name,type);
	//System.out.println("Busqueda de " + name + "completada");
    if(e==null){
      e = new TableEntry(name, type);
      table.add(e);
    }else{
      throw new DoubleDefException(name);
    }
  }
  
    public static void newEntry(String name, String name2, Integer type ) throws DoubleTransitionException{
    TableEntry e = searchtran(name, name2,type);
	//System.out.println("Busqueda de " + name + " , "+ name2 + " completada");
    if(e==null){
      e = new TableEntry(name, name2, type);
      table.add(e);
    }else{
      throw new DoubleTransitionException(name, name2);
    }
  }

  // public static void newEntryinit(String name, Integer type ) throws InitializationVariableException{
    // TableEntry e = search(name,type);
	// System.out.println("Busqueda de INITIALIZATION " + name + "completada");
    // if(e==null){
      // e = new TableEntry(name, type);
      // table.add(e);
    // }else{
      // throw new InitializationVariableException(name);
    // }
  // }



public static Integer getType(String name) throws VarNoDefException{
  TableEntry e = search(name);
  if(e==null){
    throw new VarNoDefException(name);
  }else{
    return e.getType();
  }
}

public static TableEntry search(String name){
  TableEntry e =null;
  int i =0;
  while(i<table.size()){
    e = table.get(i);
		if(e.getName().equals(name)){	
			return e;
		
		}
	e=null;
	i++;
 }
return null;
}



public static TableEntry search(String name, Integer type){
  TableEntry e =null;
  int i =0;
  while(i<table.size()){
    e = table.get(i);
	//System.out.println("Tipo" + type);
	if(type != 1 && type != 2){
		if(type != 3 && type != 7){
			//System.out.println("Tipo dist 1 o 2 o 3 o 7");
			if(e.getName().equals(name)&& e.getType()== type){
				//System.out.println("if viejo");
				return e;
			}
		}else{
			//System.out.println("Tipo 3 o 7");
			if(e.getName().equals(name)&& (e.getType()== 3 ||e.getType()== 7)){
			//System.out.println("excepcion event");
			return e;
			}	
		}
	}else{ 
		//System.out.println("Tipo ES 1 o 2");
		int type2;
		if (type == 1){ type2= 2;}
		else{type2 =1;}
		
		if((e.getName().equals(name)&& e.getType()== type) || (e.getName().equals(name)&& e.getType()== type2)){
			//System.out.println("if nuevo");
			return e;
		}
	}
	e=null;
	i++;
 }
return null;
}


public static TableEntry searchtran(String name,String name2, Integer type){
  TableEntry e =null;
  int i =0;
  while(i<table.size()){
    e = table.get(i);
	if(e.getName2()!=null){
		if(e.getName().equals(name)&& e.getName2().equals(name2)&& e.getType()== type){
			//System.out.println("ya existe transicion, problemas");
			return e;
		}
	}
	e=null;
	i++;
 }
return null;
}


/*									s1			1		*/
public static void startsearch(String name, Integer type)throws StartStateException{
	TableEntry e =null;
	int i =0;
	boolean todoguay = false;
	//System.out.println("Comprobando Incial "+ name + " con tipo "+ type);
	while(i<table.size()){
    e = table.get(i);
		if(e.getName().equals(name)&& e.getType()== type){
			//System.out.println("BIEN");
			todoguay = true;
		}
		if(e.getName().equals(name)&& e.getType()== 2){
			//System.out.println("ME CAGO EN DIOS");
			throw new StartStateException(name);
		}
	e=null;
	i++;
 }
 if (todoguay == false){throw new StartStateException(name);}
 
}



public static void transsearch(String name, Integer type)throws TransitionException{
	TableEntry e =null;
	int i =0;
	boolean todoguay = false;
	//System.out.println("Comprobando tran "+ name + " con tipo "+ type);
	while(i<table.size()){
    e = table.get(i);
	if(type==1){
		if(e.getName().equals(name)&& e.getType()== type){
			//System.out.println("BIEN inicial tran");
			todoguay = true;
		}
		if(e.getName().equals(name)&& e.getType()== 2){
			//System.out.println("DAMN init tran");
			throw new TransitionException(name,type);
		}
	}
	if(type==3){
		if(e.getName().equals(name)&& (e.getType()== 3 ||e.getType()== 7)){
			//System.out.println("BIEN event tran");
			todoguay = true;
		}
	}
	if(type==2){
		if(e.getName().equals(name)&& (e.getType()== 1 ||e.getType() ==2 ) ){ 
			//System.out.println("BIEN final tran");
			todoguay = true;
		}
	}
	
	e=null;
	i++;
 }
 if (todoguay == false){throw new TransitionException(name,type);}
 
}



public static void asigsearch(String name, Integer type, Integer type2) throws LocalEventException{
  TableEntry e =null;
  int i =0;
  boolean todoguay = false;
  while(i<table.size()){
    e = table.get(i);
	//System.out.println("<><><> Tipo" + type + "and" + type2);
		if(e.getName().equals(name)&& (e.getType()== type|| e.getType()==type2)){
			//System.out.println("BIEN ASIG");
			todoguay = true;
		}
		
	e=null;
	i++;
 }
 if (todoguay == false){throw new LocalEventException(name);}
}

public static void initsearch(String name, Integer type) throws InitializationVariableException{
  TableEntry e =null;
  int i =0;
  while(i<table.size()){
    e = table.get(i);
		if(e.getName().equals(name)&& (e.getType()== 4|| e.getType()==7)){
			//System.out.println("CASO DANGEROUS");
			String newname = name+"_init";
				TableEntry f = search(newname,type);
				//System.out.println("Busqueda de INITIALIZATION " + name + "completada");
				if(f==null){
				f = new TableEntry(newname, type);
				table.add(f);
				}else{
				throw new InitializationVariableException(newname);
				}	
		}	
	e=null;
	i++;
 }	
}


public static void expcheck(String name) throws LocalEventExpException{
  TableEntry e =null;
  int i =0;
  boolean todoguay = false;
  while(i<table.size()){
    e = table.get(i);
		if(e.getName().equals(name)&& (e.getType()== 4|| e.getType()==7)){
			//System.out.println("BIEN EXPPPP");
			todoguay = true;
		}
		
	e=null;
	i++;
 }
 if (todoguay == false){throw new LocalEventExpException(name);}
}






}
