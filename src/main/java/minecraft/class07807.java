package minecraft;

public class class07807 implements class00381<class08051> {
   public static final class02362<class00667, class07807> N = class00381.N(class07807::N, class07807::new);
   private static final int y = 384;
   private final class07209 L;
   private final String[] u;
   private final boolean i;

   public String[] L() {
      return this.u;
   }

   public class07807(class07209 var1, boolean var2, String var3, String var4, String var5, String var6) {
      super();
      this.L = var1;
      this.i = var2;
      this.u = new String[]{var3, var4, var5, var6};
   }

   private class07807(class00667 var1) {
      super();
      this.L = var1.i();
      this.i = var1.readBoolean();
      this.u = new String[4];

      for (int ix = 0; ix < 4; ix++) {
         this.u[ix] = var1.u(384);
      }
   }

   public boolean y() {
      return this.i;
   }

   private void N(class00667 var1) {
      var1.N(this.L);
      var1.writeBoolean(this.i);

      for (int ix = 0; ix < 4; ix++) {
         var1.N(this.u[ix]);
      }
   }

   public class07209 N() {
      return this.L;
   }

   public void method_65081(class08051 var1) {
      var1.method_12071(this);
   }

   @Override
   public class02897<class07807> method_65080() {
      return class04248.Lb;
   }
}
