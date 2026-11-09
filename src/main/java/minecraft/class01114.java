package minecraft;

import java.util.List;
import java.util.stream.Collectors;

public abstract class class01114 {
   private static final int N = 5;
   private int y;
   private double L;

   public void L(class07299 var1, class07209 var2, class00500 var3) {
      List<class08978> list = this.N(var1, var2);
      this.L = 0.0;

      for (class08978 class08978 : list) {
         this.L = Math.max(class08978.method_72381(), this.L);
      }

      int i = list.size();
      int j = this.y;
      if (j != i) {
         boolean flag = i != 0;
         boolean flag1 = j != 0;
         if (flag && !flag1) {
            this.N(var1, var2, var3);
            var1.N(null, class01194.U, var2);
         } else if (!flag) {
            this.y(var1, var2, var3);
            var1.N(null, class01194.z, var2);
         }

         this.y = i;
      }

      this.N(var1, var2, var3, j, i);
      if (i > 0) {
         u(var1, var2, var3);
      }
   }

   public class01114() {
      super();
   }

   private static void u(class07299 var0, class07209 var1, class00500 var2) {
      var0.N(var1, var2.i(), 5);
   }

   protected abstract void y(class07299 var1, class07209 var2, class00500 var3);

   private boolean N(class07049 var1, class07209 var2) {
      return var1 instanceof class08978 class08978 && !class08978.aB_().method_7325() ? class08978.method_72380(this, var2) : false;
   }

   public int N() {
      return this.y;
   }

   protected abstract void N(class07299 var1, class07209 var2, class00500 var3);

   protected abstract void N(class07299 var1, class07209 var2, class00500 var3, int var4, int var5);

   public abstract boolean N(class08036 var1);

   public void N(class07438 var1, class07299 var2, class07209 var3, class00500 var4, double var5) {
      int i = this.y++;
      if (i == 0) {
         this.N(var2, var3, var4);
         var2.N(var1, class01194.U, var3);
         u(var2, var3, var4);
      }

      this.N(var2, var3, var4, i, this.y);
      this.L = Math.max(var5, this.L);
   }

   public void N(class07438 var1, class07299 var2, class07209 var3, class00500 var4) {
      int i = this.y--;
      if (this.y == 0) {
         this.y(var2, var3, var4);
         var2.N(var1, class01194.z, var3);
         this.L = 0.0;
      }

      this.N(var2, var3, var4, i, this.y);
   }

   public List<class08978> N(class07299 var1, class07209 var2) {
      double d0 = this.L + 4.0;
      class00734 class00734 = new class00734(var2).M(d0);
      return var1.method_8333((class07049)null, class00734, var2x -> this.N(var2x, var2)).stream().map(var0 -> (class08978)var0).collect(Collectors.toList());
   }
}
