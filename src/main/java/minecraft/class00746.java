package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;

public class class00746 extends class00891 {
   public static final MapCodec<class00746> N = y(class00746::new);
   public static final class06667 y = class06901.y;
   public static final class06667 L = class06901.L;
   public static final class06667 u = class06901.u;
   public static final class06667 i = class06901.i;
   public static final class06667 R = class06901.R;
   public static final class06667 M = class06901.M;
   private static final Map<class07211, class06667> B = class06901.B;

   public class00746(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, true).y(L, true).y(u, true).y(i, true).y(R, true).y(M, true));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, M, y, L, u, i);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.y(B.get(var2.y(class07211.field_11043)), var1.L(y))
         .y(B.get(var2.y(class07211.field_11035)), var1.L(u))
         .y(B.get(var2.y(class07211.field_11034)), var1.L(L))
         .y(B.get(var2.y(class07211.field_11039)), var1.L(i))
         .y(B.get(var2.y(class07211.field_11036)), var1.L(R))
         .y(B.get(var2.y(class07211.field_11033)), var1.L(M));
   }

   @Override
   public MapCodec<class00746> N() {
      return N;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(B.get(var2.N(class07211.field_11043)), var1.L(y))
         .y(B.get(var2.N(class07211.field_11035)), var1.L(u))
         .y(B.get(var2.N(class07211.field_11034)), var1.L(L))
         .y(B.get(var2.N(class07211.field_11039)), var1.L(i))
         .y(B.get(var2.N(class07211.field_11036)), var1.L(R))
         .y(B.get(var2.N(class07211.field_11033)), var1.L(M));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var7.N(this) ? var1.y(B.get(var5), false) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      return this.W()
         .y(M, !class07299.method_8320(class07209.method_10074()).N(this))
         .y(R, !class07299.method_8320(class07209.method_10084()).N(this))
         .y(y, !class07299.method_8320(class07209.method_10095()).N(this))
         .y(L, !class07299.method_8320(class07209.method_10078()).N(this))
         .y(u, !class07299.method_8320(class07209.method_10072()).N(this))
         .y(i, !class07299.method_8320(class07209.method_10067()).N(this));
   }
}
