package minecraft;

import java.util.List;

public class class01724<T extends class01711<T>> implements class01716<T> {
   private final class01747<T> N;
   private final class03102 y;
   private final boolean L;

   public class01724(class01747<T> var1, class03102 var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public void N(T var1, class01752<T> var2, class03099 var3) {
      var2.i();
      List list = this.N.y();
      class01704 class01704 = var2.y();
      if (class01704 != null) {
         class01704.N(var3.L(), this.N.N(), this.N.y().size());
      }

      int i = var3.L() + 1;
      class03115 class03115 = this.L ? var3.i() : var2.y(i);
      class03099 class03099 = new class03099(i, this.y, class03115);
      class01722.N(var2, class03099, list, (var1x, var2x) -> new class01714<>(var1x, (class01742<T>)var2x.N(var1)));
   }
}
