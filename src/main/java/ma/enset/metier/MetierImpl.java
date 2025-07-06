package ma.enset.metier;
import ma.enset.dao.IDao;
public class MetierImpl implements IMetier {
    private IDao dao;
    // Constructor injection
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    // Setter injection
    public MetierImpl() {
        // Default constructor
    }
    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp * 33;
        return 0;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
