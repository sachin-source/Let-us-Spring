package com.ioc;

public class UserWebserviceProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User details from Webservice";
    }
}
