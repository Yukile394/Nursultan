package minecraft;

import org.joml.Vector3f;

public class class01151 extends class01167<class01162> {
   private final Vector3f N;
   private final Vector3f y;

   public class01151(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class01162 var14, class06143 var15) {
      super(var1, var2, var4, var6, var8, var10, var12, var14, var15);
      float f = this.field_3840.z() * 0.4F + 0.6F;
      this.N = this.N(var14.N(), f);
      this.y = this.N(var14.y(), f);
   }

   private void N(float var1) {
      float f = (this.field_3866 + var1) / (this.field_3847 + 1.0F);
      Vector3f vector3f = new Vector3f(this.N).lerp(this.y, f);
      this.field_62633 = vector3f.x();
      this.field_62634 = vector3f.y();
      this.field_62635 = vector3f.z();
   }

   private Vector3f N(Vector3f var1, float var2) {
      return new Vector3f(this.N(var1.x(), var2), this.N(var1.y(), var2), this.N(var1.z(), var2));
   }

   @Override
   public void method_3074(class00965 var1, class05363 var2, float var3) {
      this.N(var3);
      super.method_3074(var1, var2, var3);
   }
}
