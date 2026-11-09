package minecraft;

public class class01848 extends class07084 {
   public class01848(class01286 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean N(int var1, int var2) {
      return true;
   }

   @Override
   public boolean N(class04782 var1, class07438 var2, int var3) {
      if (var2 instanceof class04770 class04770
         && !class04770.method_7325()
         && var1.y() != class07086.field_5801
         && var1.method_19500(class04770.method_24515())) {
         class04877 class04877 = var1.method_19502(class04770.method_24515());
         if (class04877 == null || class04877.E() < class04877.U()) {
            class04770.method_6092(new class07055(class07047.q, 600, var3));
            class04770.method_58586(class04770.method_24515());
            return false;
         }
      }

      return true;
   }
}
