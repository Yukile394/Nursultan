package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class03417 extends class05096 {
   static final class01894 N = class01894.y("icon/checkmark");
   private static final class00392 L = class00392.L("gui.chatSelection.title");
   private static final class00392 u = class00392.L("gui.chatSelection.context");
   @Nullable
   private final class05096 i;
   private final class03409 R;
   private class05362 M;
   private class05482 B;
   private class03383 Z;
   final class03399 y;
   private final Consumer<class03399> z;
   private class03958 U;

   private void L() {
      int ix = this.Z.y();
      this.U.N(ix, this.Z);
   }

   public class03417(@Nullable class05096 var1, class03409 var2, class03399 var3, Consumer<class03399> var4) {
      super(L);
      this.i = var1;
      this.R = var2;
      this.y = var3.u();
      this.z = var4;
   }

   void y() {
      this.M.field_22763 = !this.y.N().isEmpty();
   }

   private boolean N(class03387 var1) {
      return var1.N(this.y.R());
   }

   void N() {
      this.L();
   }

   @Override
   public void method_25426() {
      this.U = new class03958(this.R, this::N);
      this.B = class05482.N(this.field_22793, u, this.field_22789 - 16);
      this.Z = this.method_37063(new class03383(this, this.field_22787, (this.B.N() + 1) * 9));
      this.method_37063(class05362.method_46430(class05220.U, var1 -> this.method_25419()).N(this.field_22789 / 2 - 155, this.field_22790 - 32, 150, 20).N());
      this.M = this.method_37063(class05362.method_46430(class05220.u, var1 -> {
         this.z.accept(this.y);
         this.method_25419();
      }).N(this.field_22789 / 2 - 155 + 160, this.field_22790 - 32, 150, 20).N());
      this.y();
      this.L();
      this.Z.method_44382(this.Z.method_44390());
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      class00580 class00580 = var1.B();
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 10, -1);
      AbuseReportLimits abusereportlimits = this.R.N().y();
      int ix = this.y.N().size();
      int j = abusereportlimits.maxReportedMessageCount();
      class05216 class05216 = class00392.N("gui.chatSelection.selected", ix, j);
      var1.N(this.field_22793, class05216, this.field_22789 / 2, 26, -1);
      int k = this.Z.L();
      this.B.N(class00937.field_62010, this.field_22789 / 2, k, 9, class00580);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.i);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), u);
   }
}
