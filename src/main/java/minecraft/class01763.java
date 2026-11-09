package minecraft;

import org.jspecify.annotations.Nullable;

public class class01763 {
   public final int N;
   public final int y;
   public final int L;
   private final int W;
   public int u = -1;
   public float i;
   public float R;
   public float M;
   @Nullable
   public class01763 B;
   public boolean Z;
   public float z;
   public float U;
   public class04425 E = class04425.field_22;

   public float L(class01763 var1) {
      float f = var1.N - this.N;
      float f1 = var1.y - this.y;
      float f2 = var1.L - this.L;
      return f * f + f1 * f1 + f2 * f2;
   }

   public static class01763 L(class00667 var0) {
      class01763 class01763 = new class01763(var0.readInt(), var0.readInt(), var0.readInt());
      N(var0, class01763);
      return class01763;
   }

   public float L(class07209 var1) {
      float f = Math.abs(var1.method_10263() - this.N);
      float f1 = Math.abs(var1.method_10264() - this.y);
      float f2 = Math.abs(var1.method_10260() - this.L);
      return f + f1 + f2;
   }

   public class01763(int var1, int var2, int var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.W = y(var1, var2, var3);
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class01763 class01763)
         ? false
         : this.W == class01763.W && this.N == class01763.N && this.y == class01763.y && this.L == class01763.L;
   }

   @Override
   public String toString() {
      return "Node{x=" + this.N + ", y=" + this.y + ", z=" + this.L + "}";
   }

   @Override
   public int hashCode() {
      return this.W;
   }

   public class06889 i() {
      return new class06889(this.N, this.y, this.L);
   }

   public class07209 u() {
      return new class07209(this.N, this.y, this.L);
   }

   public float u(class01763 var1) {
      float f = Math.abs(var1.N - this.N);
      float f1 = Math.abs(var1.y - this.y);
      float f2 = Math.abs(var1.L - this.L);
      return f + f1 + f2;
   }

   public void y(class00667 var1) {
      var1.writeInt(this.N);
      var1.writeInt(this.y);
      var1.writeInt(this.L);
      var1.writeFloat(this.z);
      var1.writeFloat(this.U);
      var1.writeBoolean(this.Z);
      var1.N((Enum<?>)this.E);
      var1.writeFloat(this.M);
   }

   public float y(class01763 var1) {
      float f = var1.N - this.N;
      float f1 = var1.L - this.L;
      return class04995.N(f * f + f1 * f1);
   }

   public static int y(int var0, int var1, int var2) {
      return var1 & 0xFF | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 < 0 ? Integer.MIN_VALUE : 0) | (var2 < 0 ? 32768 : 0);
   }

   public float y(class07209 var1) {
      float f = var1.method_10263() - this.N;
      float f1 = var1.method_10264() - this.y;
      float f2 = var1.method_10260() - this.L;
      return f * f + f1 * f1 + f2 * f2;
   }

   public class01763 N(int var1, int var2, int var3) {
      class01763 class01763 = new class01763(var1, var2, var3);
      class01763.u = this.u;
      class01763.i = this.i;
      class01763.R = this.R;
      class01763.M = this.M;
      class01763.B = this.B;
      class01763.Z = this.Z;
      class01763.z = this.z;
      class01763.U = this.U;
      class01763.E = this.E;
      return class01763;
   }

   public float N(class07209 var1) {
      float f = var1.method_10263() - this.N;
      float f1 = var1.method_10264() - this.y;
      float f2 = var1.method_10260() - this.L;
      return class04995.N(f * f + f1 * f1 + f2 * f2);
   }

   protected static void N(class00667 var0, class01763 var1) {
      var1.z = var0.readFloat();
      var1.U = var0.readFloat();
      var1.Z = var0.readBoolean();
      var1.E = var0.y(class04425.class);
      var1.M = var0.readFloat();
   }

   public float N(class01763 var1) {
      float f = var1.N - this.N;
      float f1 = var1.y - this.y;
      float f2 = var1.L - this.L;
      return class04995.N(f * f + f1 * f1 + f2 * f2);
   }

   public boolean R() {
      return this.u >= 0;
   }
}
