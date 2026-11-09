package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public record class06543(float minRange, float maxRange, float minCreativeRange, float maxCreativeRange, float hitboxMargin, float mobFactor) {
   public static final Codec<class06543> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.N(0.0F, 64.0F).optionalFieldOf("min_reach", 0.0F).forGetter(class06543::N),
            class06338.N(0.0F, 64.0F).optionalFieldOf("max_reach", 3.0F).forGetter(class06543::y),
            class06338.N(0.0F, 64.0F).optionalFieldOf("min_creative_reach", 0.0F).forGetter(class06543::L),
            class06338.N(0.0F, 64.0F).optionalFieldOf("max_creative_reach", 5.0F).forGetter(class06543::u),
            class06338.N(0.0F, 1.0F).optionalFieldOf("hitbox_margin", 0.3F).forGetter(class06543::i),
            Codec.floatRange(0.0F, 2.0F).optionalFieldOf("mob_factor", 1.0F).forGetter(class06543::R)
         )
         .apply(var0, class06543::new)
   );
   public static final class02362<ByteBuf, class06543> y = class02362.N(
      class02389.E,
      class06543::N,
      class02389.E,
      class06543::y,
      class02389.E,
      class06543::L,
      class02389.E,
      class06543::u,
      class02389.E,
      class06543::i,
      class02389.E,
      class06543::R,
      class06543::new
   );

   public float L() {
      return this.minCreativeRange;
   }

   public class06543(float minRange, float maxRange, float minCreativeRange, float maxCreativeRange, float hitboxMargin, float mobFactor) {
      super();
      this.minRange = minRange;
      this.maxRange = maxRange;
      this.minCreativeRange = minCreativeRange;
      this.maxCreativeRange = maxCreativeRange;
      this.hitboxMargin = hitboxMargin;
      this.mobFactor = mobFactor;
   }

   public float i() {
      return this.hitboxMargin;
   }

   public float u() {
      return this.maxCreativeRange;
   }

   public float y() {
      return this.maxRange;
   }

   public float y(class07049 var1) {
      if (var1 instanceof class08036) {
         return ((class08036)var1).method_68878() ? this.maxCreativeRange : this.maxRange;
      } else {
         return this.maxRange * this.mobFactor;
      }
   }

   public float N(class07049 var1) {
      if (var1 instanceof class08036 class08036) {
         if (class08036.method_7325()) {
            return 0.0F;
         } else {
            return class08036.method_68878() ? this.minCreativeRange : this.minRange;
         }
      } else {
         return this.minRange * this.mobFactor;
      }
   }

   public static class06543 N(class07438 var0) {
      return new class06543(0.0F, (float)var0.method_45325(class05298.E), 0.0F, (float)var0.method_45325(class05298.E), 0.0F, 1.0F);
   }

   public boolean N(class07438 var1, class00734 var2, double var3) {
      return this.N(var1, var2::i, var3);
   }

   public boolean N(class07438 var1, class06889 var2) {
      return this.N(var1, var2::M, 0.0);
   }

   private boolean N(class07438 var1, ToDoubleFunction<class06889> var2, double var3) {
      double d0 = Math.sqrt(var2.applyAsDouble(var1.method_33571()));
      double d1 = this.N((class07049)var1) - this.hitboxMargin - var3;
      double d2 = this.y(var1) + this.hitboxMargin + var3;
      return d0 >= d1 && d0 <= d2;
   }

   public class07089 N(class07049 var1, float var2, Predicate<class07049> var3) {
      Either<class06183, Collection<class06145>> either = class08038.N(var1, this, var3, class05849.field_17559);
      if (either.left().isPresent()) {
         return (class07089)either.left().get();
      } else {
         Collection<class06145> collection = (Collection<class06145>)either.right().get();
         class06145 class06145x = null;
         class06889 class06889xx = var1.method_5836(var2);
         double d0 = Double.MAX_VALUE;

         for (class06145 class06145x : collection) {
            double d1 = class06889xx.M(class06145x.y());
            if (d1 < d0) {
               d0 = d1;
               class06145x = class06145x;
            }
         }

         if (class06145x != null) {
            return class06145x;
         } else {
            class06889 class06889x = var1.method_75117();
            class06889 class06889xx = var1.method_5836(var2).i(class06889x);
            return class06183.N(class06889xx, class07211.N(class06889x), class07209.method_49638(class06889xx));
         }
      }
   }

   public float N() {
      return this.minRange;
   }

   public float R() {
      return this.mobFactor;
   }
}
