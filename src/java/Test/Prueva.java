
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.util.List;


public class Prueva {
   public static void main (String[] args){
       Prueva evaluar = new Prueva();
       evaluar.listarCategoria();
       evaluar.editarCategoria();
       evaluar.GuardarCategoria();
       evaluar.eliminarCategoria();
   }
   public void editarCategoria(){
       CategoriaDAO Categoria = new CategoriaDAOImplementar();
       Categoria cat_edit = Categoria.editarCat(1);
       System.out.println("CATEGORIA A MODIFICAR");
       System.out.println(" id:     " + cat_edit.getId_categoria() + "NOMBRE:" + cat_edit.getNom_categoria () + "ESTADO:" + cat_edit.getEstado_categoria());
   }
   
   
   public void listarCategoria(){
       CategoriaDAO categoria = new CategoriaDAOImplementar();
       List<Categoria> listar = categoria.Listar();
       System.out.println("LISTADO DE CATEGORIAS");
       for(Categoria categoriaListar : listar);
           System.out.println("ID: " + categoriaListar.getId_categoria() + "NOMBRE: " categoriaListar.getNom_categoria() + "ESTADO:" + categoriaListar.getEstado_categoria);
       }
       
       public void GuardarCategoria(){
       CategoriaDAO categoria = new CategoriaDAOImplementar();
       Categoria Guardar_cat = new Categoria();
       Guardar_cat.setNom_categoria("bebidas");
       Guardar_cat.setId_categoria(5);
       Guardar_cat.setEstado_categoria(1);
       categoria.GuardarCat(Guardar_cat);
       
       }
       public void eliminarCategoria(){
       
    }
}
