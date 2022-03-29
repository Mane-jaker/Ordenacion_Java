package Ord;

public class Dato implements Comparable<Dato>{
    private Integer n;
    private String l;

    public Dato(int n, String l){
        this.n = n;
        this.l = l;
    }
    public Dato(int n){
        this.n = n;
    }

    public int compareTo(Dato r){
        int resultado = this.n.compareTo(r.getN());
        if(resultado == 0 ){
            return this.l.compareTo(r.getL());
        }
        return resultado;
    }

    public String getL(){return l;}

    public void serL(String l){this.l = l;}

    public Integer getN() {return n;}

    public void setN(Integer n) {this.n = n;}

    public String toString(){
        return "Numero: "+ n + " Letras: "+ l +"\n";
    }
}
