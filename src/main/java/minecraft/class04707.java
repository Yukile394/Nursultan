package minecraft;

import org.jspecify.annotations.Nullable;

class class04707 extends class05699<class04707> {
   private static final class01883 L = new class01883(class01894.y("icon/link"), class01894.y("icon/link_highlighted"));
   private static final class01883 u = new class01883(class01894.y("icon/video_link"), class01894.y("icon/video_link_highlighted"));
   private static final class00392 i = class00392.L("mco.template.info.tooltip");
   private static final class00392 R = class00392.L("mco.template.trailer.tooltip");
   public final class04982 N;
   @Nullable
   private class04897 M;
   @Nullable
   private class04897 B;

   public class04707(class04739 var1, class04982 var2) {
      super();
      this.y = var1;
      this.N = var2;
      if (!var2.i().isBlank()) {
         this.M = new class04897(15, 15, L, class01321.y(var1, var2.i()), i);
         this.M.method_47400(class04141.N(i));
      }

      if (!var2.M().isBlank()) {
         this.B = new class04897(15, 15, u, class01321.y(var1, var2.M()), R);
         this.B.method_47400(class04141.N(R));
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.y.R = this.N;
      this.y.N();
      if (var2 && this.method_25370()) {
         this.y.u.accept(this.N);
      }

      if (this.M != null) {
         this.M.method_25402(var1, var2);
      }

      if (this.B != null) {
         this.B.method_25402(var1, var2);
      }

      return super.method_25402(var1, var2);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      var1.N(class08394.Na, class04602.N(this.N.N(), this.N.R()), this.method_73380() + 1, this.method_73382() + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
      var1.N(class08394.Na, class04739.y, this.method_73380(), this.method_73382() + 1, 40, 40);
      byte b0 = 5;
      int ix = class04739.y(this.y).y(this.N.L());
      if (this.M != null) {
         this.M.y(this.method_73389() - ix - this.M.method_25368() - 10, this.method_73382());
         this.M.method_25394(var1, var2, var3, var5);
      }

      if (this.B != null) {
         this.B.y(this.method_73389() - ix - this.B.method_25368() * 2 - 15, this.method_73382());
         this.B.method_25394(var1, var2, var3, var5);
      }

      int j = this.method_73380() + 45 + 20;
      int k = this.method_73382() + 5;
      var1.y(class04739.L(this.y), this.N.y(), j, k, -1);
      var1.y(class04739.u(this.y), this.N.L(), this.method_73389() - ix - 5, k, -6250336);
      var1.y(class04739.i(this.y), this.N.u(), j, k + 9 + 5, -6250336);
      if (!this.N.B().isBlank()) {
         var1.y(class04739.M(this.y), this.N.B(), j, this.method_73386() - 4 - 5, -8355712);
      }
   }

   @Override
   public class00392 method_37006() {
      class00392 class00392 = class05220.y(
         class00392.y(this.N.y()),
         class00392.N("mco.template.select.narrate.authors", this.N.u()),
         class00392.y(this.N.B()),
         class00392.N("mco.template.select.narrate.version", this.N.L())
      );
      return class00392.N("narrator.select", class00392);
   }
}
