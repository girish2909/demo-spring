package com.spring.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test AutoWiring in raw spring
 *
 */
public class TestAutoWire
{
    public static void main( String[] args )
    {
        
        AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/autowiring/auto-config.xml");
        System.out.println("============== By Name");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        
        System.out.println("============== By type");
        
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
        
        
        System.out.println("============== By Constructor");
        
        Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println(emp2);
        
        
        
        System.out.println("============== By @Autowired");
        TestJobBean bean = context.getBean("testBean", TestJobBean.class);
        System.out.println(bean);
        }
}
