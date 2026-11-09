package minecraft;

public class class05695 extends class05096 {
   private static final class00392 N = class00392.L("outOfMemory.title");
   private static final class00392 y = class00392.L("outOfMemory.message");
   private static final int L = 300;
   private final class03686 u = new class03686(this);

   public class05695() {
      super(N);
   }

   @Override
   public void method_25426() {
      this.u.N(N, this.field_22793);
      this.u.L(class02091.N(y, this.field_22793).N(300).N());
      class01885 class01885 = this.u.y(class01885.i().N(8));
      class01885.N(class05362.method_46430(class05220.E, var1x -> this.field_22787.N(new class04705())).N());
      class01885.N(class05362.method_46430(class00392.L("menu.quit"), var1x -> this.field_22787.NP()).N());
      this.u.method_48206(this::method_37063);
      this.method_48640();
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_48640() {
      this.u.N();
   }
}
