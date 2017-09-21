import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.apache.commons.lang.ArrayUtils;
/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/18
 * Time : 下午10:08
 * Version : 1.0
 * Description : desc
 */

public class ResourceUtil {
    private static PathMatchingResourcePatternResolver resolver;
     public static Resource[] getResource(String location) {
        Resource[] ress = null;
        try {
            if (null != resolver) {
                ress = resolver.getResources(location);
            }
        } catch (Exception e) {
            System.out.println("failed to getResource");
        }
        if (ArrayUtils.isEmpty(ress)) {
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            try {
                ress = resolver.getResources(location);
            } catch (Exception e) {
                System.out.println("failed to getResource");
            }
        }
        return ress;

     }
}
