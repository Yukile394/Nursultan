package minecraft;

import Nursultan.class12025;
import org.jspecify.annotations.Nullable;

public class class00556 implements class00381<class08051>, class12025 {
   public static final class02362<class00667, class00556> N = class00381.N(class00556::N, class00556::new);
   private final int L;
   private final class00533 u;
   private final boolean i;
   static final class00533 y = new class00532();

   private class00556(class00667 var1) {
      super();
      this.L = var1.E();
      class00563 class00563 = var1.y(class00563.class);
      this.u = class00563.field_29174.apply(var1);
      this.i = var1.readBoolean();
   }

   private class00556(int var1, boolean var2, class00533 var3) {
      super();
      this.L = var1;
      this.u = var3;
      this.i = var2;
   }

   public boolean y() {
      return this.i;
   }

   public boolean N(class04770 var1, class00734 var2, double var3) {
      return this.u.N() == class00563.field_29172 ? var1.method_76729(var2, var3) : var1.method_56092(var2, var3);
   }

   @Nullable
   public class07049 N(class04782 var1) {
      return var1.method_31424(this.L);
   }

   public void N(class00565 var1) {
      this.u.N(var1);
   }

   public static class00556 N(class07049 var0, boolean var1) {
      return new class00556(var0.method_5628(), var1, y);
   }

   public static class00556 N(class07049 var0, boolean var1, class07050 var2) {
      return new class00556(var0.method_5628(), var1, new class00534(var2));
   }

   public static class00556 N(class07049 var0, boolean var1, class07050 var2, class06889 var3) {
      return new class00556(var0.method_5628(), var1, new class00545(var2, var3));
   }

   public void method_65081(class08051 var1) {
      var1.method_12062(this);
   }

   private void N(class00667 var1) {
      var1.L(this.L);
      var1.N((Enum<?>)this.u.N());
      this.u.N(var1);
      var1.writeBoolean(this.i);
   }

   @Override
   public class02897<class00556> method_65080() {
      return class04248.yH;
   }
}
