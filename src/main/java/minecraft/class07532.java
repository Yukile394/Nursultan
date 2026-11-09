package minecraft;

class class07532 extends class07984 {
   private final class07541 N;

   @Override
   public void L() {
      super.L();
      this.N.R(true);
      this.N.method_6019(class07050.field_5808);
   }

   public class07532(class07172 var1, double var2, int var4, float var5) {
      super(var1, var2, var4, var5);
      this.N = (class07541)var1;
   }

   @Override
   public void u() {
      super.u();
      this.N.method_6021();
      this.N.R(false);
   }

   @Override
   public boolean N() {
      return super.N() && this.N.method_6047().N(class06570.db);
   }
}
