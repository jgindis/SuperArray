public class Demo {

  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size(); i++) {
      String cur = s.get(i);
      for (int j = i+1; j < s.size()-i; j++) {
        if (s.get(j).equals(cur)) {
          s.remove(j);
          i--;
          j--;
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray c = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) c.add(a.get(i));
    }
    removeDuplicates(c);
    return c;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray c = new SuperArray();
    int max = Math.max(a.size(),b.size());
    int min = Math.min(a.size(),b.size());
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
