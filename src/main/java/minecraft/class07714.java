package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07714 extends class07796 implements class01137 {
   public static final MapCodec<class07714> N = y(class07714::new);
   public static final class08064<class08070> y = class06665.yP;

   public class07714(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class08070.field_12697));
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (var2 instanceof class04782) {
         if (var2.method_8321(var3) instanceof class07253 class07253) {
            boolean flag = var2.W(var3);
            boolean flag1 = class07253.n();
            if (flag && !flag1) {
               class07253.u(true);
               this.N((class04782)var2, class07253);
            } else if (!flag && flag1) {
               class07253.u(false);
            }
         }
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void N(class04782 var1, class07253 var2) {
      switch (var2.E()) {
         case field_12695:
            var2.L(false);
            break;
         case field_12697:
            var2.L(var1);
            break;
         case field_12699:
            var2.j();
         case field_12696:
      }
   }

   @Override
   public MapCodec<class07714> N() {
      return N;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      if (!var1.method_8608()) {
         if (var4 != null) {
            class00394 class00394 = var1.method_8321(var2);
            if (class00394 instanceof class07253) {
               ((class07253)class00394).N(var4);
            }
         }
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class07253) {
         return (class07082)(((class07253)class00394).N(var4) ? class07082.N : class07082.i);
      } else {
         return class07082.i;
      }
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07253(var1, var2);
   }
}
