/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gojava.cditdc2014.greeting;

import org.gojava.cditdc2014.qualifier.Informal;

/**
 *
 * @author filipe
 */
@Informal
public class InformalGreeting extends Greeting {

    @Override
    public String greet(String name) {
        return "E ai " + name + ", Beleza!!.";
    }
}
