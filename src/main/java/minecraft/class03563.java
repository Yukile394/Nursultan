package minecraft;

import org.jspecify.annotations.Nullable;

public class class03563 extends class01157 {
   public class03563(class03592 var1, class07209 var2) {
      super(var1, var2);
      this.u = var1;
   }

   private int N(class07299 var1, class07209 var2, class00500 var3) {
      class07211 class07211 = var3.L(class03584.B).b();
      return var1.u(var2.method_10093(class07211), class07211);
   }

   @Override
   public boolean N(class04782 var1, class07209 var2, class03556<class01194> var3, @Nullable class01164 var4) {
      int i = this.N(var1, this.y, this.u.w());
      return i != 0 && class03502.N(var3) != i ? false : super.N(var1, var2, var3, var4);
   }

   @Override
   public int N() {
      return 16;
   }
}
