
package leon.rpcws.impl;
import leon.rpcws.iface.IHello;
import javax.jws.WebService;
@WebService(endpointInterface = "leon.rpcws.iface.IHello")
public class HelloImpl implements IHello {
    //@Override
    public String sayHello(String name) {
        return "Hello JAX-WS. Welcome, "+name;
    }
}
