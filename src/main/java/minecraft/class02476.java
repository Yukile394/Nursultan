package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02476(class00836 durability, class00836 damage) implements class02500 {
   public static final Codec<class02476> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00836.u.optionalFieldOf("durability", class00836.L).forGetter(class02476::N),
            class00836.u.optionalFieldOf("damage", class00836.L).forGetter(class02476::y)
         )
         .apply(var0, class02476::new)
   );

   public class02476(class00836 durability, class00836 damage) {
      this.durability = durability;
      this.damage = damage;
   }

   public class00836 y() {
      return this.damage;
   }

   public static class02476 N(class00836 var0) {
      return new class02476(var0, class00836.L);
   }

   public class00836 N() {
      return this.durability;
   }

   @Override
   public boolean N(class02666 var1) {
      Integer integer = var1.method_58694(class02484.i);
      if (integer == null) {
         return false;
      } else {
         int i = var1.a_(class02484.u, 0);
         return !this.durability.u(i - integer) ? false : this.damage.u(integer);
      }
   }
}
