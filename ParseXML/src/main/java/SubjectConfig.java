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
    private List<DbColumnInfo> inputs = new ArrayList<DbColumnInfo>();
    private List<DbColumnInfo> outputs = new ArrayList<DbColumnInfo>();

    public BaseSQL getBaseSQL() {
        return baseSQL;
    }

    public void setBaseSQL(BaseSQL baseSQL) {
        this.baseSQL = baseSQL;
    }

    public List<DbColumnInfo> getInputs() {
        return inputs;
    }

    public void setInputs(List<DbColumnInfo> inputs) {
        this.inputs = inputs;
    }

    public List<DbColumnInfo> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<DbColumnInfo> outputs) {
        this.outputs = outputs;
    }

    @Override
    public String toString() {
        return "SubjectConfig{" +
                "baseSQL=" + baseSQL +
                ", inputs=" + inputs +
                ", outputs=" + outputs +
                '}';
    }
}
