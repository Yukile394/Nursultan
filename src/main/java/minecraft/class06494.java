package minecraft;

import org.jspecify.annotations.Nullable;

public class class06494 extends class06502 {
   public class06494(class00891 var1, class00891 var2, class06573 var3) {
      super(var1, var2, class07211.field_11033, var3);
   }

   public class06494(class06573 var1, class00891 var2, class00891 var3, class07211 var4) {
      super(var2, var3, var4, var1);
   }

   @Override
   protected boolean N(class07209 var1, class07299 var2, @Nullable class08036 var3, class06584 var4, class00500 var5) {
      boolean flag = super.N(var1, var2, var3, var4, var5);
      if (!var2.method_8608() && !flag && var3 != null && var2.method_8321(var1) instanceof class07267 class07267) {
         class00891 class00891 = var2.method_8320(var1).i();
         if (class00891 instanceof class07036) {
            ((class07036)class00891).N(var3, class07267, true);
         }
      }

      return flag;
   }
}
