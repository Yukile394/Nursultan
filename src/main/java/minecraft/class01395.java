package minecraft;

public class class01395 extends class05914 {
   private static final class00392 N = class00392.L("controls.title");

   public class01395(class05096 var1, class05630 var2) {
      super(var1, var2, N);
   }

   private static class04370<?>[] N(class05630 var0) {
      return new class04370[]{var0.NT(), var0.Nb(), var0.Nj(), var0.Nv(), var0.f(), var0.Nn(), var0.S()};
   }

   @Override
   protected void method_60325() {
      this.field_51824
         .N(
            class05362.method_46430(class00392.L("options.mouse_settings"), var1 -> this.field_22787.N(new class05709(this, this.field_21336))).N(),
            class05362.method_46430(class00392.L("controls.keybinds"), var1 -> this.field_22787.N(new class01827(this, this.field_21336))).N()
         );
      this.field_51824.N(N(this.field_21336));
   }
}
