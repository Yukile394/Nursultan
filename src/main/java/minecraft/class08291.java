package minecraft;

import java.util.List;
import java.util.Optional;

public class class08291 extends class05096 {
   private static final class00392 N = class00392.L("book.editTitle");
   private static final class00392 y = class00392.L("book.finalizeWarning");
   private static final class00392 L = class00392.L("book.sign.title");
   private static final class00392 u = class00392.L("book.sign.titlebox");
   private final class05884 i;
   private final class08036 R;
   private final List<String> M;
   private final class07050 B;
   private final class00392 Z;
   private class04927 z;
   private String U = "";

   public class08291(class05884 var1, class08036 var2, class07050 var3, List<String> var4) {
      super(L);
      this.i = var1;
      this.R = var2;
      this.B = var3;
      this.M = var4;
      this.Z = class00392.N("book.byAuthor", var2.method_5477()).N(class06541.field_1063);
   }

   private void N() {
      int ix = this.B == class07050.field_5808 ? this.R.method_31548().N() : 40;
      this.field_22787.NE().N(new class00560(ix, this.M, Optional.of(this.z.method_1882().trim())));
   }

   @Override
   public void method_25426() {
      class05362 class05362 = class05362.method_46430(class00392.L("book.finalizeButton"), var1x -> {
         this.N();
         this.field_22787.N(null);
      }).N(this.field_22789 / 2 - 100, 196, 98, 20).N();
      class05362.field_22763 = false;
      this.z = this.method_37063(new class04927((class01590)this.field_22787.i_3, (this.field_22789 - 114) / 2 - 3, 50, 114, 20, u));
      this.z.method_1880(15);
      this.z.method_1858(false);
      this.z.method_71502(true);
      this.z.method_1868(-16777216);
      this.z.method_71503(false);
      this.z.method_1863(var1x -> class05362.field_22763 = !class05018.B(var1x));
      this.z.method_1852(this.U);
      this.method_37063(class05362);
      this.method_37063(class05362.method_46430(class05220.i, var1x -> {
         this.U = this.z.method_1882();
         this.field_22787.N(this.i);
      }).N(this.field_22789 / 2 + 2, 196, 98, 20).N());
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.z);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.z.method_25370() && !this.z.method_1882().isEmpty() && var1.u()) {
         this.N();
         this.field_22787.N(null);
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      super.method_25420(var1, var2, var3, var4);
      var1.N(class08394.Na, class05671.i, (this.field_22789 - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      int ix = (this.field_22789 - 192) / 2;
      byte b0 = 2;
      int j = this.field_22793.N(N);
      var1.N(this.field_22793, N, ix + 36 + (114 - j) / 2, 34, -16777216, false);
      int k = this.field_22793.N(this.Z);
      var1.N(this.field_22793, this.Z, ix + 36 + (114 - k) / 2, 60, -16777216, false);
      var1.N(this.field_22793, y, ix + 36, 82, 114, -16777216, false);
   }
}
