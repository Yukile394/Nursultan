package minecraft;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class class02672 {
   public static final class02672 N = new class02672();
   private final WeakHashMap<class02510, Void> y = new WeakHashMap<>();

   private class02672() {
      super();
   }

   private static List<class04530> N(Map<String, List<class04530>> var0) {
      return var0.entrySet().stream().map(var0x -> {
         String s = (String)var0x.getKey();
         List list = (List)var0x.getValue();
         return (class04530)(list.size() > 1 ? new class02201(s, list) : (class04530)list.get(0));
      }).collect(Collectors.toList());
   }

   public void N(class02510 var1) {
      this.y.put(var1, null);
   }

   public List<class04530> N() {
      return N(this.y.keySet().stream().flatMap(var0 -> var0.at_().stream()).collect(Collectors.groupingBy(class04530::u)));
   }
}
