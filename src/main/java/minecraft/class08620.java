package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class08620 extends class07796 implements class01137 {
   public static final MapCodec<class08620> N = y(class08620::new);
   public static final class08064<class00235> y = class06665.yo;

   public class08620(class01362 var1) {
      super(var1);
   }

   @Nullable
   private static class08594 N(class07299 var0, class07209 var1) {
      if (var0 instanceof class04782) {
         class00394 class00394 = ((class04782)var0).method_8321(var1);
         if (class00394 instanceof class08594) {
            return (class08594)class00394;
         }
      }

      return null;
   }

   @Override
   public int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      if (var1.L(y) != class00235.field_56024) {
         return 0;
      } else {
         class00394 class00394 = var2.method_8321(var3);
         if (class00394 instanceof class08594) {
            return ((class08594)class00394).y() ? 15 : 0;
         } else {
            return 0;
         }
      }
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return N(super.N(var1, var2, var3, var4), var3.L(y));
   }

   public static class06584 N(class06584 var0, class00235 var1) {
      var0.N(class02484.Nl, var0.a_(class02484.Nl, class02841.N).N(y, var1));
      return var0;
   }

   @Override
   protected MapCodec<class08620> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      class08594 class08594 = N(var2, var3);
      if (class08594 != null) {
         if (class08594.L() != class00235.field_56024) {
            boolean flag = var2.W(var3);
            boolean flag1 = class08594.y();
            if (flag && !flag1) {
               class08594.N(true);
               class08594.R();
            } else if (!flag && flag1) {
               class08594.N(false);
            }
         }
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class02841 class02841 = var1.method_8041().method_58694(class02484.Nl);
      class00500 class00500 = this.W();
      if (class02841 != null) {
         class00235 class00235 = class02841.N(y);
         if (class00235 != null) {
            class00500 = class00500.y(y, class00235);
         }
      }

      return class00500;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2.method_8321(var3) instanceof class08594 class08594) {
         if (!var4.method_7338()) {
            return class07082.i;
         } else {
            if (var2.method_8608()) {
               var4.method_66695(class08594);
            }

            return class07082.N;
         }
      } else {
         return class07082.i;
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class08594 class08594 = N(var2, var3);
      if (class08594 != null) {
         class08594.u();
      }
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class08594(var1, var2);
   }
}
