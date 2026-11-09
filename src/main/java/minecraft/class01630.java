package minecraft;

import com.mojang.serialization.Codec;

public class class01630 implements class06386 {
   public static final Codec<class01630> N = class02142.N(0, 256).fieldOf("count").xmap(class01630::new, class01630::N).codec();
   private final class02142 y;

   public class01630(int var1) {
      super();
      this.y = class02151.N(var1);
   }

   public class01630(class02142 var1) {
      super();
      this.y = var1;
   }

   public class02142 N() {
      return this.y;
   }
}
