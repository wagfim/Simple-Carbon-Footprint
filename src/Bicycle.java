/**
 *
 * @author aluno
 */
public class Bicycle extends Coisa implements CarbonFootprint{
    int a1, b1, c1;

    @Override
    public void getCarbonFootprint() {
        System.out.println("Pegada de carbono da bicicleta: XX" + " por ano");
    }
}
