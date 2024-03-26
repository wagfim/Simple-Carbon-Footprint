/**
 *
 * @author aluno
 */
public class Building extends Coisa implements CarbonFootprint{
    public int altura;
    public int material; /* concreto/madeira */


    @Override
    public void getCarbonFootprint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
