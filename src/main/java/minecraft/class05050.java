package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;

public class class05050 extends class07004 implements class06084 {
   public static final MapCodec<class05050> u = y(class05050::new);
   public static final class06667 i = class06665.q;
   private static final Map<class07185, class00494> N = class00389.y(class00891.N(3.0, 3.0, 16.0));

   public class05050(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(i, false).y(L, class07185.field_11052));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(i) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(i).N(L);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public MapCodec<? extends class05050> N() {
      return u;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(i)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00500 N(class06942 var1) {
      boolean flag = var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L;
      return super.N(var1).y(i, flag);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return N.get(var1.L(L));
   }
}
