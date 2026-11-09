package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06109 extends class07796 {
   public static final MapCodec<class06109> N = y(class06109::new);
   public static final class08064<class07211> y = class06665.F;
   public static final class06667 L = class06665.d;

   public class06109(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class07482.N(var2.method_8321(var3));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.L().b());
   }

   @Override
   public MapCodec<class06109> N() {
      return N;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2 instanceof class04782 class04782 && var2.method_8321(var3) instanceof class06130 class06130) {
         var4.method_17355(class06130);
         var4.method_7281(class01235.Nv);
         class01514.N(class04782, var4, true);
      }

      return class07082.N;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class06130) {
         ((class06130)class00394).u();
      }
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class06130(var1, var2);
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }
}
