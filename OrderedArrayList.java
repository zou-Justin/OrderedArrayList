import java.lang.IllegalArgumentException;
import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T element){
    super.add(index(element),element);
    return true;
}
  public void add(int index,T element){
    super.add(index(element),element);
  }
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("no nulls");
    }
    T b = super.get(index);
    super.remove(index);
    add(element);
    return b;
  }
private int index(T element){
  if(element == null){
    throw new IllegalArgumentException("no nulls");
  }
    if (super.size() == 0){
      return 0;
    }

  for (int i = 0; i < super.size(); i++){
    if (element.compareTo(super.get(i)) <= 0){
        return i;
    }
  }
  return super.size();
  }
}
