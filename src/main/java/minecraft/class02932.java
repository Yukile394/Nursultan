package minecraft;

import org.jspecify.annotations.Nullable;

public class class02932 extends class06937 {
   private final class07438 N;
   private final class07085 y;
   @Nullable
   private final class01894 M;

   @Nullable
   @Override
   public class01894 L() {
      return this.M;
   }

   public class02932(class06695 var1, class07438 var2, class07085 var3, int var4, int var5, int var6, @Nullable class01894 var7) {
      super(var1, var4, var5, var6);
      this.N = var2;
      this.y = var3;
      this.M = var7;
   }

   @Override
   public int y() {
      return 1;
   }

   @Override
   public boolean N(class06584 var1) {
      return this.N.method_63623(var1, this.y);
   }

   @Override
   public boolean N(class08036 var1) {
      class06584 class06584 = this.i();
      return !class06584.R() && !var1.method_68878() && class07323.N(class06584, class02523.I) ? false : super.N(var1);
   }

   @Override
   public boolean N() {
      return this.N.method_56991(this.y);
   }

   @Override
   public void N(class06584 var1, class06584 var2) {
      this.N.method_6116(this.y, var2, var1);
      super.N(var1, var2);
   }
}
