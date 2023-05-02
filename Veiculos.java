public class Veiculos{
    private String modelo;
    private String cor;
    private String marca;
    private int ano;

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo(){
         return this.modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor(){
         return this.cor;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca(){
         return this.marca;
    }
    public void setAno(int ano){
         this.ano=ano;
    }
    public int getAno(){
         return this.ano;
    }
    public Veiculos(String modelo, String cor, String marca, int ano){
         this.modelo=modelo;
         this.ano=ano;
         this.marca=marca;
         this.cor=cor;
    }
    public Veiculos(){
     
    }
 }