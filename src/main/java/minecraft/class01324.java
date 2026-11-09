package minecraft;

class class01324 extends class07962 {
   public class01324(class07079 var1, Class<? extends class07438> var2, float var3, float var4) {
      super(var2, var3, var4);
      this.B = var1;
   }

   @Override
   public boolean y() {
      return super.y() && !this.B.n() && !this.B.d();
   }

   @Override
   public boolean N() {
      return super.N() && !this.B.n() && !this.B.d();
   }
}
