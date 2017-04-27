/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fernandohenrique
 */
public class ValidarChassiTest {
    
    @Test
    public void testAnoANoChassi(){
     ValidarChassi util =new ValidarChassi();
     assertEquals(2010, util.validar("9bp48914DA0875431", 10));
    }
    
}
