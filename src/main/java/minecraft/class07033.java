package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07033 extends class07796 {
   public static final MapCodec<class07033> N = y(class07033::new);

   public class07033(class01362 var1) {
      super(var1);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06584 var4, boolean var5) {
      super.N(var1, var2, var3, var4, var5);
      if (var5) {
         int i = 15 + var2.field_9229.y(15) + var2.field_9229.y(15);
         this.N(var2, var3, i);
      }
   }

   @Override
   public MapCodec<class07033> N() {
      return N;
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_11889, var1.method_8608() ? class07235::N : class07235::y);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07235(var1, var2);
   }
}
