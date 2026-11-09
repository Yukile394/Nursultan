package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01891 extends class05407 {
   private static final class00392 N = class00392.L("mco.selectServer.popup");
   private static final class00392 y = class00392.L("mco.selectServer.close");
   private static final class01894 L = class01894.y("popup/background");
   private static final class01894 u = class01894.y("icon/trial_available");
   private static final class01883 i = new class01883(class01894.y("widget/cross_button"), class01894.y("widget/cross_button_highlighted"));
   private static final int R = 195;
   private static final int M = 152;
   private static final int B = 6;
   private static final int Z = 4;
   private static final int z = 10;
   private static final int U = 320;
   private static final int E = 172;
   private static final int W = 100;
   private static final int m = 99;
   private static final int P = 100;
   private static List<class01894> s = List.of();
   private final class05096 T;
   private final boolean b;
   @Nullable
   private class05362 j;
   private int v;
   private int n;

   private int L() {
      return this.N() + 320;
   }

   public class01891(class05096 var1, boolean var2) {
      super(N);
      this.T = var1;
      this.b = var2;
   }

   private int u() {
      return this.y() + 172;
   }

   private int y() {
      return (this.field_22790 - 172) / 2;
   }

   public static void N(class01089 var0) {
      s = var0.y("textures/gui/images", var0x -> var0x.N().endsWith(".png")).keySet().stream().filter(var0x -> var0x.y().equals("realms")).toList();
   }

   public static void N(class01054 var0, class05362 var1) {
      byte b0 = 8;
      var0.N(class08394.Na, u, var1.method_46426() + var1.method_25368() - 8 - 4, var1.method_46427() + var1.method_25364() / 2 - 4, 8, 8);
   }

   private int N() {
      return (this.field_22789 - 320) / 2;
   }

   @Override
   public void method_25426() {
      this.T.method_25410(this.field_22789, this.field_22790);
      if (this.b) {
         this.j = this.method_37063(
            class05362.method_46430(class00392.L("mco.selectServer.trial"), class01321.y(this, class03597.T))
               .N(this.L() - 10 - 99, this.u() - 10 - 4 - 40, 99, 20)
               .N()
         );
      }

      this.method_37063(
         class05362.method_46430(class00392.L("mco.selectServer.buy"), class01321.y(this, class03597.b)).N(this.L() - 10 - 99, this.u() - 10 - 20, 99, 20).N()
      );
      this.method_37063(new class04897(this.N() + 4, this.y() + 4, 14, 14, i, var1 -> this.method_25419(), y)).method_47400(class04141.N(y));
      int ix = 142 - (this.b ? 40 : 20);
      class04161 class04161 = new class04161(this.L() - 10 - 100, this.y() + 10, 100, ix, N, this.field_22793);
      if (class04161.L()) {
         class04161.method_25358(94);
      }

      this.method_37063(class04161);
   }

   @Override
   public void method_25393() {
      super.method_25393();
      if (++this.n > 100) {
         this.n = 0;
         this.v = (this.v + 1) % s.size();
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      this.T.method_25420(var1, -1, -1, var4);
      var1.L();
      this.T.method_25394(var1, -1, -1, var4);
      var1.L();
      this.method_52752(var1);
      var1.N(class08394.Na, L, this.N(), this.y(), 320, 172);
      if (!s.isEmpty()) {
         var1.N(class08394.Na, s.get(this.v), this.N() + 10, this.y() + 10, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (this.j != null) {
         N(var1, this.j);
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.T);
   }
}
