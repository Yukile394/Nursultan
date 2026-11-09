package minecraft;

public class class05138 extends class05407 {
   private static final class00392 N = class00392.L("mco.client.incompatible.title").y(-65536);
   private static final class00392 y = class00392.y(class07529.y().comp_4025()).y(-65536);
   private static final class00392 L = class00392.N("mco.client.unsupported.snapshot.version", y);
   private static final class00392 u = class00392.N("mco.client.outdated.stable.version", y);
   private final class05096 i;
   private final class03686 R = new class03686(this);

   public class05138(class05096 var1) {
      super(N);
      this.i = var1;
   }

   private class00392 N() {
      return class07529.y().comp_4031() ? u : L;
   }

   @Override
   public void method_25426() {
      this.R.N(N, this.field_22793);
      this.R.L(new class04230(this.N(), this.field_22793).N(true));
      this.R.y(class05362.method_46430(class05220.U, var1 -> this.method_25419()).N(200).N());
      this.R.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.R.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.i);
   }
}
