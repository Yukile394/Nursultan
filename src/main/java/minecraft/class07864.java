package minecraft;

class class07864<T extends class07438> extends class07464<T> {
   private final class07894 z;

   @Override
   public void L() {
      this.Z.y(null);
      super.L();
   }

   public class07864(class07894 var1, Class<T> var2, float var3, double var4, double param6, double param8) {
      super(var2, var3, var4, var5, var7);
      this.Z = var1;
      this.z = var2;
   }

   @Override
   public void i() {
      this.Z.y(null);
      super.i();
   }

   @Override
   public boolean N() {
      return super.N() && this.y instanceof class00683 ? !this.z.NQ() && this.N((class00683)this.y) : false;
   }

   private boolean N(class00683 var1) {
      return var1.Nh() >= class07894.N(this.Z).y(5);
   }
}
