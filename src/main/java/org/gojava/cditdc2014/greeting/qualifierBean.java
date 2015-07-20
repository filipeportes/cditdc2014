/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gojava.cditdc2014.greeting;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.gojava.cditdc2014.greeting.Greeting;

/**
 *
 * @author filipe
 */
@Named
@RequestScoped
public class qualifierBean {
    
    @Inject
    @Informal 
    private Greeting greeting;
    
    private String name;
    private String greet;
    
    public void sayHello(){
        greet = greeting.greet(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }
    
}
