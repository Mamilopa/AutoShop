
package org.packt.primeautosales.jsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.TabChangeEvent;

@Named(value = "aboutViewController")
@SessionScoped
public class AboutViewController implements Serializable {

    public AboutViewController() {
    }
public void tabChangeHandler (TabChangeEvent tce){
    
    FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab: "+ tce.getTab().getTitle());
            FacesContext.getCurrentInstance().addMessage(null, msg);
    
}
    
}
