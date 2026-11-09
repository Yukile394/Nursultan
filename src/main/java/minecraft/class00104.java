package minecraft;

import java.util.function.Consumer;

public class class00104 implements class03695 {
   private static final int y = 4;
   private static final int L = 10;
   final class03695 N;
   private final class00131 u;
   private int i;
   private int R;

   public class00104(class06202 var1, class03695 var2, int var3) {
      super();
      this.N = var2;
      this.u = new class00131(this, var1, 0, var3);
   }

   public void y(int var1) {
      this.R = var1;
      this.u.method_53533(Math.min(this.N.method_25364(), var1));
      this.u.method_65506();
   }

   @Override
   public void N(Consumer<class02102> var1) {
      var1.accept(this.u);
   }

   @Override
   public void N() {
      this.N.N();
      int ix = this.N.method_25368();
      this.u.method_25358(Math.max(ix + 20, this.i));
      this.u.method_53533(Math.min(this.N.method_25364(), this.R));
      this.u.method_65506();
   }

   public void N(int var1) {
      this.i = var1;
      this.u.method_25358(Math.max(this.N.method_25368(), var1));
   }

   @Override
   public int method_46427() {
      return this.u.method_46427();
   }

   @Override
   public void method_46419(int var1) {
      this.u.method_46419(var1);
   }

   @Override
   public int method_46426() {
      return this.u.method_46426();
   }

   @Override
   public void method_46421(int var1) {
      this.u.method_46421(var1);
   }

   @Override
   public int method_25364() {
      return this.u.method_25364();
   }

   @Override
   public int method_25368() {
      return this.u.method_25368();
   }
}
