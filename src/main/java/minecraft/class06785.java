package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06785 extends class07204 {
   public static final MapCodec<class06785> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.i.T().fieldOf("concrete").forGetter(var0x -> var0x.y), t()).apply(var0, class06785::new)
   );
   private final class00891 y;

   private static boolean T(class00500 var0) {
      return var0.Y().N(class01231.N);
   }

   public class06785(class00891 var1, class01362 var2) {
      super(var2);
      this.y = var1;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return N(var2, var4) ? this.y.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public int N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(var2, var3).NU;
   }

   @Override
   public MapCodec<class06785> N() {
      return N;
   }

   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class00500 class00500 = class07299.method_8320(class07209);
      return N(class07299, class07209, class00500) ? this.y.W() : super.N(var1);
   }

   private static boolean N(class07290 var0, class07209 var1, class00500 var2) {
      return T(var2) || N(var0, var1);
   }

   private static boolean N(class07290 var0, class07209 var1) {
      boolean flag = false;
      class07218 class07218 = var1.method_25503();

      for (class07211 class07211 : class07211.values()) {
         class00500 class00500 = var0.method_8320(class07218);
         if (class07211 != class07211.field_11033 || T(class00500)) {
            class07218.N(var1, class07211);
            class00500 = var0.method_8320(class07218);
            if (T(class00500) && !class00500.L(var0, var1, class07211.b())) {
               flag = true;
               break;
            }
         }
      }

      return flag;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class00500 var4, class00701 var5) {
      if (N(var1, var2, var4)) {
         var1.method_8652(var2, this.y.W(), 3);
      }
   }
}
