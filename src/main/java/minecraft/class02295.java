package minecraft;

public class class02295 extends class02795<class00683, class08464, class05564> {
   private static final class01894 N = class01894.y("textures/entity/llama/creamy.png");
   private static final class01894 i = class01894.y("textures/entity/llama/white.png");
   private static final class01894 R = class01894.y("textures/entity/llama/brown.png");
   private static final class01894 M = class01894.y("textures/entity/llama/gray.png");

   public class02295(class04832 var1, class01134 var2, class01134 var3) {
      super(var1, new class05564(var1.N(var2)), new class05564(var1.N(var3)), 0.7F);
      this.N(new class02745(this, var1.R(), var1.B()));
   }

   public class08464 method_55269() {
      return new class08464();
   }

   public void method_62354(class00683 var1, class08464 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.yN();
      var2.y = !var1.method_6109() && var1.v();
      var2.L = var1.NZ();
      var2.u = var1.ND();
   }

   public class01894 N(class08464 var1) {
      return switch (var1.N) {
         case field_41586 -> N;
         case field_41587 -> i;
         case field_41588 -> R;
         case field_41589 -> M;
      };
   }
}
