package minecraft;

import org.jspecify.annotations.Nullable;

public class class06245 implements class03358<class06112, class00996> {
   public static final class05913 N = class05911.P.N("bell/bell_body");
   private final class08097 y;
   private final class02445 L;

   public class06245(class04811 var1) {
      super();
      this.y = var1.B();
      this.L = new class02445(var1.N(class04802.d));
   }

   public class00996 i() {
      return new class00996();
   }

   public void N(class00996 var1, class01421 var2, class01237 var3, class06959 var4) {
      class02413 class02413 = new class02413(var1.y, var1.N);
      this.L.method_2819(class02413);
      class07311 class07311 = N.N(class06851::u);
      var3.N(this.L, class02413, var2, class07311, var1.Z, class01384.u, -1, this.y.N(N), 0, var1.z);
   }

   public void N(class06112 var1, class00996 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.y = var1.N + var3;
      var2.N = var1.y ? var1.L : null;
   }
}
