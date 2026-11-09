package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class00343 {
   private final boolean N;

   public static class00373 L() {
      return new class00341();
   }

   public class00343(boolean var1) {
      super();
      this.N = var1;
   }

   public boolean y() {
      return this.N;
   }

   public static class00373 y(float var0) {
      return new class00377(var0);
   }

   protected abstract float N(class06584 var1, class03448 var2, int var3, class08961 var4);

   protected class00373 N(float var1) {
      return this.N ? y(var1) : L();
   }

   public float N(class06584 var1, @Nullable class03448 var2xx, @Nullable class08961 var3, int var4) {
      if (var3 == null) {
         var3 = var1.K();
      }

      if (var3 == null) {
         return 0.0F;
      } else {
         if (var2xx == null && ((class08961)var3).method_73183() instanceof class03448 var2xx) {
            ;
         }

         return var2xx == null ? 0.0F : this.N(var1, var2xx, var4, (class08961)var3);
      }
   }
}
