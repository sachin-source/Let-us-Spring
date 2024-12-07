package com.ioc.coupling;

public class UserWebserviceProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User details from Webservice";
    }
}
