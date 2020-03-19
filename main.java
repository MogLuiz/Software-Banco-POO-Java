package softBanco;

public class aula05 {
    public static void main (String [] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Luiz Henrique");
        p1.abrirConta("CC");


        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Laryssa");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);



        p1.mostraEstado();
        p2.mostraEstado();


}
}
