package ma.enset.presentation;

import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presentationSpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("RES= " + metier.calcul());
        // Assuming you have a Spring context set up with XML configuration
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the Metier bean from the context
        // IMetier metier = (IMetier) context.getBean("metierBean");

        // Call the calcul method and print the result
        // System.out.println("RES= " + metier.calcul());

        // Uncomment the above lines and ensure you have the correct XML configuration
    }

}
