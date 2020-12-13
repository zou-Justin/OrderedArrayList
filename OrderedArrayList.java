public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }
  public boolean add(T element){
    for (int i = 0; i < this.size();i++){
      if (this.get(i).compareTo(element) <= 0){
        this.add(i,element);
      }
    }
    return super.add(element);
  }
  public void add(int index, T element){
    for (int i = 0; i < this.size();i++){
      if (this.get(i).compareTo(element) <= 0){
        this.add(i,element);
      }
    }
  }
  public T set(int index, T element){
    add(element);
    return super.remove(index);

  }


}
