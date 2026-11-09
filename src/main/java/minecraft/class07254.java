package minecraft;

import java.util.UUID;

public class class07254 implements class00381<class07280> {
   public static final class02362<class04247, class07254> N = class00381.N(class07254::N, class07254::new);
   private static final int i = 1;
   private static final int R = 2;
   private static final int M = 4;
   public final UUID y;
   public final class07238 L;
   static final class07238 u = new class07246();

   public static class07254 L(class06687 var0) {
      return new class07254(var0.N(), new class07270(var0.y()));
   }

   private class07254(UUID var1, class07238 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private class07254(class04247 var1) {
      super();
      this.y = var1.m();
      class07239 class07239 = var1.y(class07239.class);
      this.L = class07239.field_29113.decode(var1);
   }

   public static class07254 i(class06687 var0) {
      return new class07254(var0.N(), new class07240(var0.R(), var0.M(), var0.B()));
   }

   public static class07254 u(class06687 var0) {
      return new class07254(var0.N(), new class07251(var0.u(), var0.i()));
   }

   public static class07254 y(class06687 var0) {
      return new class07254(var0.N(), new class07272(var0.L()));
   }

   static int N(boolean var0, boolean var1, boolean var2) {
      byte b0 = 0;
      if (var0) {
         b0 |= 1;
      }

      if (var1) {
         b0 |= 2;
      }

      if (var2) {
         b0 |= 4;
      }

      return b0;
   }

   public void N(class07262 var1) {
      this.L.N(this.y, var1);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public static class07254 N(class06687 var0) {
      return new class07254(var0.N(), new class07244(var0));
   }

   public static class07254 N(UUID var0) {
      return new class07254(var0, u);
   }

   private void N(class04247 var1) {
      var1.N(this.y);
      var1.N(this.L.N());
      this.L.N(var1);
   }

   @Override
   public class02897<class07254> method_65080() {
      return class04248.U;
   }
}
