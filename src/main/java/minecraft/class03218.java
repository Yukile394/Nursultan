package minecraft;

import Nursultan.class10162;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;

public class class03218 {
   private final Long2ObjectMap<List<class04770>> N = new Long2ObjectOpenHashMap();
   private final Map<class04770, class10162> y = Maps.newHashMap();
   private final class06265 L;

   public class03218(class06265 var1) {
      super();
      this.L = var1;
   }

   public boolean N(class07428 var1, class07321 var2) {
      for (class04770 class04770 : this.N(var2)) {
         class10162 class10162 = this.y.get(class04770);
         if (class10162 == null || class10162.y(var1)) {
            return true;
         }
      }

      return false;
   }

   public void N(class07321 var1, class07428 var2) {
      for (class04770 class04770 : this.N(var1)) {
         this.y.computeIfAbsent(class04770, var0 -> new class10162()).N(var2);
      }
   }

   private List<class04770> N(class07321 var1) {
      return (List<class04770>)this.N.computeIfAbsent(var1.y(), var2 -> this.L.L(var1));
   }
}
