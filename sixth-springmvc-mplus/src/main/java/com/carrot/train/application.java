package com.carrot.train;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

public class application {
    private ApplicationContext iocContext = new
            ClassPathXmlApplicationContext("spring-mybatis.xml");
    @Test
    public void testEnvironment() throws Exception{
        DataSource ds = iocContext.getBean("dataSource",DataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
