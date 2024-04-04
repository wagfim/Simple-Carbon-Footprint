/**
 *
 * @author aluno
 */
public class Bicycle extends Coisa implements CarbonFootprint{    
    int quilometragemPercorrida;

    public Bicycle(int quilometragemPercorrida) {
        this.quilometragemPercorrida = quilometragemPercorrida;
    }
    
    
    @Override
    public void getCarbonFootprint() {
        int pegada = this.quilometragemPercorrida * 21;
        System.out.println("Pegada de carbono da bicicleta:  " +  pegada+ " gramas por ano");
    }
}
