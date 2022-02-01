package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{


    public DVD(String name, int storageCapacity, ArrayList contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public String spinDisc() {

        return "A DVD spins at a rate of 570-1600 rpm ";
    }

    @Override
    public void dataStore() {

    }

    @Override
    public String transferSpeed() {
        return "A DVD transfer speed is 11Mb per second?!";
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
