import java.util.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T element){
    if (element == null){
      throw IllegalArgumentException("bad");
    }
    Super.add(element);
  }

}
