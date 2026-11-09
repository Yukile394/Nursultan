package minecraft;

import com.mojang.serialization.Codec;

public class class01458 implements class06386 {
   public static final Codec<class01458> N = class01471.N.fieldOf("state_provider").xmap(class01458::new, var0 -> var0.y).codec();
   public final class01471 y;

   public class01458(class01471 var1) {
      super();
      this.y = var1;
   }
}
