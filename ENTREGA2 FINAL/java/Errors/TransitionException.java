package Errors;

public class TransitionException extends CompilerExc {

	private String name;
  private Integer number;

  public TransitionException(String name, Integer number) {
     this.name = name;
		 this.number=number;
       }

  public String toString() {
		if(number==1){
			return "Incorrect initial state: " + this.name;
		}
		 if(number==3){
			 return "Incorrect event " + this.name;
		 }
		if(number==2){
			 return "Incorrect state" + this.name;
		}
		return null;
 }


}
