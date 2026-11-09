package minecraft;

public class class08827 extends class08476 {
   public class07070 NJ = class07070.field_6183;
   public class01180 No = class01180.field_3409;
   public final class08898 Nq = new class08898();
   public class06584 NK = class06584.E;
   public class01180 NV = class01180.field_3409;
   public final class08898 Ne = new class08898();
   public class06584 NH = class06584.E;
   public class08155 Nc = class08155.field_63399;
   public float NX;

   public class08827() {
      super();
   }

   public class06584 i() {
      return this.NJ == class07070.field_6183 ? this.NK : this.NH;
   }

   public class08898 u() {
      return this.NJ == class07070.field_6183 ? this.Nq : this.Ne;
   }

   public class06584 y(class07070 var1) {
      return var1 == class07070.field_6183 ? this.NK : this.NH;
   }

   public float N(class07070 var1) {
      return 0.0F;
   }

   public static void N(class07438 var0, class08827 var1, class08943 var2, float var3) {
      var1.NJ = var0.method_6068();
      class06584 class06584 = var0.method_6047();
      var1.Nc = class06584.e().N();
      var1.NX = var0.method_6055(var3);
      var2.N(var1.Nq, var0.method_61420(class07070.field_6183), class03662.field_4320, var0);
      var2.N(var1.Ne, var0.method_61420(class07070.field_6182), class03662.field_4323, var0);
      var1.NH = var0.method_61420(class07070.field_6182).t();
      var1.NK = var0.method_61420(class07070.field_6183).t();
   }
}
