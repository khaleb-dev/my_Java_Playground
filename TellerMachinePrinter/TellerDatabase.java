package TellerMachinePrinter;

import java.util.ArrayList;
import java.util.Collection;

public class TellerDatabase extends ArrayList {
    public TellerDatabase(int initialCapacity){
        super(initialCapacity);
    }

    public TellerDatabase(){ }

    public TellerDatabase(Collection collection){
        super(collection);
    }
}