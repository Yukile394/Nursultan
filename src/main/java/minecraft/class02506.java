package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;
import java.util.Map.Entry;

public record class02506(Map<class02466, class00845> slots) {
   public static final Codec<class02506> N = Codec.unboundedMap(class02488.N, class00845.N).xmap(class02506::new, class02506::N);

   public class02506(Map<class02466, class00845> slots) {
      super();
      this.slots = slots;
   }

   public boolean N(class06843 var1) {
      for (Entry entry : this.slots.entrySet()) {
         if (!N(var1, (class00845)entry.getValue(), ((class02466)entry.getKey()).N())) {
            return false;
         }
      }

      return true;
   }

   public Map<class02466, class00845> N() {
      return this.slots;
   }

   private static boolean N(class06843 var0, class00845 var1, IntList var2) {
      for (int i = 0; i < var2.size(); i++) {
         int j = var2.getInt(i);
         class04803 class04803 = var0.method_32318(j);
         if (class04803 != null && var1.test(class04803.N())) {
            return true;
         }
      }

      return false;
   }
}
