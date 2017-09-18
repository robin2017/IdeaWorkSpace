import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/18
 * Time : 下午9:46
 * Version : 1.0
 * Description : desc
 */

@XStreamAlias("dbColumn")
public class DbColunmInfo {
    /**列的名称*/
    private String columnName;

    /**列的类型*/
    private String columnType;

    /**中文名*/
    private String chinaParamName;

    /**是否集合类型*/
    private boolean repeated = false;

    /**嵌套结构*/
    private List<DbColunmInfo> dbColunmInfoList = new ArrayList<DbColunmInfo>();

    /**列说明*/
    private String desc;

    /**是否为主键*/
    private String isPrimaryKey;

    /**是否支持搜索*/
    private String isSearchSupported;

    /**是否支持排序*/
    private String isSortedSupported;

    /**是否搜索显示*/
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

    public List<DbColunmInfo> getDbColunmInfoList() {
        return dbColunmInfoList;
    }

    public void setDbColunmInfoList(List<DbColunmInfo> dbColunmInfoList) {
        this.dbColunmInfoList = dbColunmInfoList;
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
}
