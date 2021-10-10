import es.upm.etsisi.cf4j.data.BenchmarkDataModels;
import es.upm.etsisi.cf4j.data.DataModel;

public class Prueba {

    public static void main (String[] args){
        try {
            DataModel datamodel = BenchmarkDataModels.NetflixPrize();

            System.out.println("Número de usuarios: " + datamodel.getNumberOfUsers());
            System.out.println("Número de items: " + datamodel.getNumberOfItems());
        }catch (Exception e){

        }
    }
}
