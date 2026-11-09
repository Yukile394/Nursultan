package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06043 extends class06761 implements class00873, class06084 {
   public static final MapCodec<class06043> L = y(class06043::new);
   private static final class06667 i = class06665.q;
   public static final class08064<class07211> u = class06665.f;
   private static final class00494 R = class00891.y(12.0, 0.0, 13.0);

   public class06043(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class08059.field_12607).y(i, false).y(u, class07211.field_11043));
   }

   @Override
   protected float l() {
      return 0.1F;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(i) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      if (var4.L(class06761.y) == class08059.field_12607) {
         class07209 class07209x = var3.method_10084();
         var1.method_8652(class07209x, var1.method_8316(class07209x).B(), 18);
         class05584.N(var1, var2, var3, var4.L(u));
      } else {
         class07209 class07209 = var3.method_10074();
         this.N(var1, var2, class07209, var1.method_8320(class07209));
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(u, var2.N(var1.L(u)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(u)));
   }

   @Override
   public MapCodec<class06043> N() {
      return L;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      if (!var1.method_8608()) {
         class07209 class07209 = var2.method_10084();
         class00500 class00500 = class06761.y(var1, class07209, this.W().y(y, class08059.field_12609).y(u, var3.L(u)));
         var1.method_8652(class07209, class00500, 3);
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = super.N(var1);
      return class00500 != null ? y(var1.method_8045(), var1.method_8037(), class00500.y(u, var1.method_8042().b())) : null;
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class01210.yV) || var2.method_8316(var3.method_10084()).N(class04684.L) && super.N(var1, var2, var3);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return R;
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
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, i, u);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      if (var1.L(y) == class08059.field_12609) {
         return super.a_(var1, var2, var3);
      } else {
         class07209 class07209 = var3.method_10074();
         class00500 class00500 = var2.method_8320(class07209);
         return this.N(class00500, var2, class07209);
      }
   }
}
