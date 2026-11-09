package minecraft;

public class class02663 extends class02840<class07899, class08266, class06078<class08266>> {
   private final class06078<class08266> N = this.L();
   private final class06078<class08266> i;
   private static final class01894 R = class01894.y("textures/entity/fish/tropical_a.png");
   private static final class01894 M = class01894.y("textures/entity/fish/tropical_b.png");

   public class02663(class04832 var1) {
      super(var1, new class03853(var1.N(class04802.uX)), 0.15F);
      this.i = new class03858(var1.N(class04802.uH));
      this.N(new class08795(this, var1.R()));
   }

   public class08266 method_55269() {
      return new class08266();
   }

   protected int M(class08266 var1) {
      return var1.y;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class01894 N(class08266 var1) {
      return switch (var1.N.N()) {
         case field_41574 -> R;
         case field_41575 -> M;
      };
   }

   public void method_62354(class07899 var1, class08266 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.I();
      var2.y = var1.Q().L();
      var2.L = var1.O().L();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_3936(class08266 var1, class01421 var2, class01237 var3, class06959 var4) {
      this.y = switch (var1.N.N()) {
         case field_41574 -> this.N;
         case field_41575 -> this.i;
      };
      super.method_3936(var1, var2, var3, var4);
   }

   protected void y(class08266 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      float f = 4.3F * class04995.m(0.6F * var1.P);
      var2.N(class02058.u.N(f));
      if (!var1.NZ) {
         var2.N(0.2F, 0.1F, 0.0F);
         var2.N(class02058.R.N(90.0F));
      }
   }
}
