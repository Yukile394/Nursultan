package minecraft;

import java.util.List;

public class class01722<T, P> implements class01742<T> {
   private final class01739<T, P> N;
   private final List<P> y;
   private final class01714<T> L;
   private int u;

   private class01722(class01739<T, P> var1, List<P> var2, class03099 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = new class01714<>(var3, this);
   }

   @Override
   public void execute(class01752<T> var1, class03099 var2) {
      Object object = this.y.get(this.u);
      var1.N(this.N.create(var2, (P)object));
      if (++this.u < this.y.size()) {
         var1.N(this.L);
      }
   }

   public static <T, P> void N(class01752<T> var0, class03099 var1, List<P> var2, class01739<T, P> var3) {
      switch (var2.size()) {
         case 0:
            break;
         case 1:
            var0.N(var3.create(var1, var2.get(0)));
            break;
         case 2:
            var0.N(var3.create(var1, var2.get(0)));
            var0.N(var3.create(var1, var2.get(1)));
            break;
         default:
            var0.N((new class01722(var3, var2, var1)).L);
      }
   }
}
