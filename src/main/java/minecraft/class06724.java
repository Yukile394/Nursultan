package minecraft;

public class class06724 {
   static final ThreadLocal<class06728> N = new ThreadLocal<>();

   private class06724() {
      super();
   }

   public static class06723 y(class06889 var0, class06889 var1, int var2, float var3) {
      return N(new class06755(var0, var1, var2, var3));
   }

   public static class06723 y(class06889 var0, class06889 var1, int var2) {
      return N(new class06755(var0, var1, var2, 2.5F));
   }

   public static class06723 N(class06889 var0, int var1, float var2) {
      return N(new class06721(var0, var1, var2));
   }

   public static class06723 N(class06889 var0, class06889 var1, class06889 var2, class06889 var3, class06747 var4) {
      return N(new class06740(var0, var1, var2, var3, var4));
   }

   public static class06723 N(class06889 var0, class06889 var1, class07211 var2, class06747 var3) {
      return N(class06740.N(var0, var1, var2, var3));
   }

   public static class06723 N(String var0, class07209 var1, int var2, int var3, float var4) {
      double d0 = 1.3;
      double d1 = 0.2;
      class06723 class06723 = N(var0, class06889.N(var1, 0.5, 1.3 + var2 * 0.2, 0.5), class06715.N(var3).N(var4));
      class06723.N();
      return class06723;
   }

   public static class06723 N(class07049 var0, int var1, String var2, int var3, float var4) {
      double d0 = 2.4;
      double d1 = 0.25;
      double d2 = var0.method_31477() + 0.5;
      double d3 = var0.method_23318() + 2.4 + var1 * 0.25;
      double d4 = var0.method_31479() + 0.5;
      float f = 0.5F;
      class06723 class06723 = N(var2, new class06889(d2, d3, d4), class06715.y(var3).N(var4).y(0.5F));
      class06723.N();
      return class06723;
   }

   public static class06723 N(String var0, class06889 var1, class06715 var2) {
      return N(new class06719(var1, var0, var2));
   }

   public static class06723 N(class06889 var0, class06889 var1, int var2, float var3) {
      return N(new class06742(var0, var1, var2, var3));
   }

   public static class06723 N(class07209 var0, float var1, class06747 var2) {
      return N(new class00734(var0).M(var1), var2);
   }

   public static class06723 N(class07209 var0, class06747 var1) {
      return N(new class00734(var0), var1);
   }

   public static class06723 N(class00734 var0, class06747 var1, boolean var2) {
      return N(new class06737(var0, var1, var2));
   }

   public static class06723 N(class00734 var0, class06747 var1) {
      return N(var0, var1, false);
   }

   public static class06723 N(class06730 var0) {
      class06728 class06728 = N.get();
      if (class06728 == null) {
         throw new IllegalStateException("Gizmos cannot be created here! No GizmoCollector has been registered.");
      } else {
         return class06728.method_75532(var0);
      }
   }

   public static class06734 N(class06728 var0) {
      class06734 class06734 = new class06734();
      N.set(var0);
      return class06734;
   }

   public static class06723 N(class06889 var0, class06889 var1, int var2) {
      return N(new class06742(var0, var1, var2, 3.0F));
   }

   public static class06723 N(class06889 var0, float var1, class06747 var2) {
      return N(new class06745(var0, var1, var2));
   }
}
