import java.util.ArrayList;
import java.util.List;

public class MathBox {
    private ArrayList<Number> list = new ArrayList<>();
    public MathBox(Number[] numbers){
        for(int i = 0; i < numbers.length; i++){
           this.list.add(numbers[i]);
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
        for (int i = 0; i < this.list.size(); i++){
            hash += list.get(i).hashCode() * (i + 1);  //considering order matters
        }
        return hash;
    }
    @Override
    public boolean equals(Object object){
        MathBox anotherBox = (MathBox) object;
        if (this.list.size() != anotherBox.list.size())
            return false;
        for (int i = 0; i < this.list.size(); i++){
            if (anotherBox.list.get(i).doubleValue() != this.list.get(i).doubleValue())
                return false;
        }
        return true;
    }
    public void deleteIfExists(int target){
        for (int i = 0; i < this.list.size(); i++){
            if (this.list.get(i).intValue() == target)
                this.list.remove(i);
        }
    }

}
