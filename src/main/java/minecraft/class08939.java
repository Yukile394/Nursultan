package minecraft;

import org.jspecify.annotations.Nullable;

public class class08939 implements class08910 {
   private final class08559 N;
   private final class08910 y;
   private final class08910 L;

   public class08939(class08559 var1, class08910 var2, class08910 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public void method_65584(class08898 var1, class06584 var2, class08943 var3, class03662 var4, @Nullable class03448 var5, @Nullable class08961 var6, int var7) {
      var1.N(this);
      (this.N.method_65638(var2, var5, var6 == null ? null : var6.method_72393(), var7, var4) ? this.y : this.L)
         .method_65584(var1, var2, var3, var4, var5, var6, var7);
   }
}
