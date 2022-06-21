
package Factory;


public class FactoryConexionDB {
    public static final int MySQL = 1;
    public static String[]configMySQL = {"bd_inventario","root",""};
    
    public static ConexionBD open(int tipoBD){
    switch(tipoBD){
       case FactoryConexionDB.MySQL:
           return new MySQLConexioFactory(configMySQL);
       default:
           return null;
        }
    
    }
}

