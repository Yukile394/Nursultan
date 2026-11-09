package minecraft;

public class class07979 extends class07473 {
   private final class07475 N;

   @Override
   public void L() {
      class07209 class07209x = null;

      for (class07209 class07209x : class07209.method_10094(
         class04995.N(this.N.method_23317() - 2.0),
         class04995.N(this.N.method_23318() - 2.0),
         class04995.N(this.N.method_23321() - 2.0),
         class04995.N(this.N.method_23317() + 2.0),
         this.N.method_31478(),
         class04995.N(this.N.method_23321() + 2.0)
      )) {
         if (this.N.method_73183().method_8316(class07209x).N(class01231.N)) {
            class07209x = class07209x;
            break;
         }
      }

      if (class07209x != null) {
         this.N.F().N(class07209x.method_10263(), class07209x.method_10264(), class07209x.method_10260(), 1.0);
      }
   }

   public class07979(class07475 var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean N() {
      return this.N.method_24828() && !this.N.method_73183().method_8316(this.N.method_24515()).N(class01231.N);
   }
}
