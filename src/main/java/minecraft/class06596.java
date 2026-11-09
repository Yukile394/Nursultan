package minecraft;

import org.joml.Matrix4f;

public interface class06596 extends class07915 {
   float N = 8.0F;
   float y = 8.0F;
   float L = 8.0F;

   int M();

   int B();

   float Z();

   float i();

   default float n() {
      return 8.0F;
   }

   @Override
   default float m() {
      return this.s() + this.v();
   }

   default float v() {
      return 8.0F;
   }

   default float j() {
      return 8.0F;
   }

   @Override
   default float U() {
      return this.i();
   }

   @Override
   default float E() {
      return this.R() + 7.0F - this.n();
   }

   void N(Matrix4f var1, class01391 var2, int var3, float var4, float var5, float var6, int var7);

   @Override
   default void N(Matrix4f var1, class01391 var2, int var3, boolean var4) {
      float f = 0.0F;
      if (this.B() != 0) {
         this.N(var1, var2, var3, this.Z(), this.Z(), 0.0F, this.B());
         if (!var4) {
            f += 0.03F;
         }
      }

      this.N(var1, var2, var3, 0.0F, 0.0F, f, this.M());
   }

   @Override
   default float W() {
      return this.U() + this.j();
   }

   float R();
}
