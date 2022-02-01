package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{


    public CD(String name, int storageCapacity, ArrayList contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    public String spinDisc(){
        return "A CD spins at a rate of 200-500 rpm.";
    }

    @Override
    public void dataStore() {

    }

    @Override
    public String transferSpeed(){
        return "A CD transfer speed is 1.7Mb per second!";
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
