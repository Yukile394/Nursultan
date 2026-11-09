package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;

public class class07109 {
   public static final class07109 N = new class07109(0.0F, 0.0F);
   public static final class07109 y = new class07109(1.0F, 1.0F);
   public static final class07109 L = new class07109(1.0F, 0.0F);
   public static final class07109 u = new class07109(-1.0F, 0.0F);
   public static final class07109 i = new class07109(0.0F, 1.0F);
   public static final class07109 R = new class07109(0.0F, -1.0F);
   public static final class07109 M = new class07109(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final class07109 B = new class07109(Float.MIN_VALUE, Float.MIN_VALUE);
   public static final Codec<class07109> Z = Codec.FLOAT
      .listOf()
      .comapFlatMap(var0 -> class07536.N(var0, 2).map(var0x -> new class07109((Float)var0x.get(0), (Float)var0x.get(1))), var0 -> List.of(var0.z, var0.U));
   public final float z;
   public final float U;

   public boolean L(class07109 var1) {
      return this.z == var1.z && this.U == var1.U;
   }

   public float L() {
      return this.z * this.z + this.U * this.U;
   }

   public class07109(float var1, float var2) {
      super();
      this.z = var1;
      this.U = var2;
   }

   public class07109 u() {
      return new class07109(-this.z, -this.U);
   }

   public float u(class07109 var1) {
      float f = var1.z - this.z;
      float f1 = var1.U - this.U;
      return f * f + f1 * f1;
   }

   public float y() {
      return class04995.N(this.z * this.z + this.U * this.U);
   }

   public class07109 y(float var1) {
      return new class07109(this.z + var1, this.U + var1);
   }

   public class07109 y(class07109 var1) {
      return new class07109(this.z + var1.z, this.U + var1.U);
   }

   public class07109 N(float var1) {
      return new class07109(this.z * var1, this.U * var1);
   }

   public class07109 N() {
      float f = class04995.N(this.z * this.z + this.U * this.U);
      return f < 1.0E-4F ? N : new class07109(this.z / f, this.U / f);
   }

   public float N(class07109 var1) {
      return this.z * var1.z + this.U * var1.U;
   }
}
