public class SuperArray {

  private String [] data;
  private int size; //The current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size==data.length) resize();
    data[size] = element;
    size++;
    return true;
  }

  public String set(int index, String element) {
     String old = data[index];
     data[index] = element;
     return old;
   }

   private void resize() {
     String[] bigdata = new String[size+10];
     for (int i=0; i<data.length; i++) bigdata[i] = data[i];
     data = bigdata;
   }

}
