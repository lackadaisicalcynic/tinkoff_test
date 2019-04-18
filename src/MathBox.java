import java.util.ArrayList;

public class MathBox extends ObjectBox{

    private ArrayList<Number> list;

    public MathBox(Number[] numbers){
        super(numbers);
        list = new ArrayList<>();
        for(int i = 0; i < super.getList().size(); i++){
           this.list.add((Number)super.getList().get(i));
        }
    }

    public Number summator(){
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i).doubleValue();
        }
        return sum;
    }

    public void splitter(double den){
        for (int i = 0; i < list.size(); i++){
            list.set(
                i, list.get(i).doubleValue() / den
            );
        }
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < this.list.size(); i++){
            str += this.list.get(i).toString() + " ";
        }
        return str.trim();
    }
    @Override
    public int hashCode(){
        int hash = 0;
        for (int i = 0; i < list.size(); i++){
            hash += list.get(i).hashCode() * (i + 1);  //considering order matters
        }
        return hash;
    }

    @Override
    public boolean equals(Object object){
        MathBox anotherBox = (MathBox) object;
        if (list.size() != anotherBox.list.size())
            return false;
        for (int i = 0; i < list.size(); i++){
            if (anotherBox.list.get(i).doubleValue() != list.get(i).doubleValue())
                return false;
        }
        return true;
    }

    public void deleteIfExists(int target){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).intValue() == target)
                list.remove(i);
        }
    }

}
