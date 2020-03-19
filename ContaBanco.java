package softBanco;

public class ContaBanco {
    public int numConta ;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos Personalizados

    public void mostraEstado() {
        System.out.println("**********************************");
        System.out.println("Conta : " + this.getNumConta());
        System.out.println("Tipo :" + this.getTipo());
        System.out.println("Dono : " + this.getDono());
        System.out.println("Saldo : " + this.getSaldo());
        System.out.println("Status : " + this.getStatus());
        System.out.println("***********************************");

    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Abertura de conta concluida");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Conta com saldo posiitivo. Impossivel fechar");
        } else if (this.getSaldo() < 0) {
            System.out.println(" Conta com saldo negativo . Impossivel fechar");
        }
        else {
            this.setStatus(false);
            System.out.println("Fechamento de conta concluido !");

        }

    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito efetuado na conta de " + this.getDono());
        }
        else {
            System.out.println("Impossivel depositar , conta fechada !");
        }
    }

    public void sacar(float v ) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conte de " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente para o saque");
            }
        } else {
            System.out.println("Conta fechada , impossivel sacar !");
        }
    }

    public void pagarMesal() {
        int v =0;
        if (getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada !");
        }
    }

    //Costrutor

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta (int n) {

        this.numConta = n;
    }
    public int getNumConta () {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {

        this.tipo = t ;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d ;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st ;
    }





}
