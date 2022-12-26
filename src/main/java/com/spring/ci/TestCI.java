package com.spring.ci;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test constructor injection, lifecycle of beans in raw spring
 * Note : destroy will only call on context.registerShutdownHook() method.
 *
 */
public class TestCI
{
    public static void main( String[] args )
    {
        
        AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/ci/ci-config.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        context.registerShutdownHook();
        // 1 : using above method we can call init and destroy
        // 2 : or we can implement InitializingBean, DestroyingBean interface
    }
}
