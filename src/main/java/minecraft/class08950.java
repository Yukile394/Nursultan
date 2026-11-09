package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class class08950 extends class00860 {
   public static final MapCodec<class08950> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02774.field_46493.fieldOf("weathering_state").forGetter(class08950::y),
            class04206.y.T().fieldOf("open_sound").forGetter(class00860::j),
            class04206.y.T().fieldOf("close_sound").forGetter(class00860::v),
            t()
         )
         .apply(var0, class08950::new)
   );
   private static final Map<class00891, Supplier<class00891>> y = Map.of(
      class00869.bx,
      () -> class00869.vj,
      class00869.bD,
      () -> class00869.vv,
      class00869.bh,
      () -> class00869.vn,
      class00869.br,
      () -> class00869.vt,
      class00869.jG,
      () -> class00869.vj,
      class00869.jd,
      () -> class00869.vv,
      class00869.jl,
      () -> class00869.vn,
      class00869.jw,
      () -> class00869.vt
   );
   private final class02774 Z;

   private static class00500 L(class00500 var0, class07299 var1, class07209 var2) {
      class00500 class00500xx = var1.method_8320(var2.method_10093(E(var0)));
      if (!var0.L(class00860.i).equals(class06638.field_12569)
         && var0.i() instanceof class08950 class08950x
         && class00500xx.i() instanceof class08950 class08950) {
         class00500 class00500x = var0;
         class00500 class00500xx = class00500xx;
         if (class08950x.L() != class08950.L()) {
            class00500x = N(class08950x, var0).orElse(var0);
            class00500xx = N(class08950, class00500xx).orElse(class00500xx);
         }

         return (class08950x.Z.ordinal() <= class08950.Z.ordinal() ? class00500x.i() : class00500xx.i()).s(class00500x);
      } else {
         return var0;
      }
   }

   @Override
   public boolean L(class00500 var1) {
      return var1.N(class01210.NZ) && var1.y(class00860.i);
   }

   public boolean L() {
      return true;
   }

   public class08950(class02774 var1, class04891 var2, class04891 var3, class01362 var4) {
      super(() -> class00404.field_11914, var2, var3, var4);
      this.Z = var1;
   }

   @Override
   public boolean i(class00500 var1) {
      return var1.N(class01210.NZ);
   }

   public class02774 y() {
      return this.Z;
   }

   @Override
   public MapCodec<? extends class08950> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      class00500 class00500 = super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      return this.L(var7) && !class00500.L(class00860.i).equals(class06638.field_12569) && E(class00500) == var5 ? var7.i().s(class00500) : class00500;
   }

   @Override
   public class00500 N(class06942 var1) {
      return L(super.N(var1), var1.method_8045(), var1.method_8037());
   }

   public static class00500 N(class00891 var0, class07211 var1, class07299 var2, class07209 var3) {
      class08950 class08950 = (class08950)y.getOrDefault(var0, class00869.vj::P).get();
      class06638 class06638 = class08950.N(var2, var3, var1);
      return L(class08950.W().y(u, var1).y(i, class06638), var2, var3);
   }

   private static Optional<class00500> N(class08950 var0, class00500 var1) {
      return !var0.L() ? Optional.of(var1) : Optional.ofNullable((class00891)class02859.y.get().get(var1.i())).map(var1x -> ((class00891)var1x).s(var1));
   }
}
