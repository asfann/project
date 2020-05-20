package week6.domain;

import java.util.List;

public interface FreightWagon extends Wagon {
    List<Freight> getFreight();
}
