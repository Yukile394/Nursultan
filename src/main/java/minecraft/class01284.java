package minecraft;

import java.util.Optional;

public class class01284 {
   public class01284() {
      super();
   }

   public boolean N(class07307 var1, class07049 var2) {
      return true;
   }

   public float N(class07049 var1) {
      return 1.0F;
   }

   public float N(class07307 var1, class07049 var2, float var3) {
      float f = var1.i() * 2.0F;
      class06889 class06889 = var1.R();
      double d0 = Math.sqrt(var2.method_5707(class06889)) / f;
      double d1 = (1.0 - d0) * var3;
      return (float)((d1 * d1 + d1) / 2.0 * 7.0 * f + 1.0);
   }

   public boolean N(class07307 var1, class07290 var2, class07209 var3, class00500 var4, float var5) {
      return true;
   }

   public Optional<Float> N(class07307 var1, class07290 var2, class07209 var3, class00500 var4, class04688 var5) {
      return var4.P() && var5.W() ? Optional.empty() : Optional.of(Math.max(var4.i().R(), var5.z()));
   }
}
