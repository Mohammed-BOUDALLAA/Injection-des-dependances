package ma.enset.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version de base de données : 1.0");
        double temp = 34.5; // Exemple de valeur
        return temp; // Exemple de valeur
    }
}
