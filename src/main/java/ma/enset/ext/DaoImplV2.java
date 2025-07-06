package ma.enset.ext;

import ma.enset.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version étendue de la base de données");
        double temp = 45.5; // Exemple de valeur
        return temp; // Exemple de valeur
    }
}
