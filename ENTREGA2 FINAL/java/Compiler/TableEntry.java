package Compiler;

//aaaaaaaa

public class TableEntry{

private String name;
private String name2;
private Integer type;

public TableEntry(String n , Integer t){
  name =n;
  name2 = null;
  type = t;
}

public TableEntry(String n, String n2 , Integer t){
  name =n;
  name2 = n2;
  type = t;
}

public String getName(){
  return name;
}

public Integer getType(){
  return type;
}
public String getName2(){
  return name2;
}

}
