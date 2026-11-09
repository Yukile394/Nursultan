package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record class08342(Map<class07085, Float> byEquipment) {
   public static final float N = 0.085F;
   public static final float y = 1.0F;
   public static final int L = 2;
   public static final class08342 u = new class08342(class07536.N_74(class07085.class, var0 -> 0.085F));
   public static final Codec<class08342> i = Codec.unboundedMap(class07085.field_45739, class06338.n)
      .xmap(class08342::y, class08342::N)
      .xmap(class08342::new, class08342::N);

   public boolean L(class07085 var1) {
      return this.y(var1) > 1.0F;
   }

   public class08342(Map<class07085, Float> byEquipment) {
      super();
      this.byEquipment = byEquipment;
   }

   private static Map<class07085, Float> y(Map<class07085, Float> var0) {
      return class07536.N_74(class07085.class, var1 -> var0.getOrDefault(var1, 0.085F));
   }

   public float y(class07085 var1) {
      return this.byEquipment.getOrDefault(var1, 0.085F);
   }

   public class08342 N(class07085 var1) {
      return this.N(var1, 2.0F);
   }

   private static Map<class07085, Float> N(Map<class07085, Float> var0) {
      HashMap hashmap = new HashMap<>(var0);
      hashmap.values().removeIf(var0x -> var0x == 0.085F);
      return hashmap;
   }

   public class08342 N(class07085 var1, float var2) {
      if (var2 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + var2 + " for " + var1);
      } else {
         return this.y(var1) == var2 ? this : new class08342(class07536.N_74(class07085.class, var3 -> var3 == var1 ? var2 : this.y(var3)));
      }
   }

   public Map<class07085, Float> N() {
      return this.byEquipment;
   }
}
