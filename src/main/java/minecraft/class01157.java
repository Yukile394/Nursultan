package minecraft;

import org.jspecify.annotations.Nullable;

public class class01157 implements class03481 {
   public static final int N = 8;
   protected final class07209 y;
   private final class01190 u;

   @Override
   public boolean L() {
      return true;
   }

   public class01157(class06371 var1, class07209 var2) {
      super();
      this.L = var1;
      this.y = var2;
      this.u = new class01155(var2);
   }

   @Override
   public boolean i() {
      return true;
   }

   @Override
   public void u() {
      this.L.method_5431();
   }

   @Override
   public class01190 y() {
      return this.u;
   }

   @Override
   public boolean N(class04782 var1, class07209 var2, class03556<class01194> var3, @Nullable class01164 var4) {
      if (!var2.equals(this.y) || !var3.N(class01194.R) && !var3.N(class01194.Z)) {
         return class03502.N(var3) == 0 ? false : class06361.T(this.L.w());
      } else {
         return false;
      }
   }

   @Override
   public void N(class04782 var1, class07209 var2, class03556<class01194> var3, @Nullable class07049 var4, @Nullable class07049 var5, float var6) {
      class00500 class00500 = this.L.w();
      if (class06361.T(class00500)) {
         int i = class03502.N(var3);
         this.L.N(i);
         int j = class03502.N(var6, this.N());
         class00891 class00891 = class00500.i();
         if (class00891 instanceof class06361) {
            ((class06361)class00891).N(var4, var1, this.y, class00500, j, i);
         }
      }
   }

   @Override
   public int N() {
      return 8;
   }
}
