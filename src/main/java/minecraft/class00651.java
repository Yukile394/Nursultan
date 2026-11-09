package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class00651 extends class00670 {
   public static final MapCodec<class00651> u = RecordCodecBuilder.mapCodec(var0 -> var0.group(N.forGetter(var0x -> var0x.L), t()).apply(var0, class00651::new));
   public static final class08064<class07211> i = class07101.R;
   private static final Map<class07211, class00494> R = class00389.L(class00891.N(5.0, 3.0, 13.0, 11.0, 16.0));

   public class00651(class07134 var1, class01362 var2) {
      super(var1, var2);
      this.P(this.Q.y().y(i, class07211.field_11043));
   }

   public static class00494 U(class00500 var0) {
      return R.get(var0.L(i));
   }

   public static boolean y(class05487 var0, class07209 var1, class07211 var2) {
      class07209 class07209 = var1.method_10093(var2.b());
      return var0.method_8320(class07209).L(var0, class07209, var2);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(i, var2.N(var1.L(i)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(i)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(i);
   }

   @Override
   public MapCodec<class00651> N() {
      return u;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return U(var1);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = this.W();
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211x : var1.i()) {
         if (class07211x.z().L()) {
            class07211 class07211x = class07211x.b();
            class00500 = class00500.y(i, class07211x);
            if (class00500.N((class05487)class07299, class07209)) {
               return class00500;
            }
         }
      }

      return null;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5.b() == var1.L(i) && !var1.N(var2, var4) ? class00869.N.W() : var1;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      class07211 class07211x = var1.L(i);
      double d0 = var3.method_10263() + 0.5;
      double d1 = var3.method_10264() + 0.7;
      double d2 = var3.method_10260() + 0.5;
      double d3 = 0.22;
      double d4 = 0.27;
      class07211 class07211x = class07211x.b();
      var2.method_8406(class07107.NZ, d0 + 0.27 * class07211x.P(), d1 + 0.22, d2 + 0.27 * class07211x.T(), 0.0, 0.0, 0.0);
      var2.method_8406(this.L, d0 + 0.27 * class07211x.P(), d1 + 0.22, d2 + 0.27 * class07211x.T(), 0.0, 0.0, 0.0);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return y(var2, var3, var1.L(i));
   }
}
