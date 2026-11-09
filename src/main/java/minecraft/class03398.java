package minecraft;

public class class03398 {
   private final class04714 N;
   private boolean y;
   private String L;

   public class03398(class04714 var1) {
      super();
      this.N = var1;
      class04717 class04717 = var1.N();
      this.y = class04717.y;
      this.L = class04717.N;
   }

   private class04717 y(class04979 var1) {
      class04717 class04717x = this.N.N();
      if (var1.N() != null && !var1.N().equals(class04717x.N)) {
         class04717 class04717x = new class04717();
         class04717x.N = var1.N();
         class04717x.y = true;
         this.N.N(class04717x);
         return class04717x;
      } else {
         return class04717x;
      }
   }

   public String y() {
      return this.L;
   }

   public void N(class04979 var1) {
      class04717 class04717 = this.y(var1);
      this.y = class04717.y;
      this.L = class04717.N;
   }

   public boolean N() {
      return this.y;
   }
}
