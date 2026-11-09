package minecraft;

public class class02088 {
   public static final class01894 N = class01894.y("textures/gui/title/minecraft.png");
   public static final class01894 y = class01894.y("textures/gui/title/minceraft.png");
   public static final class01894 L = class01894.y("textures/gui/title/edition.png");
   public static final int u = 256;
   public static final int i = 44;
   private static final int M = 256;
   private static final int B = 64;
   private static final int Z = 128;
   private static final int z = 14;
   private static final int U = 128;
   private static final int E = 16;
   public static final int R = 30;
   private static final int W = 7;
   private final boolean m = class06069.u().z() < 1.0E-4;
   private final boolean P;

   public class02088(boolean var1) {
      super();
      this.P = var1;
   }

   public void N(class01054 var1, int var2, float var3) {
      this.N(var1, var2, var3, 30);
   }

   public boolean N() {
      return this.P;
   }

   public void N(class01054 var1, int var2, float var3, int var4) {
      int ix = var2 / 2 - 128;
      int j = class02566.y(this.P ? 1.0F : var3);
      var1.N(class08394.Na, this.m ? y : N, ix, var4, 0.0F, 0.0F, 256, 44, 256, 64, j);
      int k = var2 / 2 - 64;
      int l = var4 + 44 - 7;
      var1.N(class08394.Na, L, k, l, 0.0F, 0.0F, 128, 14, 128, 16, j);
   }
}
