/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/19
 * Time : 下午9:58
 * Version : 1.0
 * Description : desc
 */

package robin;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/hello")
public class HelloService {
    @GET
    @Produces("text/plain")
    public String helloWorld(){
        return "hello world";
    }
}