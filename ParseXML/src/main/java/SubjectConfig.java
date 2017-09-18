import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/18
 * Time : 下午9:55
 * Version : 1.0
 * Description : desc
 */
@XStreamAlias("subjectConfig")
public class SubjectConfig {
    private BaseSQL baseSQL;
    private List<DbColunmInfo> inputs = new ArrayList<DbColunmInfo>();
    private List<DbColunmInfo> outputs = new ArrayList<DbColunmInfo>();

    public BaseSQL getBaseSQL() {
        return baseSQL;
    }

    public void setBaseSQL(BaseSQL baseSQL) {
        this.baseSQL = baseSQL;
    }

    public List<DbColunmInfo> getInputs() {
        return inputs;
    }

    public void setInputs(List<DbColunmInfo> inputs) {
        this.inputs = inputs;
    }

    public List<DbColunmInfo> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<DbColunmInfo> outputs) {
        this.outputs = outputs;
    }
}
