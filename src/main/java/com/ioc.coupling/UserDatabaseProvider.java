package com.ioc.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        // Accessing the database directly
        return "User details from Database";
    }
}
