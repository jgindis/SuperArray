public class SuperArray {

  private String [] data;
  private int size; //The current size

  public SuperArray() {

  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size==10) resize();
    data[size] = element;
    size++;
    return true;
  }

  public String set(int index, String element) {
     String old = data[index];
     data[index] = element;
     return SuperArray();
   }

   private void resize() {
     String[] newData = new String[20];
     for (int i = 0; i < data.length; i++) {
       newData[i] = data[i];
     }
     data = bigdata;
   }
 }

}
