package minecraft;

import java.util.function.Function;

public class class03971<S extends class08476, M extends class06078<S>> extends class06249<S, M> {
   private final Function<S, class01894> N;
   private final class03999<S> y;
   private final M L;
   private final Function<class01894, class07311> u;
   private final boolean i;

   public class03971(class06252<S, M> var1, Function<S, class01894> var2, class03999<S> var3, M var4, Function<class01894, class07311> var5, boolean var6) {
      super(var1);
      this.N = var2;
      this.y = var3;
      this.L = (M)var4;
      this.u = var5;
      this.i = var6;
   }

   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      if (!var4.v || this.i) {
         float f = this.y.apply((S)var4, var4.P);
         if (!(f <= 1.0E-5F)) {
            int ix = class02566.y(f);
            class07311 class07311 = this.u.apply(this.N.apply((S)var4));
            var2.N(1).N(this.L, var4, var1, class07311, var3, class02294.N(var4, 0.0F), ix, null, var4.l, null);
         }
      }
   }
}
