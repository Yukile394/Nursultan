package minecraft;

public class class05044 implements class00381<class08051> {
   public static final class02362<class00667, class05044> N = class00381.N(class05044::N, class05044::new);
   private final class07209 y;
   private final int L;
   private final boolean u;

   public boolean L() {
      return this.u;
   }

   public class05044(class07209 var1, int var2, boolean var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private class05044(class00667 var1) {
      super();
      this.y = var1.i();
      this.L = var1.E();
      this.u = var1.readBoolean();
   }

   public int y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.N(this.y);
      var1.L(this.L);
      var1.writeBoolean(this.u);
   }

   public class07209 N() {
      return this.y;
   }

   public void method_65081(class08051 var1) {
      var1.method_27273(this);
   }

   @Override
   public class02897<class05044> method_65080() {
      return class04248.yc;
   }
}
