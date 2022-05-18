package dao.interfaces;

import domain.Pedido;
import domain.SedePrincipal;

import java.sql.SQLException;

public interface ISedePrincipal {

    void registrar(SedePrincipal sedePrincipal) throws SQLException;
    void eliminar(SedePrincipal sedePrincipal) throws SQLException;
    SedePrincipal obtener(SedePrincipal sedePrincipal) throws SQLException;

}
