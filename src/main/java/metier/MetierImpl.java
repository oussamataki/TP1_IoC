package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class MetierImpl implements IMetier {
    @Autowired
    //  @Qualifier("vws")
    private IDao dao; //Couplage Faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*11.4;
        return res;
    }

    /**
     * Pour permettre d'injecter dans la variable dao
     * un objet d'une classe qui implémente l'interface IDao
     * @param dao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}