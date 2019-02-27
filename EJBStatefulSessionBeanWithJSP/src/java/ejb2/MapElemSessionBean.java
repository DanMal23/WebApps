package ejb2;

import javax.ejb.Stateful;
import java.util.HashMap;
import java.util.Set;

@Stateful
public class MapElemSessionBean implements IMapElemRemote{
    
    HashMap<String, Integer> values = new HashMap<>();

    @Override
    public void addElement(String s, int i) {
           values.put(s, i);
    }

    @Override
    public void removeElement(String s, int i) {
       values.remove(s, i);
    }

    @Override
    public HashMap<String, Integer> getElements() {
         return values;
    }

  
}
