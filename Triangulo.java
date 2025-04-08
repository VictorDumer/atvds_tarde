// definindo a classe Triangulos e importando o Super
public class Triangulo extends Figura{
    private float lado1;
    private float lado2;
    // construtor padrao + super
    public Triangulo(){
        super();
    }
    // construtor com o super + outras variaveis
    public Triangulo(float base,float lado1, float lado2){
        super.setBase(base);
        this.lado1=lado1;
        this.lado2=lado2;
    }
    // metodos getters para exibir os lados
    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }
    // metodos setter para definir os lados
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
 
}
