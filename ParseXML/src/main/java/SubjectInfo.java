import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/18
 * Time : 下午9:58
 * Version : 1.0
 * Description : desc
 */
@XStreamAlias("subjectInfo")
public class SubjectInfo {
    private String version;
    private Short security;
    private Integer format;
    private String providerDepart;

    /**主题名称，业务名称*/
    private String subjectName;

    /**服务描述*/
    private String subjectDesc;

    /**服务标识*/
    private String restFlag;

    /**业务 business */
    private Integer biz;

    /**发布机构*/
    private Integer publicOrg;

    /**关键词*/
    private String keywords;

    /**主题对应的业务对象，有系统增加seealse注解*/
    private String bizObject;

    /**标识主题的数据源，主题注册文件中通过标签*/
    private String dataSourceName;

    /**配置时间列*/
    private String timeColumn;

    /**详细页面展示地址*/
    private String dispalyUrl;

    /**单元页面展现地址*/
    private String displayUnitUrl;

    /**主题的路由策略*/
    private Integer router;
    private SubjectConfig subjectConfig;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Short getSecurity() {
        return security;
    }

    public void setSecurity(Short security) {
        this.security = security;
    }

    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public String getProviderDepart() {
        return providerDepart;
    }

    public void setProviderDepart(String providerDepart) {
        this.providerDepart = providerDepart;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }

    public String getRestFlag() {
        return restFlag;
    }

    public void setRestFlag(String restFlag) {
        this.restFlag = restFlag;
    }

    public Integer getBiz() {
        return biz;
    }

    public void setBiz(Integer biz) {
        this.biz = biz;
    }

    public Integer getPublicOrg() {
        return publicOrg;
    }

    public void setPublicOrg(Integer publicOrg) {
        this.publicOrg = publicOrg;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getBizObject() {
        return bizObject;
    }

    public void setBizObject(String bizObject) {
        this.bizObject = bizObject;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public String getTimeColumn() {
        return timeColumn;
    }

    public void setTimeColumn(String timeColumn) {
        this.timeColumn = timeColumn;
    }

    public String getDispalyUrl() {
        return dispalyUrl;
    }

    public void setDispalyUrl(String dispalyUrl) {
        this.dispalyUrl = dispalyUrl;
    }

    public String getDisplayUnitUrl() {
        return displayUnitUrl;
    }

    public void setDisplayUnitUrl(String displayUnitUrl) {
        this.displayUnitUrl = displayUnitUrl;
    }

    public Integer getRouter() {
        return router;
    }

    public void setRouter(Integer router) {
        this.router = router;
    }

    public SubjectConfig getSubjectConfig() {
        return subjectConfig;
    }

    public void setSubjectConfig(SubjectConfig subjectConfig) {
        this.subjectConfig = subjectConfig;
    }


    @Override
    public String toString() {
        return "SubjectInfo{" +
                "version='" + version + '\'' +
                ", security=" + security +
                ", format=" + format +
                ", providerDepart='" + providerDepart + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectDesc='" + subjectDesc + '\'' +
                ", restFlag='" + restFlag + '\'' +
                ", biz=" + biz +
                ", publicOrg=" + publicOrg +
                ", keywords='" + keywords + '\'' +
                ", bizObject='" + bizObject + '\'' +
                ", dataSourceName='" + dataSourceName + '\'' +
                ", timeColumn='" + timeColumn + '\'' +
                ", dispalyUrl='" + dispalyUrl + '\'' +
                ", displayUnitUrl='" + displayUnitUrl + '\'' +
                ", router=" + router +
                ", subjectConfig=" + subjectConfig +
                '}';
    }
}
