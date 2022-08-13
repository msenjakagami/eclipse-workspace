package helpMichael;

public class Thing1 implements Printable{
	 private String str;
	 public Thing1()
	 {
	 this.str = "Thing 1";
	 }
	 public String print( boolean duplex )
	 {
	 return this.str + " duplex = " + duplex;
	 }
	 public String print()
	 {
	 // print single sided by default
	 return this.print( false ); 
	 }
}
