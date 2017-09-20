
package rpctest;
import leon.rpcws.iface.IHello;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
public class TestRPC {
    public static void main(String[] args) throws Exception {
        //1: argument service URI, refer to wsdl document above  
        //2: argument is service name, refer to wsdl document above
        URL url = new URL("http://127.0.0.1:9999/ws/hello?wsdl");
        QName qname = new QName("http://impl.rpcws.leon/", "HelloImplService");
        Service service = Service.create(url, qname);
        IHello hello = service.getPort(IHello.class);

        System.out.println(hello.sayHello("Leon Su"));
    }
}

