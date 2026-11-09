package minecraft;

public class class05209 implements class05197 {
   private float y;
   private int L;

   public class05209(class05228 var1, float var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public boolean accept(int var1, class00405 var2, int var3) {
      this.y = this.y - this.N.N.getWidth(var3, var2);
      if (this.y >= 0.0F) {
         this.L = var1 + Character.charCount(var3);
         return true;
      } else {
         return false;
      }
   }

   public void y() {
      this.L = 0;
   }

   public int N() {
      return this.L;
   }
}
