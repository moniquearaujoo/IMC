public class Pessoa {

    double peso;
    double altura;
    double imc;

    public void calcularIMC() {
        imc = peso/(altura * altura);
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }


}
