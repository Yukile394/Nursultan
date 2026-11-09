package minecraft;

public class class02443 extends class06271<Float> {
   private static final String N = "bottom";
   private static final String y = "lid";
   private static final String L = "lock";
   private final class01686 u;
   private final class01686 i;

   public static class04806 L() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("bottom", class04822.L().N(0, 19).N(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), class04838.N);
      class04839.N("lid", class04822.L().N(0, 0).N(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), class04838.N(0.0F, 9.0F, 1.0F));
      class04839.N("lock", class04822.L().N(0, 0).N(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), class04838.N(0.0F, 9.0F, 1.0F));
      return class04806.N(class04792, 64, 64);
   }

   public class02443(class01686 var1) {
      super(var1, class06851::u);
      this.u = var1.y("lid");
      this.i = var1.y("lock");
   }

   public static class04806 y() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("bottom", class04822.L().N(0, 19).N(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), class04838.N);
      class04839.N("lid", class04822.L().N(0, 0).N(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), class04838.N(0.0F, 9.0F, 1.0F));
      class04839.N("lock", class04822.L().N(0, 0).N(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), class04838.N(0.0F, 9.0F, 1.0F));
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(Float var1) {
      super.method_2819(var1);
      this.u.i = -(var1 * (float) (Math.PI / 2));
      this.i.i = this.u.i;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("bottom", class04822.L().N(0, 19).N(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), class04838.N);
      class04839.N("lid", class04822.L().N(0, 0).N(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), class04838.N(0.0F, 9.0F, 1.0F));
      class04839.N("lock", class04822.L().N(0, 0).N(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), class04838.N(0.0F, 9.0F, 1.0F));
      return class04806.N(class04792, 64, 64);
   }
}
