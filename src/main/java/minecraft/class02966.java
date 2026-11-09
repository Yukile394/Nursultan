package minecraft;

public class class02966 {
   public static final class01894 N = class01894.y("textures/gui/title/background/panorama_overlay.png");
   private final class06202 y;
   private final class03931 L;
   private float u;

   public class02966(class03931 var1) {
      super();
      this.L = var1;
      this.y = class06202.Nq();
   }

   public void N(class01054 var1, int var2, int var3, boolean var4) {
      if (var4) {
         float f = (float)(this.y.NK().y() * ((class05630)this.y.i_7).w().method_41753());
         this.u = N(this.u + f * 0.1F, 360.0F);
      }

      this.L.N(this.y, 10.0F, -this.u);
      var1.N(class08394.Na, N, 0, 0, 0.0F, 0.0F, var2, var3, 16, 128, 16, 128);
   }

   public void N(class08627 var1) {
      this.L.N(var1);
   }

   private static float N(float var0, float var1) {
      return var0 > var1 ? var0 - var1 : var0;
   }
}
