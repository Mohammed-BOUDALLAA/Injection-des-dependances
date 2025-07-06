package ma.enset.presentation;

import ma.enset.dao.DaoImpl;
import ma.enset.ext.DaoImplV2;
import ma.enset.metier.MetierImpl;

public class presentation1 {
    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl mi = new MetierImpl();
        // Injecting the DAO into the MetierImpl instance
        mi.setDao(dao);
        System.out.println("RES= " + mi.calcul());
    }
}
