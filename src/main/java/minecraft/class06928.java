package minecraft;

public class class06928 extends class06937 {
   private final class06917 N;
   private final class08036 y;
   private int M;
   private final class07288 B;

   public class06928(class08036 var1, class07288 var2, class06917 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.y = var1;
      this.B = var2;
      this.N = var3;
   }

   @Override
   public void N(class08036 var1, class06584 var2) {
      this.c_(var2);
      class07324 class07324 = this.N.y();
      if (class07324 != null) {
         class06584 class06584x = this.N.method_5438(0);
         class06584 class06584x = this.N.method_5438(1);
         if (class07324.y(class06584x, class06584x) || class07324.y(class06584x, class06584x)) {
            this.B.N(class07324);
            var1.method_7281(class01235.S);
            this.N.method_5447(0, class06584x);
            this.N.method_5447(1, class06584x);
         }

         this.B.N(this.B.u() + class07324.T());
      }
   }

   @Override
   protected void N(class06584 var1, int var2) {
      this.M += var2;
      this.c_(var1);
   }

   @Override
   public class06584 N(int var1) {
      if (this.R()) {
         this.M = this.M + Math.min(var1, this.i().c());
      }

      return super.N(var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return false;
   }

   @Override
   protected void c_(class06584 var1) {
      var1.N(this.y, this.M);
      this.M = 0;
   }
}
