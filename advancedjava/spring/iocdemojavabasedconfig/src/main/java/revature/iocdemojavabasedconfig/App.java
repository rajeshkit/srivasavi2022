package revature.iocdemojavabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac=
       new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
       Player p1 = ac.getBean("player1",Player.class);
       System.out.println(p1.getPlayerId());
       System.out.println(p1.getPlayerName());
       System.out.println(p1.getTeamName());
       p1.display();
       
       Player p2 = ac.getBean("player2",Player.class);
       System.out.println(p2.getPlayerId());
       System.out.println(p2.getPlayerName());
       System.out.println(p2.getTeamName());
       p2.display();
    }
}
