/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakcontinuecls42;

/**
 *
 * @author WilliamFelipe
 */
public class BreakContinueCls42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        for (var cnt = 0; cnt < 3; cnt++) {
            if (cnt % 2 == 0) {
                System.out.println("cnt = " + cnt);
                break;
            }
        }
        
        for (var cnt2 = 0; cnt2 < 3; cnt2++) {
            if (cnt2 % 2 != 0) {
                continue;
            }            
            System.out.println("cnt2 = " + cnt2);
        }
    }
    
}
