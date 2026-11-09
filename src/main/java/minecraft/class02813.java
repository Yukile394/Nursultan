package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record class02813(int flightDuration, List<class02827> explosions) implements class02694 {
   public static final int N = 256;
   public static final Codec<class02813> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.s.optionalFieldOf("flight_duration", 0).forGetter(class02813::N),
            class02827.L.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(class02813::y)
         )
         .apply(var0, class02813::new)
   );
   public static final class02362<ByteBuf, class02813> L = class02362.N(
      class02389.B, class02813::N, class02827.u.N_33(class02389.L(256)), class02813::y, class02813::new
   );

   public class02813(int flightDuration, List<class02827> explosions) {
      super();
      if (explosions.size() > 256) {
         throw new IllegalArgumentException("Got " + explosions.size() + " explosions, but maximum is 256");
      } else {
         this.flightDuration = flightDuration;
         this.explosions = explosions;
      }
   }

   public List<class02827> y() {
      return this.explosions;
   }

   private static void N(Consumer<class00392> var0, class02827 var1, int var2) {
      class05216 class05216 = var1.N().N();
      if (var2 == 1) {
         var0.accept(class00392.N("item.minecraft.firework_rocket.single_star", class05216).N(class06541.field_1080));
      } else {
         var0.accept(class00392.N("item.minecraft.firework_rocket.multiple_stars", var2, class05216).N(class06541.field_1080));
      }

      var1.N((Consumer<class00392>)(var1x -> var0.accept(class00392.y("  ").y(var1x))));
   }

   public int N() {
      return this.flightDuration;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      if (this.flightDuration > 0) {
         var2.accept(class00392.L("item.minecraft.firework_rocket.flight").y(class05220.l).i(String.valueOf(this.flightDuration)).N(class06541.field_1080));
      }

      class02827 class02827x = null;
      int i = 0;

      for (class02827 class02827x : this.explosions) {
         if (class02827x == null) {
            class02827x = class02827x;
            i = 1;
         } else if (class02827x.equals(class02827x)) {
            i++;
         } else {
            N(var2, class02827x, i);
            class02827x = class02827x;
            i = 1;
         }
      }

      if (class02827x != null) {
         N(var2, class02827x, i);
      }
   }
}
