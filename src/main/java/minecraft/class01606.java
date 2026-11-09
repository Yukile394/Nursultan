package minecraft;

public class class01606 implements class07854 {
   private static final class00392 N = class00392.L("multiplayer.status.request_handled");
   private final class07806 y;
   private final class00642 L;
   private boolean u;

   @Override
   public void method_12697(class07839 var1) {
      this.L.method_10743(new class07832(var1.N()));
      this.L.method_10747(N);
   }

   public class01606(class07806 var1, class00642 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public void N(class07848 var1) {
      if (this.u) {
         this.L.method_10747(N);
      } else {
         this.u = true;
         this.L.method_10743(new class07846(this.y));
      }
   }

   @Override
   public boolean method_48106() {
      return this.L.method_10758();
   }

   @Override
   public void method_10839(class02570 var1) {
   }
}
