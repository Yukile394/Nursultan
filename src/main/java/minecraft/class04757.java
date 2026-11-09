package minecraft;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class class04757 {
   private final Object2BooleanMap<class04770> N = new Object2BooleanOpenHashMap();

   public void L(class04770 var1) {
      this.N.replace(var1, false);
   }

   public class04757() {
      super();
   }

   public boolean i(class04770 var1) {
      return this.N.getBoolean(var1);
   }

   public boolean u(class04770 var1) {
      return this.N.getOrDefault(var1, true);
   }

   public void y(class04770 var1) {
      this.N.replace(var1, true);
   }

   public void N(class04770 var1) {
      this.N.removeBoolean(var1);
   }

   public Set<class04770> N() {
      return this.N.keySet();
   }

   public void N(class04770 var1, boolean var2) {
      this.N.put(var1, var2);
   }
}
