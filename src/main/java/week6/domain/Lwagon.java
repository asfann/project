package week6.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Lwagon extends AWagon implements WCond, TV{
    private final int placeNUm = 12;

    @Override
    public void TurnONTV() {
        System.out.println("TV is on");
    }

    @Override
    public void TurnOFFTV() {
        System.out.println("TV is off");
    }

    public void TurnonCond() {
        System.out.println("Conditioner is on");
    }

    public void TurnoffCond() {
        System.out.println("Conditioner is off");
    }

    public boolean isFull() {
        return placeNUm == getPassenger().size();
    }

}
