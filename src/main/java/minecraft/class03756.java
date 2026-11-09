package minecraft;

import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class03756 extends class06478 {
   private static final float N = 2.125F;
   private static final float y = 0.97F;
   private static final float L = 2.5F;
   private static final float u = -5.0F;
   private static final float i = 30.0F;
   private static final float R = 50.0F;
   private final class02721 M;
   private final class02721 B;
   private final Supplier<class01631> Z;
   private float z = -5.0F;
   private float U = 30.0F;

   public class03756(int var1, int var2, class01140 var3, Supplier<class01631> var4) {
      super(0, 0, var1, var2, class05220.N);
      this.M = new class02721(var3.N(class04802.Lg), false);
      this.B = new class02721(var3.N(class04802.LK), true);
      this.Z = var4;
   }

   @Nullable
   @Override
   public class02106 method_48205(class02089 var1) {
      return null;
   }

   @Override
   protected void method_47399(class03428 var1) {
   }

   @Override
   protected void method_25349(class06613 var1, double var2, double var4) {
      this.z = class04995.N(this.z - (float)var4 * 2.5F, -50.0F, 50.0F);
      this.U += (float)var2 * 2.5F;
   }

   @Override
   public void method_25354(class09033 var1) {
   }

   @Override
   protected void method_48579(class01054 var1, int var2, int var3, float var4) {
      float f = 0.97F * this.method_25364() / 2.125F;
      float f1 = -1.0625F;
      class01631 class01631 = this.Z.get();
      class02721 class02721 = class01631.u() == class04208.field_41122 ? this.B : this.M;
      var1.N(class02721, class01631.N().y(), f, this.z, this.U, -1.0625F, this.method_46426(), this.method_46427(), this.method_55442(), this.method_55443());
   }
}
