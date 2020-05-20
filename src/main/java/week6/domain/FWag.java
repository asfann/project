package week6.domain;

import java.util.ArrayList;
import java.util.List;

public class FWag implements FreightWagon{

    private List<Freight> freights;

    public FWag(){freights= new ArrayList<Freight>();    }
    public void addFreight(Freight freight){
        if (isFull()) throw new IndexOutOfBoundsException("There is no place");
        freights.add(freight);
    }


    @Override
    public List<Freight> getFreight() {
        return freights;
    }

    @Override
    public boolean isFull() {
        if (freights.size()==40){
            return true;
        }
        return false;
    }
}
