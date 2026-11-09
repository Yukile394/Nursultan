package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class00662 extends class07036 {
   public static final MapCodec<class00662> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05904.N.fieldOf("wood_type").forGetter(class07036::L), t()).apply(var0, class00662::new)
   );
   public static final class08064<class07211> L = class07101.R;
   private static final Map<class07211, class00494> u = class00389.L(class00891.N(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public class06889 T(class00500 var1) {
      return u.get(var1.L(L)).method_1107().R();
   }

   public class00662(class05904 var1, class01362 var2) {
      super(var1, var2.N(var1.u()));
      this.P(this.Q.y().y(L, class07211.field_11043).y(N, false));
   }

   @Override
   public float U(class00500 var1) {
      return var1.L(L).U();
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(L)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, N);
   }

   @Override
   public MapCodec<class00662> N() {
      return y;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = this.W();
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211x : var1.i()) {
         if (class07211x.z().L()) {
            class07211 class07211x = class07211x.b();
            class00500 = class00500.y(L, class07211x);
            if (class00500.N((class05487)class07299, class07209)) {
               return class00500.y(N, class04688.N() == class04684.L);
            }
         }
      }

      return null;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5.b() == var1.L(L) && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u.get(var1.L(L));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10093(var1.L(L).b())).B();
   }
}
