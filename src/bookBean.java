import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by saazimi on 7/10/2018.
 */
//@SessionScoped
@ManagedBean (name = "bookBean")
public class bookBean implements Serializable{
    public static final HashMap<String,String> map = new HashMap<>();
    public String selection;

    static {
        map.put( "عقاید یک دلقک" , "دلقک");
        map.put( "آدم کجا بودی" , "آدم");
        map.put( "نان و شراب" , "شراب");
        map.put( "از صفر به یک" , "صفر");
    }


    public HashMap<String , Integer> mapNum = new HashMap<>();

    public void setMapNum() {
        mapNum.put("دلقک",0);
        mapNum.put("آدم",0);
        mapNum.put("شراب",0);
        mapNum.put("صفر",0);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String topic) {
        selection = map.get(topic);
        mapNum.put(selection,mapNum.get(selection)+1);
    }
}
