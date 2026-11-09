package minecraft;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class class03839 {
   private final Map<class03831, List<class06889>> N = new EnumMap<>(class03831.class);

   class03839() {
      super();
   }

   public class03810 N(float var1, float var2) {
      Map map = class07536.N_74(class03831.class, var3x -> {
         List list = this.N.get(var3x);
         return list == null ? var3x.N(var1, var2) : List.copyOf(list);
      });
      return new class03810(map);
   }

   public class03839 N(class03831 var1, class06889 var2) {
      this.N.computeIfAbsent(var1, var0 -> new ArrayList<>(1)).add(var2);
      return this;
   }

   public class03839 N(class03831 var1, float var2, float var3, float var4) {
      return this.N(var1, new class06889(var2, var3, var4));
   }
}
