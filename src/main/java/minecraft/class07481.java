package minecraft;

public class class07481 extends class06937 {
   private final class08036 N;
   private int y;

   public class07481(class08036 var1, class06695 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.N = var1;
   }

   @Override
   protected void N(class06584 var1, int var2) {
      this.y += var2;
      this.c_(var1);
   }

   @Override
   public void N(class08036 var1, class06584 var2) {
      this.c_(var2);
      super.N(var1, var2);
   }

   @Override
   public class06584 N(int var1) {
      if (this.R()) {
         this.y = this.y + Math.min(var1, this.i().c());
      }

      return super.N(var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return false;
   }

   @Override
   protected void c_(class06584 var1) {
      var1.N(this.N, this.y);
      if (this.N instanceof class04770 class04770) {
         class06695 class06695 = this.L;
         if (class06695 instanceof class07242) {
            ((class07242)class06695).N(class04770);
         }
      }

      this.y = 0;
   }
}
