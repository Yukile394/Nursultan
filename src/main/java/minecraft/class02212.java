package minecraft;

import Nursultan.class09339;
import Nursultan.class11938;
import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;

public class class02212 implements class02233 {
   private float L;
   private float u;
   private float i;
   private float R;
   private long M;
   private long B;
   private final float Z;
   private final FloatUnaryOperator z;
   private boolean U;
   private boolean E;

   private void L() {
      if (!this.U) {
         this.R = this.u;
      }

      this.U = true;
   }

   public void L(boolean var1) {
      this.E = var1;
   }

   public class02212(float var1, long var2, FloatUnaryOperator var4) {
      super();
      this.Z = 1000.0F / var1;
      this.B = this.M = var2;
      this.z = var4;
   }

   private void u() {
      if (this.U) {
         this.u = this.R;
      }

      this.U = false;
   }

   @Override
   public float y() {
      return this.i > 7.0F ? 0.5F : this.i;
   }

   private void y(long var1) {
      this.i = (float)(var1 - this.B) / this.Z;
      this.B = var1;
   }

   public void y(boolean var1) {
      if (var1) {
         this.L();
      } else {
         this.u();
      }
   }

   @Override
   public float N(boolean var1) {
      if (!var1 && this.E) {
         return 1.0F;
      } else {
         return this.U ? this.R : this.u;
      }
   }

   private float N(float var1) {
      class09339 class09339 = class09339.N();
      class11938.L().L(class09339);
      return var1 / class09339.y();
   }

   @Override
   public float N() {
      return this.L;
   }

   public int N(long var1, boolean var3) {
      this.y(var1);
      return var3 ? this.N(var1) : 0;
   }

   private int N(long var1) {
      this.L = (float)(var1 - this.M) / this.N(this.z.apply(this.Z));
      this.M = var1;
      this.u = this.u + this.L;
      int ix = (int)this.u;
      this.u -= ix;
      return ix;
   }
}
