package org.packt.primeautosales.jsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import org.packt.primeautosales.entity.User;
import org.primefaces.event.FlowEvent;

@Named(value = "userRegistrationController")
@SessionScoped
public class UserRegistrationController implements Serializable {

    private User current;
    
    public UserRegistrationController() {
    }

    public User getCurrent() {
        if(current==null){
            current = new User();
        }
        return current;
    }
 public String flowHandler(FlowEvent event) {
        if (current != null) {
            System.out.println("current: " + current);
            if (!current.isEnableNotifications()) {
                return "confirm";
            } else {
                return event.getNewStep();
            }
        } else {
            return event.getNewStep();
        }
    }  
}
