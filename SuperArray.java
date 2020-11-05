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
     return (size == 0);
   }

   public void clear() {
     for (int i = 0; i < size; i++) {
       data[i] = "";
     }
   }

   public String toString() {
     String array = "[";
     if (size == 0) array += "]";
     for (int i = 0; i < size; i++) {
       if (i == size - 1) {
         array+=String.valueOf(data[i])+"]";
       }
       else array+=String.valueOf(data[i])+", ";
     }
     return array;
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

   public void add(int index, String element) {
       if (size == data.length) resize();
       for (int i=size-1; i>=index; i--) {
         String store = data[i];
         data[i+1] = store;
       }
       data[index] = element;
       size++;
     }

     public String remove(int index) {
       String var = data[index];
       for (int i = index; i < size-1; i++) {
         data[i] = data[i+1];
       }
       size -= 1;
       return var;
     }

     public int indexOf(String s) {
       boolean isthere = false;
       int no = -1;
       for (int i=0; i<size; i++) {
           if (isthere == false && data[i].equals(s)) {
             isthere = true;
             no = i;
           }
         }
         return no;
       }

       public String[] toArray() {
         String[] arr = new String[size];
         for (int i=0; i<size; i++) {
           arr[i] = data[i];
         }
         return arr;
       }

}
