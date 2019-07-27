package com.gl.profilesDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvDetails {
    @Value("${app.server.name}")
    private String appServerName;
    @Value("${app.server.detail}")
    private String appServerDetail;
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String dbUser;
    @Value("${spring.datasource.password}")
    private String dbPassword;

    public EnvDetails() {

        System.out.println("");
    }

    public String getAppServerName() {
        return appServerName;
    }

    public void setAppServerName(String appServerName) {
        this.appServerName = appServerName;
    }

    public String getAppServerDetail() {
        return appServerDetail;
    }

    public void setAppServerDetail(String appServerDetail) {
        this.appServerDetail = appServerDetail;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    @Override
    public String toString() {
        return "EnvDetails{" +
                "appServerName='" + appServerName + '\'' +
                ", appServerDetail='" + appServerDetail + '\'' +
                ", dbUrl='" + dbUrl + '\'' +
                ", dbUser='" + dbUser + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                '}';
    }
}
