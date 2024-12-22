package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());

        UserManager userManagerWithWebService = (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWebService.getUserInfo());
    }
}
