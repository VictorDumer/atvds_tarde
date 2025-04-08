public class Figura {
    private float base;
    // construtor padrao
    public Figura(){
        
    }
    // constrotor com base
    public Figura(float base){
        this.base=base;
    }
    //metodo get para exibir o valor na tela
    public float getBase(){
        return base;
    }
    // metodo setter para setar o valor 
    public void setBase(float base){
        this.base=base;
    }
    // funcao para calcular a area do triangulo
    public float calcularArea(float ladoA,float LadoB){
        float Area;
        Area= (ladoA * LadoB)/2;
        return Area;
    }
    // funcao para calcular Perimetro do triangulo
    public float calcularPerimetro(float ladoA,float ladoB,float ladoC){
        float Perimetro;
        Perimetro= ladoA+ladoB+ladoC;
        return Perimetro;
    }
    // funcao para calcular area Quadrado
    public float calcularArea(float lado){
        float Area;
        Area=lado*lado;
        return Area;
    }
    // funcao para Calcular perimetro Quadrado
    public float calcularPerimetro(float lado){
        float Perimetro;
        Perimetro= lado*4;
        return Perimetro;
    }
}