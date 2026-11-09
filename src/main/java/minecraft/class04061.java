package minecraft;

import org.jspecify.annotations.Nullable;

class class04061 implements class03481 {
   private static final int y = 8;
   private final class01190 L;

   public class04061(class04093 var1) {
      super();
      this.N = var1;
      this.L = new class01155(var1.U);
   }

   @Override
   public boolean i() {
      return true;
   }

   @Override
   public void u() {
      this.N.method_5431();
   }

   @Override
   public class01190 y() {
      return this.L;
   }

   @Override
   public boolean N(class04782 var1, class07209 var2, class03556<class01194> var3, class01164 var4) {
      return !this.N.w().L(class04007.y) && class04093.N(var4.N()) != null;
   }

   @Override
   public void N(class04782 var1, class07209 var2, class03556<class01194> var3, @Nullable class07049 var4, @Nullable class07049 var5, float var6) {
      this.N.N(var1, class04093.N(var5 != null ? var5 : var4));
   }

   @Override
   public int N() {
      return 8;
   }

   @Override
   public class03530<class01194> R() {
      return class06370.L;
   }
}
