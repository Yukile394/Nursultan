package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class00197 extends class05096 {
   private static final List<class00235> N = List.of(class00235.values());
   private static final class00392 y = class00392.L(class00869.TN.w());
   private static final class00392 L = class00392.L("test_block.message");
   private final class07209 u;
   private class00235 i;
   private String R;
   @Nullable
   private class04927 M;

   public class00197(class08594 var1) {
      super(y);
      this.u = var1.d();
      this.i = var1.L();
      this.R = var1.Z();
   }

   private void y() {
      this.field_22787.N(null);
   }

   private void N(class00235 var1) {
      this.i = var1;
      this.M.field_22764 = var1 != class00235.field_56024;
   }

   private void N() {
      this.R = this.M.method_1882();
      this.field_22787.NE().N(new class08640(this.u, this.i, this.R));
      this.method_25419();
   }

   @Override
   public void method_25426() {
      this.M = new class04927(this.field_22793, this.field_22789 / 2 - 152, 80, 240, 20, class00392.L("test_block.message"));
      this.M.method_1880(128);
      this.M.method_1852(this.R);
      this.method_37063(this.M);
      this.N(this.i);
      this.method_37063(
         class06366.<class00235>N(class00235::N, this.i).N(N).N().N(this.field_22789 / 2 - 4 - 150, 185, 50, 20, y, (var1, var2) -> this.N(var2))
      );
      this.method_37063(class05362.method_46430(class05220.u, var1 -> this.N()).N(this.field_22789 / 2 - 4 - 150, 210, 150, 20).N());
      this.method_37063(class05362.method_46430(class05220.i, var1 -> this.y()).N(this.field_22789 / 2 + 4, 210, 150, 20).N());
   }

   @Override
   protected void method_56131() {
      if (this.M != null) {
         this.method_48265(this.M);
      } else {
         super.method_56131();
      }
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 10, -1);
      if (this.i != class00235.field_56024) {
         var1.y(this.field_22793, L, this.field_22789 / 2 - 153, 70, -6250336);
      }

      var1.y(this.field_22793, this.i.y(), this.field_22789 / 2 - 153, 174, -6250336);
   }

   @Override
   public void method_25419() {
      this.y();
   }

   @Override
   public boolean method_25421() {
      return false;
   }
}
