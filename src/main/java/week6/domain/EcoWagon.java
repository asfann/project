package week6.domain;

public class EcoWagon extends AWagon{
    private final int placeNum = 60;



    public boolean isFull() {
        return placeNum == getPassenger().size();
    }
}
