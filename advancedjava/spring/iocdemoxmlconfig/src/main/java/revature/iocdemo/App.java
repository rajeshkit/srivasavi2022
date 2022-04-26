package revature.iocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontextconfig.xml");
       Player p=ac.getBean("player1",Player.class);
       System.out.println(p.playerId);
       System.out.println(p.playerName);
       System.out.println(p.teamName);
       p.display();
       Player p2=ac.getBean("player2",Player.class);
       System.out.println(p2.playerId);
       System.out.println(p2.playerName);
       System.out.println(p2.teamName);
       p2.display();
       
       
}
}
