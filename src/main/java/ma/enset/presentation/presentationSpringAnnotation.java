package ma.enset.presentation;

import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class presentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ma.enset");
        IMetier metier = (IMetier) context.getBean("Metier");
        System.out.println("RES= " + metier.calcul());
    }

}
