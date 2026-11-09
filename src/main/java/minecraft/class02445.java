package minecraft;

public class class02445 extends class06271<class02413> {
   private static final String N = "bell_body";
   private final class01686 y;

   public class02445(class01686 var1) {
      super(var1, class06851::u);
      this.y = var1.y("bell_body");
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_2819(class02413 var1) {
      super.method_2819(var1);
      float f = 0.0F;
      float f1 = 0.0F;
      if (var1.y() != null) {
         float f2 = class04995.m(var1.N() / (float) Math.PI) / (4.0F + var1.N() / 3.0F);
         switch (var1.y()) {
            case field_11043:
               f = -f2;
               break;
            case field_11035:
               f = f2;
               break;
            case field_11034:
               f1 = -f2;
               break;
            case field_11039:
               f1 = f2;
         }
      }

      this.y.i = f;
      this.y.M = f1;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04792.N()
         .N("bell_body", class04822.L().N(0, 0).N(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), class04838.N(8.0F, 12.0F, 8.0F))
         .N("bell_base", class04822.L().N(0, 13).N(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), class04838.N(-8.0F, -12.0F, -8.0F));
      return class04806.N(class04792, 32, 32);
   }
}
