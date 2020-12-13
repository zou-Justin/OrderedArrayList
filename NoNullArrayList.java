import java.util.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("bad");
    }
    Super.add(element);
  }
  public void add(int index,T element){
    if (element == null){
      throw new IllegalArgumentException("bad");
    }
    Super.add(index,element);
  }

}
