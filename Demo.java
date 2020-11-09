public class Demo {

  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < SuperArray.size; i++) {
      String cur = data[i];
      for (int j = i + 1; j < SuperArray.size-i; j++) {
        if (data[j].equals(cur)) {
          remove(j);
          i--;
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    int max = Math.max(a.size(),b.size());
    int min = Math.min(a.size(),b.size());
    SuperArray c = new SuperArray(min);
 		for (int i = 0; i < max; i++) {
 			if (a.size() > i && b.contains(a.get(i))) {
        if (!(c.contains(a.get(i)))) c.add(a.get(i));
      }
 			if (b.size() > i && a.contains(b.get(i))) {
        if (!(c.contains(b.get(i)))) c.add(b.get(i));
 		  }
 		return c;
    }
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray c = new SuperArray();
    if (a.size() >= b.size()) {
      int max = a.size();
      int min = b.size();
    } else {
      int max = b.size();
      int min = a.size();
    }
      for (int i = 0; i < min; i++) {
        c.add(a.get(i));
        c.add(b.get(i));
      }
      for (int i = min; i < max; i++) {
        c.add(a.get(i));
      }
    return c;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }

}
