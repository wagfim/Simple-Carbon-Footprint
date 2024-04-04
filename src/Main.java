import java.util.ArrayList;
/**
 *
 * @author wagfim@github
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Coisa> coisas = new ArrayList<>();
        Car carroGasolina = new Car("gasolina", 22.2, 1080, "aço", "normal");
        Car carroAlcool = new Car("alcool", 22.2, 1080, "aço", "normal");
        Car carroDiesel = new Car("diesel", 22.2, 1080, "aço", "agressivo");
        
        Bicycle bike = new Bicycle(50);
        //Building predio = new Building();
        
        
        carroGasolina.andar(11500);
        carroAlcool.andar(11500);
        carroDiesel.andar(11500);

        coisas.add(carroGasolina);
        coisas.add(carroAlcool);
        coisas.add(carroDiesel);
        coisas.add(bike);
        
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
