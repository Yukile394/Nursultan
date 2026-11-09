package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;

public class class00645 extends class07685 {
   public static final MapCodec<class00645> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06563.field_41600.fieldOf("color").forGetter(class07685::y), t()).apply(var0, class00645::new)
   );
   public static final class08064<class07211> y = class07101.R;
   private static final Map<class07211, class00494> L = class00389.L(class00891.N(16.0, 0.0, 12.5, 14.0, 16.0));

   public class00645(class06563 var1, class01362 var2) {
      super(var1, var2);
      this.P(this.Q.y().y(y, class07211.field_11043));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public MapCodec<class00645> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == var1.L(y).b() && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L.get(var1.L(y));
   }

   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = this.W();
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211x : var1.i()) {
         if (class07211x.z().L()) {
            class07211 class07211x = class07211x.b();
            class00500 = class00500.y(y, class07211x);
            if (class00500.N((class05487)class07299, class07209)) {
               return class00500;
            }
         }
      }

      return null;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10093(var1.L(y).b())).B();
   }
}
