package week6.domain;

public class Freight {
    private String cargo;

    public Freight(String cargo){
        setCargo(cargo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
