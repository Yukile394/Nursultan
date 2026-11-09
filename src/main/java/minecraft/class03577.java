package minecraft;

public class class03577 extends class05096 {
   private static final int field_43137 = 8;
   private static final int field_43138 = 210;
   private static final class00392 field_43139 = class00392.L("credits_and_attribution.screen.title");
   private static final class00392 field_43140 = class00392.L("credits_and_attribution.button.credits");
   private static final class00392 field_43141 = class00392.L("credits_and_attribution.button.attribution");
   private static final class00392 field_43142 = class00392.L("credits_and_attribution.button.licenses");
   private final class05096 field_43143;
   private final class03686 field_43144 = new class03686(this);

   public class03577(class05096 var1) {
      super(field_43139);
      this.field_43143 = var1;
   }

   @Override
   public void method_25426() {
      this.field_43144.N(field_43139, this.field_22793);
      class01885 class01885 = this.field_43144.L(class01885.u()).N(8);
      class01885.L().y();
      class01885.N(class05362.method_46430(field_43140, var1x -> this.method_49739()).N(210).N());
      class01885.N(class05362.method_46430(field_43141, class01321.y(this, class03597.u)).N(210).N());
      class01885.N(class05362.method_46430(field_43142, class01321.y(this, class03597.i)).N(210).N());
      this.field_43144.y(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N(200).N());
      this.field_43144.N();
      this.field_43144.method_48206(this::method_37063);
   }

   @Override
   public void method_48640() {
      this.field_43144.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.field_43143);
   }

   private void method_49739() {
      this.field_22787.N(new class04606(false, () -> this.field_22787.N(this)));
   }
}
