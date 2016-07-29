package com.company.Engine;

import com.company.Entitys.Conection;
import com.company.Entitys.Symptom;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Nikita on 29.07.2016.
 */
public interface ConectionDAO {
    void addConection(Conection conection) throws SQLException;

    void delConection(Conection conection) throws SQLException;


}
