package minecraft;

public class class06403 extends class06391<class06225> {
   public static final int NE = 4;
   public static final int NW = 4;
   public static final int Nm = 1;
   public static final float NP = 0.5F;
   private static final class07209 Ns = class07209.field_10980;
   private final boolean NT;

   public class06403(boolean var1) {
      super(class06225.y);
      this.NT = var1;
   }

   private void N(class05974 var1, class07209 var2, class00891 var3) {
      if (!var1.method_8320(var2).N(var3)) {
         var1.N(var2, true, null);
         this.N(var1, var2, var3.W());
      }
   }

   public static class07209 N(class07209 var0) {
      return Ns.method_10081(var0);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class07209 class07209xx = var1.i();
      class05974 class05974 = var1.y();

      for (class07209 class07209x : class07209.method_10097(
         new class07209(class07209xx.method_10263() - 4, class07209xx.method_10264() - 1, class07209xx.method_10260() - 4),
         new class07209(class07209xx.method_10263() + 4, class07209xx.method_10264() + 32, class07209xx.method_10260() + 4)
      )) {
         boolean flag = class07209x.method_19771(class07209xx, 2.5);
         if (flag || class07209x.method_19771(class07209xx, 3.5)) {
            if (class07209x.method_10264() < class07209xx.method_10264()) {
               if (flag) {
                  this.N(class05974, class07209x, class00869.q.W());
               } else if (class07209x.method_10264() < class07209xx.method_10264()) {
                  if (this.NT) {
                     this.N(class05974, class07209x, class00869.MP);
                  } else {
                     this.N(class05974, class07209x, class00869.MP.W());
                  }
               }
            } else if (class07209x.method_10264() > class07209xx.method_10264()) {
               if (this.NT) {
                  this.N(class05974, class07209x, class00869.N);
               } else {
                  this.N(class05974, class07209x, class00869.N.W());
               }
            } else if (!flag) {
               this.N(class05974, class07209x, class00869.q.W());
            } else if (this.NT) {
               this.N(class05974, new class07209(class07209x), class00869.MW);
            } else {
               this.N(class05974, new class07209(class07209x), class00869.N.W());
            }
         }
      }

      for (int i = 0; i < 4; i++) {
         this.N(class05974, class07209xx.method_10086(i), class00869.q.W());
      }

      class07209 class07209xx = class07209xx.method_10086(2);

      for (class07211 class07211 : class07221.field_11062) {
         this.N(class05974, class07209xx.method_10093(class07211), class00869.LH.W().y(class00651.i, class07211));
      }

      return true;
   }
}
