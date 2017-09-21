import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("dbColumn")
public class DbColumnInfo {
    private String columnName;

    private String columnType;

    private String chinaParamName;

    private boolean repeated = false;

    private List<DbColumnInfo> dbColumnInfoList = new ArrayList<DbColumnInfo>();

    private String desc;

    private String isPrimaryKey;

    private String isSearchSupported;

    private String isSortedSupported;

    private String isSearchDisplay;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getChinaParamName() {
        return chinaParamName;
    }

    public void setChinaParamName(String chinaParamName) {
        this.chinaParamName = chinaParamName;
    }

    public boolean isRepeated() {
        return repeated;
    }

    public void setRepeated(boolean repeated) {
        this.repeated = repeated;
    }

    public List<DbColumnInfo> getDbColumnInfoList() {
        return dbColumnInfoList;
    }

    public void setDbColumnInfoList(List<DbColumnInfo> dbColumnInfoList) {
        this.dbColumnInfoList = dbColumnInfoList;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIsPrimaryKey() {
        return isPrimaryKey;
    }

    public void setIsPrimaryKey(String isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public String getIsSearchSupported() {
        return isSearchSupported;
    }

    public void setIsSearchSupported(String isSearchSupported) {
        this.isSearchSupported = isSearchSupported;
    }

    public String getIsSortedSupported() {
        return isSortedSupported;
    }

    public void setIsSortedSupported(String isSortedSupported) {
        this.isSortedSupported = isSortedSupported;
    }

    public String getIsSearchDisplay() {
        return isSearchDisplay;
    }

    public void setIsSearchDisplay(String isSearchDisplay) {
        this.isSearchDisplay = isSearchDisplay;
    }

    @Override
    public String toString() {
        return "DbColumnInfo{" +
                "columnName='" + columnName + '\'' +
                ", columnType='" + columnType + '\'' +
                ", chinaParamName='" + chinaParamName + '\'' +
                ", repeated=" + repeated +
                ", dbColumnInfoList=" + dbColumnInfoList +
                ", desc='" + desc + '\'' +
                ", isPrimaryKey='" + isPrimaryKey + '\'' +
                ", isSearchSupported='" + isSearchSupported + '\'' +
                ", isSortedSupported='" + isSortedSupported + '\'' +
                ", isSearchDisplay='" + isSearchDisplay + '\'' +
                '}';
    }
}