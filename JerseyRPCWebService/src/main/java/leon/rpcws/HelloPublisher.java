
package leon.rpcws;
import leon.rpcws.impl.HelloImpl;
import javax.xml.ws.Endpoint;
public class HelloPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:9999/ws/hello", new HelloImpl());
        System.out.println("published.");
    }
}
