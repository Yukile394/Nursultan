package minecraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class class06473 implements class05834 {
   class06473(class06463 var1, List var2, List var3, List var4, Map var5) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
   }

   @Override
   public void y(String var1) {
      this.L.add(var1);
   }

   @Override
   public void N(class01894 var1, Collection<String> var2) {
      this.u.computeIfAbsent(var1, var0 -> new ArrayList()).addAll(var2);
   }

   @Override
   public void N(class01894 var1, String var2) {
      this.u.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(var2);
   }

   @Override
   public void N(String var1) {
      if (this.N.size() > this.y.size()) {
         this.y.add(var1);
      } else {
         this.N.add(var1);
      }
   }
}
