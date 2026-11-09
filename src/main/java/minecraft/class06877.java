package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06877 extends class00891 {
   public static final MapCodec<class06877> N = y(class06877::new);
   public static final class06667 y = class06896.i;

   public class06877(class01362 var1) {
      super(var1);
      this.P(this.W().y(y, false));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(y) && !var2.W(var3)) {
         var2.method_8652(var3, var1.N(y), 2);
      }
   }

   @Override
   public MapCodec<class06877> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608()) {
         boolean flag = var1.L(y);
         if (flag != var2.W(var3)) {
            if (flag) {
               var2.N(var3, this, 4);
            } else {
               var2.method_8652(var3, var1.N(y), 2);
            }
         }
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.method_8045().W(var1.method_8037()));
   }
}
