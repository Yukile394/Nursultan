package minecraft;

import com.mojang.serialization.Codec;

public class class03967 implements class06386 {
   public static final Codec<class03967> N = class00500.N.fieldOf("state").xmap(class03967::new, var0 -> var0.y).codec();
   public final class00500 y;

   public class03967(class00500 var1) {
      super();
      this.y = var1;
   }
}
