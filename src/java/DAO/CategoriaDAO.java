
package DAO;

import Model.Categoria;
import java.util.List;


    
public interface CategoriaDAO {
        public List<Categoria> Listar();
        public List<Categoria> Listar2();
        public Categoria editarCat (int id_cat_edit);
        public boolean GuardarCat(Categoria categoria);
        public boolean borrarCat(int id_cat_borrar);
}
    
    

