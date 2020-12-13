public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }
  public boolean add(T element){
    for (int i = 0; i < this.size();i++){
      this.get(i).compareTo(element);
    }
    super.add();
  }

]

}
