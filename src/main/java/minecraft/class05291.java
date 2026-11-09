package minecraft;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class class05291 {
   public static final Codec<class05291> y = class04206.S.T().dispatch(class05291::N, class05312::N);
   private static final int N = 32;
   private static final int M = 24;
   public static final int L = 80;
   protected final int u;
   protected final int i;
   protected final int R;

   private static boolean L(class04887 var0, class07209 var1) {
      return var0.method_16358(var1, var0x -> class06391.y(var0x) && !var0x.N(class00869.Z) && !var0x.N(class00869.RC));
   }

   public class05291(int var1, int var2, int var3) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
   }

   public boolean y(class04887 var1, class07209 var2) {
      return this.N(var1, var2) || var1.method_16358(var2, var0 -> var0.N(class01210.g));
   }

   protected boolean y(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07209 var4, class01476 var5) {
      return this.N(var1, var2, var3, var4, var5, Function.identity());
   }

   protected static <P extends class05291> P3<Mu<P>, Integer, Integer, Integer> N(Instance<P> var0) {
      return var0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter(var0x -> var0x.u),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(var0x -> var0x.i),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(var0x -> var0x.R)
      );
   }

   protected static void N(class04887 var0, BiConsumer<class07209, class00500> var1, class06069 var2, class07209 var3, class01476 var4) {
      if (var4.E || !L(var0, var3)) {
         var1.accept(var3, var4.L.N(var2, var3));
      }
   }

   public int N(class06069 var1) {
      return this.u + var1.y(this.i + 1) + var1.y(this.R + 1);
   }

   public abstract List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6);

   protected abstract class05312<?> N();

   protected boolean N(
      class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07209 var4, class01476 var5, Function<class00500, class00500> var6
   ) {
      if (this.N(var1, var4)) {
         var2.accept(var4, (class00500)var6.apply(var5.y.N(var3, var4)));
         return true;
      } else {
         return false;
      }
   }

   protected void N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07218 var4, class01476 var5) {
      if (this.y(var1, var4)) {
         this.y(var1, var2, var3, var4, var5);
      }
   }

   public boolean N(class04887 var1, class07209 var2) {
      return class03194.L(var1, var2);
   }
}
