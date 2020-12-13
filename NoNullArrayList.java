import java.util.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(String element){
    if (element == null){
      throw new IllegalArgumentException("bad");
    }
    Super.add(element);
  }

}
