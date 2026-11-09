package minecraft;

public class class04080 implements class01187 {
   public static final int N = 8;
   final class04076 y;
   private final class00500 L;
   private final class01190 u;

   @Override
   public class01163 L() {
      return class01163.field_40354;
   }

   public class04080(class00500 var1, class01190 var2) {
      super();
      this.L = var1;
      this.u = var2;
      this.y = class04076.N();
   }

   public class04076 u() {
      return this.y;
   }

   @Override
   public int y() {
      return 8;
   }

   private void N(class04782 var1, class07209 var2, class00500 var3, class06069 var4) {
      var1.method_8652(var2, var3.y(class04066.y, true), 3);
      var1.N(var2, var3.i(), 8);
      var1.method_65096(class07107.e, var2.method_10263() + 0.5, var2.method_10264() + 1.15, var2.method_10260() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
      var1.method_8396(null, var2, class04909.dS, class04911.field_15245, 2.0F, 0.6F + var4.z() * 0.4F);
   }

   private void N(class07299 var1, class07438 var2) {
      if (var2.method_6065() instanceof class04770 class04770) {
         class07072 class07072 = var2.method_6081() == null ? var1.method_48963().N((class08036)class04770) : var2.method_6081();
         class06912.Ny.N(class04770, var2, class07072);
      }
   }

   @Override
   public boolean N(class04782 var1, class03556<class01194> var2, class01164 var3, class06889 var4) {
      if (var2.N(class01194.s) && var3.N() instanceof class07438 class07438) {
         if (!class07438.method_41330()) {
            class07072 class07072 = class07438.method_6081();
            int i = class07438.method_59923(var1, class01962.N(class07072, class07072::u));
            if (class07438.method_6054() && i > 0) {
               this.y.N(class07209.method_49638(var4.N(class07211.field_11036, 0.5)), i);
               this.N(var1, class07438);
            }

            class07438.method_41329();
            this.u.N(var1).ifPresent(var2x -> this.N(var1, class07209.method_49638(var2x), this.L, var1.method_8409()));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public class01190 N() {
      return this.u;
   }
}
