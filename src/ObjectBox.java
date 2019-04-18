import java.util.ArrayList;

import static java.lang.String.valueOf;

public class ObjectBox {

    private ArrayList<Object> list;

    public ObjectBox(Object[] objects){
        list = new ArrayList<>();
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
        for (int i = 0; i < list.size(); i++){
            str += list.get(i).toString() + " ";
        }
        return str.trim();
    }

//  getter
    public ArrayList<Object> getList(){
        return list;
    }

}
