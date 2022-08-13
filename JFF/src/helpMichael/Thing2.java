package helpMichael;

public class Thing2 implements Printable{
	private String str;
	 public Thing2()
	 {
	 this.str = "Thing 2";
	 }
	 public String print( boolean duplex )
	 {
	 return this.str + " duplex = " + duplex;
	 }
	 public String print( String user )
	 {
	 System.out.print( user + ": " );
	 // print double sided by default
	 return this.print( true );
	 } 
}
