package minecraft;

import Nursultan.class09051;

public class class00020 implements class00169 {
   public static final float N = 0.01F;
   public static final float y = 0.001F;
   public static final float L = 1.0E-4F;
   private static final int u = 0;
   private final class04453 i;
   private final class09033 R;
   private int M = 0;

   public class00020(class04453 var1, class09033 var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   @Override
   public void N() {
      this.M--;
      if (this.M <= 0 && this.i.method_5869()) {
         float f = this.i.method_73183().field_9229.z();
         if (f < 1.0E-4F) {
            this.M = 0;
            this.R.N((class00044)(new class09051(this.i, class04909.Q)));
         } else if (f < 0.001F) {
            this.M = 0;
            this.R.N((class00044)(new class09051(this.i, class04909.Y)));
         } else if (f < 0.01F) {
            this.M = 0;
            this.R.N((class00044)(new class09051(this.i, class04909.k)));
         }
      }
   }
}
