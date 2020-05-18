package week6.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class AWagon implements PassengerWagon {
    private List<Passenger> passengers;


    public AWagon() {
        passengers = new ArrayList<Passenger>();
    }
        public void addPassenger(Passenger passenger){
            if (isFull()) throw new IndexOutOfBoundsException("There is no place");
            passengers.add(passenger);
        }

    public List<Passenger> getPassenger() {
        return passengers;
    }
}
