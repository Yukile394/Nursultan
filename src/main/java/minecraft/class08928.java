package minecraft;

import org.jspecify.annotations.Nullable;

public class class08928<T> implements class08910 {
   private final class00372<T> N;
   private final class08900<T> y;

   public class08928(class00372<T> var1, class08900<T> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void method_65584(class08898 var1, class06584 var2, class08943 var3, class03662 var4, @Nullable class03448 var5, @Nullable class08961 var6, int var7) {
      var1.N(this);
      Object object = this.N.y(var2, var5, var6 == null ? null : var6.method_72393(), var7, var4);
      class08910 class08910 = this.y.get((T)object, var5);
      if (class08910 != null) {
         class08910.method_65584(var1, var2, var3, var4, var5, var6, var7);
      }
   }
}
