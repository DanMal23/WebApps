package ejb2;

import java.util.HashMap;
import javax.ejb.Remote;

@Remote
public interface IMapElemRemote {
    
    void addElement(String s, int i);
    void removeElement(String s, int i);
        
        HashMap<String, Integer> getElements();
}
