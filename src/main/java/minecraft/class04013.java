package minecraft;

public class class04013 extends class02840<class04003, class08282, class03994> {
   private static final class01894 N = class01894.y("textures/entity/warden/warden.png");
   private static final class01894 i = class01894.y("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final class01894 R = class01894.y("textures/entity/warden/warden_heart.png");
   private static final class01894 M = class01894.y("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final class01894 B = class01894.y("textures/entity/warden/warden_pulsating_spots_2.png");

   public class04013(class04832 var1) {
      super(var1, new class03994(var1.N(class04802.iy)), 0.9F);
      class03994 class03994xxx = new class03994(var1.N(class04802.iL));
      class03994 class03994x = new class03994(var1.N(class04802.iu));
      class03994 class03994xx = new class03994(var1.N(class04802.ii));
      class03994 class03994xxx = new class03994(var1.N(class04802.iR));
      this.N(new class03971<>(this, var0 -> i, (var0, var1x) -> 1.0F, class03994xxx, class06851::U, false));
      this.N(new class03971<>(this, var0 -> M, (var0, var1x) -> Math.max(0.0F, class04995.P(var1x * 0.045F) * 0.25F), class03994x, class06851::U, false));
      this.N(
         new class03971<>(
            this, var0 -> B, (var0, var1x) -> Math.max(0.0F, class04995.P(var1x * 0.045F + (float) Math.PI) * 0.25F), class03994x, class06851::U, false
         )
      );
      this.N(new class03971<>(this, var0 -> N, (var0, var1x) -> var0.N, class03994xx, class06851::U, false));
      this.N(new class03971<>(this, var0 -> R, (var0, var1x) -> var0.y, class03994xxx, class06851::U, false));
   }

   public class08282 method_55269() {
      return new class08282();
   }

   public class01894 N(class08282 var1) {
      return N;
   }

   public void method_62354(class04003 var1, class08282 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.u(var3);
      var2.y = var1.i(var3);
      var2.L.N(var1.N);
      var2.u.N(var1.y);
      var2.i.N(var1.L);
      var2.R.N(var1.u);
      var2.M.N(var1.i);
      var2.B.N(var1.R);
   }
}
