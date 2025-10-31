package HelloWorldServer;
import org.omg.CORBA.ORB;
import HelloWorldApp.HelloPOA;

public class HelloServant {
private String message= "Bonjour tous le monde !!"; 
private ORB orb;
public void setORB(ORB orb) { this.orb = orb; }


public String HelloMessage() {
	return message;
}
public void HelloMessage(String newHelloMessage) { message= newHelloMessage;}
}