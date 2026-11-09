package minecraft;

class class05958 implements class01262 {
   private final int N;
   private final boolean y;

   public class05958(int var1, boolean var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void N(class05973 var1) {
      var1.B = var1.B + this.N;
   }

   @Override
   public void N(class01054 var1, float var2, float var3) {
      int i = class02566.N(var3, var2, var2, var2);
      if (this.N < 0) {
         var1.N(class08394.Na, class05973.y, 0, 0, 16, 16, i);
      } else {
         var1.N(class08394.Na, class05973.L, 0, 0, 16, 16, i);
      }
   }

   @Override
   public class00392 aw_() {
      return this.N < 0 ? class05973.i : class05973.R;
   }

   @Override
   public boolean ax_() {
      return this.y;
   }
}
