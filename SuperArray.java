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

  public String get(int index) {
      return data[index];
    }

  public String set(int index, String element) {
     String old = data[index];
     data[index] = element;
     return old;
   }

   private void resize() {
     String[] bigdata = new String[size*2];
     for (int i = 0; i < data.length; i++) bigdata[i] = data[i];
     data = bigdata;
   }

   public boolean isEmpty() {
     if (data.length == 0) return true;
     else return false;
   }

   public void clear() {
     for (int i = 0; i < size; i++) {
       data[i] = "";
     }
   }

   public String toString() {
     return "";
   }

   public boolean contains(String s) {
     for (int i = 0; i < size; i++) {
       String cur = get(i);
       if (s == "") {
         if (cur == s) return true;
       } else {
         if (cur.equals(s)) return true;
       }
     }
     return false;
   }

}
