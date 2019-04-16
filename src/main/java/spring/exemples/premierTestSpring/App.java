package spring.exemples.premierTestSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.exemples.premierTestSpring.Classes.ServiceImpl;
import spring.exemples.premierTestSpring.Classes.serviceInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         
    	//test ameline

    	//commit marine

    	//test proj distant
    	//salut
       ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
       serviceInterface service=(serviceInterface) ctx.getBean("service");
       System.out.println(service.calculIMC());
    }
}
