package minecraft;

public class class06183 extends class07089 {
   private final class07211 y;
   private final class07209 L;
   private final boolean u;
   private final boolean i;
   private final boolean R;

   public class06183 L() {
      return new class06183(this.u, this.N, this.y, this.L, this.i, true);
   }

   public boolean M() {
      return this.R;
   }

   public class06183(class06889 var1, class07211 var2, class07209 var3, boolean var4) {
      this(false, var1, var2, var3, var4, false);
   }

   private class06183(boolean var1, class06889 var2, class07211 var3, class07209 var4, boolean var5, boolean var6) {
      super(var2);
      this.u = var1;
      this.y = var3;
      this.L = var4;
      this.i = var5;
      this.R = var6;
   }

   public class06183(class06889 var1, class07211 var2, class07209 var3, boolean var4, boolean var5) {
      this(false, var1, var2, var3, var4, var5);
   }

   public class07211 i() {
      return this.y;
   }

   public class07209 u() {
      return this.L;
   }

   public static class06183 N(class06889 var0, class07211 var1, class07209 var2) {
      return new class06183(true, var0, var1, var2, false, false);
   }

   @Override
   public class07113 N() {
      return this.u ? class07113.field_1333 : class07113.field_1332;
   }

   public class06183 N(class07211 var1) {
      return new class06183(this.u, this.N, var1, this.L, this.i, this.R);
   }

   public class06183 N(class07209 var1) {
      return new class06183(this.u, this.N, this.y, var1, this.i, this.R);
   }

   public boolean R() {
      return this.i;
   }
}
