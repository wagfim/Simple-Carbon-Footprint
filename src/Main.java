
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        Building predio = new Building();
        //Car carro = new Car();
        Car carro2 = new Car("alcool", 22.2, 1080, "aço", "agressivo");
        
        ArrayList<Coisa> coisas = new ArrayList<>();
        /*
        coisas.add(bike);
        coisas.add(predio);
        coisas.add(carro);
        */
        
        
        coisas.add(carro2);
        for (int i = 0; i < coisas.size(); i++) {
            coisas.get(i).getCarbonFootprint();
        }
        /*
        Coisa teste[] = new Coisa[3];
        teste[0] = bike;
        teste[1] = bike;
        teste[2] = bike;
        */
        
        for (int i = 0; i < 3; i++) {
            //teste[i].getCarbonFootprint();
        }
    }
}
