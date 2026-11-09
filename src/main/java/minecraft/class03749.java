package minecraft;

public class class03749 extends class05096 {
   private static final class00392 N = class00392.L("gui.abuseReport.title");
   private static final class00392 y = class00392.L("gui.abuseReport.message");
   private static final class00392 L = class00392.L("gui.abuseReport.type.chat");
   private static final class00392 u = class00392.L("gui.abuseReport.type.skin");
   private static final class00392 i = class00392.L("gui.abuseReport.type.name");
   private static final int R = 6;
   private final class05096 M;
   private final class03409 B;
   private final class05472 Z;
   private final class01885 z = class01885.u().N(6);

   public class03749(class05096 var1, class03409 var2, class05472 var3) {
      super(N);
      this.M = var1;
      this.B = var2;
      this.Z = var3;
   }

   @Override
   public void method_25426() {
      this.z.L().y();
      this.z.N(new class02071(this.field_22785, this.field_22793), this.z.y().i(6));
      this.z.N(new class04230(y, this.field_22793).N(true), this.z.y().i(6));
      class05362 class05362 = this.z.N(class05362.method_46430(L, var1x -> this.field_22787.N(new class03948(this.M, this.B, this.Z.y()))).N());
      if (!this.Z.R()) {
         class05362.field_22763 = false;
         class05362.method_47400(class04141.N(class00392.L("gui.socialInteractions.tooltip.report.not_reportable")));
      } else if (!this.Z.i()) {
         class05362.field_22763 = false;
         class05362.method_47400(class04141.N(class00392.N("gui.socialInteractions.tooltip.report.no_messages", this.Z.N())));
      }

      this.z.N(class05362.method_46430(u, var1x -> this.field_22787.N(new class03724(this.M, this.B, this.Z.y(), this.Z.L()))).N());
      this.z.N(class05362.method_46430(i, var1x -> this.field_22787.N(new class03743(this.M, this.B, this.Z.y(), this.Z.N()))).N());
      this.z.N(class02057.y(20));
      this.z.N(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N());
      this.z.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.z.N();
      class02077.N(this.z, this.method_48202());
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.M);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), y);
   }
}
