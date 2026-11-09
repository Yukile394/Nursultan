package minecraft;

import org.jspecify.annotations.Nullable;

public class class04351 implements class04376 {
   private final class07299 y;

   public class04351(class07299 var1) {
      super();
      this.y = var1;
   }

   @Override
   public void N(class00500 var1, class07209 var2, class00891 var3, @Nullable class02733 var4, boolean var5) {
      class04376.N(this.y, var1, var2, var3, var4, var5);
   }

   @Override
   public void N(class07209 var1, class00891 var2, @Nullable class02733 var3) {
      class00500 class00500 = this.y.method_8320(var1);
      this.N(class00500, var1, var2, var3, false);
   }

   @Override
   public void N(class07211 var1, class00500 var2, class07209 var3, class07209 var4, int var5, int var6) {
      class04376.N(this.y, var1, var3, var4, var2, var5, var6 - 1);
   }
}
