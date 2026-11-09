package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;

public class class00900 extends class07101 implements class00873 {
   public static final MapCodec<class00900> N = y(class00900::new);
   public static final int y = 2;
   public static final class08071 L = class06665.Nt;
   private static final List<Map<class07211, class00494>> u = IntStream.rangeClosed(0, 2)
      .mapToObj(var0 -> class00389.L(class00891.y(4 + var0 * 2, 7 - var0 * 2, 12.0).method_1096(0.0, 0.0, (var0 - 5) / 16.0).method_1097()))
      .toList();

   public class00900(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(R, class07211.field_11043).y(L, 0));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.field_9229.y(5) == 0) {
         int i = var1.L(L);
         if (i < 2) {
            var2.method_8652(var3, var1.y(L, i + 1), 2);
         }
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      var1.method_8652(var3, var4.y(L, var4.L(L) + 1), 2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, L);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public MapCodec<class00900> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u.get(var1.L(L)).get(var1.L(R));
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = this.W();
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211 : var1.i()) {
         if (class07211.z().L()) {
            class00500 = class00500.y(R, class07211);
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
      return var5 == var1.L(R) && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var3.L(L) < 2;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10093(var1.L(R))).N(class01210.d);
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.L(L) < 2;
   }
}
