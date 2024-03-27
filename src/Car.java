/**
 *
 * @author aluno
 */
public class Car extends Coisa implements CarbonFootprint {
    public String combustivel;
    public double consumoMedio;
    public int peso;
    public String materialConstrucao;
    public String modoConducao;
    //public double potencia;
    public int quilometragem;

    public Car() {
    }
      

    public Car(String combustivel, double consumoMedio, int peso, String materialConstrucao, String modoConducao) {
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
        switch(modoConducao) {
            case "economico" -> this.consumoMedio *= 1.1;
            case "normal" -> this.consumoMedio *= 1;
            case "agressivo" -> this.consumoMedio *= 0.9;
        }
        this.peso = peso;
        this.materialConstrucao = materialConstrucao;
        this.modoConducao = modoConducao;
        this.quilometragem = 0;
    }
    
    public void andar(int quilometragemPercorrida) {
        this.quilometragem += quilometragemPercorrida;
    }
    
    public double calculaCarbonoPorKmPercorrido() {
        double combustivelConsumido = this.quilometragem / this.consumoMedio;
        double carbonoConsumido = combustivelConsumido * 8.88;
        return carbonoConsumido;
    }

    //Car carro2 = new Car("alcool", 22.2, 1080, "aço", "agressivo");
    @Override
    public void getCarbonFootprint() {
        double carbono = 0;
        carbono += calculaCarbonoPorKmPercorrido();
        
        switch (combustivel) {
            case "alcool" -> carbono *= 0.9;
            case "gasolina" -> carbono *= 1;
            case "diesel" -> carbono *= 1.9;
            default -> carbono *= 1;
        }
        
        System.out.println("Pegada de carbono do carro: " + carbono + " por ano.");
    }
}
