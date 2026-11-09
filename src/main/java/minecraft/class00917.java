package minecraft;

import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixin.EndFlashAccess;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00917 implements EndFlashAccess {
   public static final int N = 30;
   private static final int y = 600;
   private static final int L = 200;
   private static final int u = 100;
   private static final int i = 380;
   private long R;
   private int M;
   private int B;
   private float Z;
   private float z;
   private float U;
   private float E;
   private static final float W = 1.0F;

   private float L(long var1) {
      long ix = var1 % 600L;
      return ix >= this.M && ix <= this.M + this.B ? class04995.m((float)(ix - this.M) * (float) Math.PI / this.B) : 0.0F;
   }

   public boolean L() {
      return this.Z > 0.0F && this.z <= 0.0F;
   }

   public class00917() {
      super();
   }

   public float y() {
      return this.E;
   }

   private void y(long var1) {
      long ix = var1 / 600L;
      if (ix != this.R) {
         class06069 class06069 = class06069.y(ix);
         class06069.z();
         this.M = class04995.y(class06069, 0, 200);
         this.B = class04995.y(class06069, 100, Math.min(380, 600 - this.M));
         this.U = class04995.y(class06069, -60.0F, 10.0F);
         this.E = class04995.y(class06069, -180.0F, 180.0F);
         this.R = ix;
      }
   }

   private void N(long var1, CallbackInfo var3, long var4, class06069 var6) {
      if (Iris.getCurrentPack().isPresent()) {
         var3.cancel();
         this.U = -class04995.y(var6, 1.0F, 60.0F);
         this.E = class04995.y(var6, -180.0F, 180.0F);
         this.R = var4;
      }
   }

   public void N(long var1) {
      this.y(var1);
      this.z = this.Z;
      this.Z = this.L(var1);
   }

   public float N(float var1) {
      return class04995.B(var1, this.z, this.Z);
   }

   public float N() {
      return this.U;
   }
}
