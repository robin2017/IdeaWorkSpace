import com.thoughtworks.xstream.XStream;
import org.springframework.core.io.Resource;


import java.io.IOException;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/18
 * Time : 下午10:07
 * Version : 1.0
 * Description : desc
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Resource r = getResouceRobin();
        XStream xs = new XStream();
        xs.autodetectAnnotations(true);
        xs.processAnnotations(SubjectInfo.class);
        SubjectInfo subjectInfo = (SubjectInfo)xs.fromXML(r.getInputStream());
        System.out.println(subjectInfo);
    }

    private static Resource getResouceRobin() {
        String path = "classpath*:subjectConfig/**/*.xml";
        Resource[] ress = ResourceUtil.getResource(path);
        return ress[0];
    }
}
