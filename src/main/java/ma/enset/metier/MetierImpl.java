package ma.enset.metier;
import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Metier")
public class MetierImpl implements IMetier {
    @Autowired
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
        return 23 + res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
