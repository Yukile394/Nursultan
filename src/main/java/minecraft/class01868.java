package minecraft;

import org.jspecify.annotations.Nullable;

class class01868 extends class07046 {
   private final boolean L;

   public class01868(class01286 var1, int var2, boolean var3) {
      super(var1, var2);
      this.L = var3;
   }

   @Override
   public boolean N(class04782 var1, class07438 var2, int var3) {
      if (this.L == var2.method_5999()) {
         var2.method_6025(Math.max(4 << var3, 0));
      } else {
         var2.method_64397(var1, var2.method_48923().T(), 6 << var3);
      }

      return true;
   }

   @Override
   public void N(class04782 var1, @Nullable class07049 var2, @Nullable class07049 var3, class07438 var4, int var5, double var6) {
      if (this.L == var4.method_5999()) {
         int i = (int)(var6 * (4 << var5) + 0.5);
         var4.method_6025(i);
      } else {
         int j = (int)(var6 * (6 << var5) + 0.5);
         if (var2 == null) {
            var4.method_64397(var1, var4.method_48923().T(), j);
         } else {
            var4.method_64397(var1, var4.method_48923().L(var2, var3), j);
         }
      }
   }
}
