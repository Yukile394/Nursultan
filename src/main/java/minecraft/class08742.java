package minecraft;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayList;
import java.util.List;

public class class08742 {
   private final List<class04745> N = new ArrayList<>();
   private int y;

   public int L() {
      return this.y;
   }

   public class08742() {
      super();
   }

   public int y() {
      this.N.removeIf(var0 -> var0.n() == class00549.m);
      return this.N.size();
   }

   public int N() {
      return this.y - this.y();
   }

   public void N(class04782 var1, Runnable var2) {
      class04751 class04751 = var1.method_14178();
      LongOpenHashSet longopenhashset = new LongOpenHashSet();
      class04751.Z();
      class04751.L.N(class00549.m).forEach(var1x -> longopenhashset.add(var1x.b().y()));
      var2.run();
      class04751.Z();
      class04751.L.N(class00549.m).forEach(var2x -> {
         if (!longopenhashset.contains(var2x.b().y())) {
            this.N.add(var2x);
            this.y++;
         }
      });
   }
}
