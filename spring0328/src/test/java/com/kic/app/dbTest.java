package com.kic.app;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class dbTest {
 @Autowired
 private DriverManagerDataSource datasource;
 
 @Inject
 private DriverManagerDataSource ds2;
 @Test
 public void test(){
  assertNotNull(datasource);
 }
 @Test
 public void test2(){
  assertNotNull(ds2);
 }
 @Autowired
 private JdbcTemplate temp;
 @Test
 public void temptest(){
  assertNotNull(temp);
 }
}
