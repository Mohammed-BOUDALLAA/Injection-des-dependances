package ma.enset.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version de base de données");
        double temp = 34.5; // Exemple de valeur
        return temp; // Exemple de valeur
    }
}
