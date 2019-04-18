import java.util.ArrayList;

import static java.lang.String.valueOf;

public class ObjectBox {
    private ArrayList<Object> list = new ArrayList<>();
    public ObjectBox(Object[] objects){
        for(int i = 0; i < objects.length; i++){
            this.list.add(objects[i]);
        }
    }

    public void addObject(Object object){
        list.add(object);
    }
    public void deleteObject(Object object){
        list.remove(Double.parseDouble(valueOf(object)));
    }
    public String dump(){
        String str = "";
        for (int i = 0; i < this.list.size(); i++){
            str += this.list.get(i).toString() + " ";
        }
        return str.trim();
    }
}
