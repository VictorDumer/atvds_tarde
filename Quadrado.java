public class Quadrado extends Figura{
    // variavel privada lado
    private float lado1;
    private float lado2;
    private float lado3;
    // construtor padrao,importar as funcoes do super
    public Quadrado (){
        super();
    }
    // construtor com o super + outras variaveis
    public Quadrado (float base, float lado1, float lado2, float lado3){
        super.setBase(base);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    // metodos getters para exibir o valor
    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }
    // metodos setter para colocar o valor 
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
}
