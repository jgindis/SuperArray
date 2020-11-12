public class SuperArray {

  private String [] data;
  private int size; //The current size

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
    throw new IllegalArgumentException("Initial capacity = "
                                      + initialCapacity
                                      + ", should be negative");
    }
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
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index "
                                          + index
                                          + " out of bounds of size "
                                          + size);
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index "
                                          + index
                                          + " out of bounds of size "
                                          + size);
    }
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
         array += String.valueOf(data[i])+"]";
       }
       else array += String.valueOf(data[i])+", ";
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
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index "
                                          + index
                                          + " out of bounds of size "
                                          + size);
    }
    if (size == data.length) resize();
    for (int i = size-1; i >= index; i--) {
      String store = data[i];
      data[i+1] = store;
    }
    data[index] = element;
    size++;
  }

     public String remove(int index) {
       if (index < 0 || index >= size) {
         throw new IndexOutOfBoundsException("Index "
                                             + index
                                             + " out of bounds of size "
                                             + size);
       }  
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

       public void removeDuplicates(SuperArray s) {
         for (int i = 0; i < size; i++) {
           String cur = data[i];
           for (int j = i + 1; j < size-i; j++) {
             if (data[j].equals(cur)) {
               remove(j);
               i--;
             }
           }
         }
       }

       public int lastIndexOf(String value) {
         int index = -1;
         if (contains(value)) {
           for (int i = size; i >= 0; i--) {
             if (data[i].equals(value) && data[i] != null) {
               index = i;
             }
           }
         }
        return index;
      }

       public boolean equals(SuperArray other) {
         if (size == other.size()) {
           for (int i = 0; i < size; i++) {
             if (!(data[i].equals(other.get(i)))) return false;
           }
         }
         return true;
       }

}
