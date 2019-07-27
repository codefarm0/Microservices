package com.gl.propertiesDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Configuration
public class User {
    @Value("${user.fb.name:defaultUser}")
    private String fbUser;
    @Value("${user.fb.password}")
    private String fbPassword;
    @Value("${user.gmail.name}")
    private String gmailUser;
    @Value("${user.gmail.password}")
    private String gmailPassword;

    @Value("#{'${list}'.split(',')}")
    private List<String> listOfItem;

    @Value("${list}")
    private List<String> arrayVal;

    @Value("#{${values.map}}")
    private Map<String, Integer> mapValue;

    @Value("#{systemProperties}")
    private Map<String, String> systemProps;

    public Map<String, String> getSystemProps() {
        return systemProps;
    }

    public void setSystemProps(Map<String, String> systemProps) {
        this.systemProps = systemProps;
    }

    @Override
    public String toString() {
        return "User{" +
                "fbUser='" + fbUser + '\'' +
                ", fbPassword='" + fbPassword + '\'' +
                ", gmailUser='" + gmailUser + '\'' +
                ", gmailPassword='" + gmailPassword + '\'' +
                ", listOfItem=" + listOfItem +
                ", arrayVal=" + arrayVal +
                ", mapValue=" + mapValue +
                '}';
    }

    public List<String> getArrayVal() {
        return arrayVal;
    }

    public void setArrayVal(List<String> arrayVal) {
        this.arrayVal = arrayVal;
    }

    public String getFbUser() {
        return fbUser;
    }

    public void setFbUser(String fbUser) {
        this.fbUser = fbUser;
    }

    public String getFbPassword() {
        return fbPassword;
    }

    public void setFbPassword(String fbPassword) {
        this.fbPassword = fbPassword;
    }

    public String getGmailUser() {
        return gmailUser;
    }

    public void setGmailUser(String gmailUser) {
        this.gmailUser = gmailUser;
    }

    public String getGmailPassword() {
        return gmailPassword;
    }

    public void setGmailPassword(String gmailPassword) {
        this.gmailPassword = gmailPassword;
    }

    public List<String> getListOfItem() {
        return listOfItem;
    }

    public void setListOfItem(List<String> listOfItem) {
        this.listOfItem = listOfItem;
    }

    public Map<String, Integer> getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map<String, Integer> mapValue) {
        this.mapValue = mapValue;
    }

}
