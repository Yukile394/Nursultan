package minecraft;

public class class01971 extends class01987<class03694, class03666, class08485> {
   private final class08943 N;

   protected class01971(class04832 var1) {
      super(var1);
      this.N = var1.y();
   }

   public void N(class08485 var1, class01421 var2, class01237 var3, int var4, float var5) {
      if (!var1.N.i()) {
         var2.N(class02058.u.rotation((float) Math.PI));
         var1.N.N(var2, var3, var4, class01384.u, var1.l);
      }
   }

   public void method_62354(class03694 var1, class08485 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class03666 class03666 = var1.b();
      if (class03666 != null) {
         this.N.N(var2.N, class03666.N(), class03666.y(), var1);
      } else {
         var2.N.y();
      }
   }

   public class08485 method_55269() {
      return new class08485();
   }
}
