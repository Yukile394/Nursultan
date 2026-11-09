package minecraft;

class class03727 extends class04430 {
   private static final class00392 L = class00392.L("gui.abuseReport.discard.title").N(class06541.field_1067);
   private static final class00392 u = class00392.L("gui.abuseReport.discard.content");
   private static final class00392 i = class00392.L("gui.abuseReport.discard.return");
   private static final class00392 R = class00392.L("gui.abuseReport.discard.draft");
   private static final class00392 M = class00392.L("gui.abuseReport.discard.discard");

   protected class03727(class03709 var1) {
      super(L, u, u);
      this.y = var1;
   }

   @Override
   protected class03695 N() {
      class01885 class01885x = class01885.u().N(8);
      class01885x.L().y();
      class01885 class01885x = class01885x.N(class01885.i().N(8));
      class01885x.N(class05362.method_46430(i, var1x -> this.method_25419()).N());
      class01885x.N(class05362.method_46430(R, var1x -> {
         this.y.R();
         this.field_22787.N(this.y.Z);
      }).N());
      class01885x.N(class05362.method_46430(M, var1x -> {
         this.y.Z();
         this.field_22787.N(this.y.Z);
      }).N());
      return class01885x;
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.y);
   }
}
