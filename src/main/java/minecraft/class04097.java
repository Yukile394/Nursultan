package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class04097 extends class00891 implements class06084 {
   public static final MapCodec<class04097> N = y(class04097::new);
   public static final class06667 y = class06665.q;

   public class04097(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(y) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected boolean y(class00500 var1, class00500 var2, class07211 var3) {
      return var2.N(class00869.NM) && var3.z() == class07185.field_11052;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public MapCodec<class04097> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(y)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      boolean flag = var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L;
      return super.N(var1).y(y, flag);
   }
}
