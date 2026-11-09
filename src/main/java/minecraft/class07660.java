package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;

public class class07660 extends class00864 {
   public static final MapCodec<class07660> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class05946.N(class04227.Z).fieldOf("fruit").forGetter(var0x -> var0x.u),
            class05946.N(class04227.Z).fieldOf("stem").forGetter(var0x -> var0x.i),
            class05946.N(class04227.F).fieldOf("seed").forGetter(var0x -> var0x.R),
            t()
         )
         .apply(var0, class07660::new)
   );
   public static final class08064<class07211> y = class07101.R;
   private static final Map<class07211, class00494> L = class00389.L(class00891.N(4.0, 0.0, 10.0, 0.0, 10.0));
   private final class05946<class00891> u;
   private final class05946<class00891> i;
   private final class05946<class06581> R;

   public class07660(class05946<class00891> var1, class05946<class00891> var2, class05946<class06581> var3, class01362 var4) {
      super(var4);
      this.P(this.Q.y().y(y, class07211.field_11043));
      this.i = var1;
      this.u = var2;
      this.R = var3;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public MapCodec<class07660> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L.get(var1.L(y));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!var7.N(this.u) && var5 == var1.L(y)) {
         Optional optional = var2.method_30349().L(class04227.Z).M(this.i);
         if (optional.isPresent()) {
            return ((class00891)optional.get()).W().L(class07728.L, 7);
         }
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class00869.Lr);
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584((class07310)DataFixUtils.orElse(var1.method_30349().L(class04227.F).M(this.R), this));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }
}
