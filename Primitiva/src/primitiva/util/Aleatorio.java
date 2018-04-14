package primitiva.util;

import java.util.Random;

/**
 *
 * @author haplo
 */
public class Aleatorio extends Random {
    
    public int nextInt(int inferior, int superior) {
        int i;
        i=nextInt();
        i=inferior+(Math.abs(i) %(superior-inferior+1));
        return i;
    }
    
    
    
}
