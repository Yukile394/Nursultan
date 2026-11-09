package minecraft;

import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01588 implements class01608, class05197 {
   private final boolean i;
   private final int R;
   private final int M;
   private final boolean B;
   float N;
   float y;
   private float Z;
   private float z;
   private float U;
   private float E;
   private float W;
   private float m;
   private float P;
   private float s;
   final List<class07915> L;
   @Nullable
   private List<class00941> T;
   @Nullable
   private List<class00578> b;
   private static final float j = 0.5F;

   public class01588(class01590 var1, float var2, float var3, int var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, 0, var5, var6);
   }

   public class01588(class01590 var1, float var2, float var3, int var4, int var5, boolean var6, boolean var7) {
      super();
      this.u = var1;
      this.Z = Float.MAX_VALUE;
      this.z = Float.MAX_VALUE;
      this.U = -Float.MAX_VALUE;
      this.E = -Float.MAX_VALUE;
      this.W = Float.MAX_VALUE;
      this.m = Float.MAX_VALUE;
      this.P = -Float.MAX_VALUE;
      this.s = -Float.MAX_VALUE;
      this.L = new ArrayList<>();
      this.N = var2;
      this.y = var3;
      this.i = var6;
      this.R = var4;
      this.M = var5;
      this.B = var7;
      this.N(var2, var3, 0.0F);
   }

   @Override
   public boolean accept(int var1, class00405 var2, int var3) {
      class07948 class07948 = this.u.N(var3, var2);
      return this.N(var1, var2, class07948);
   }

   private float y(float var1) {
      return ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) ? var1 - 0.5F : var1;
   }

   private int N(class00405 var1, int var2) {
      Integer integer = var1.y();
      if (integer != null) {
         float f = class02566.W(var2);
         float f1 = class02566.W(integer);
         return f != 1.0F ? class02566.R(class02566.u(f * f1), integer) : integer;
      } else {
         return this.i ? class02566.y(var2, 0.25F) : 0;
      }
   }

   private int N(@Nullable class05194 var1) {
      if (var1 != null) {
         int ix = class02566.y(this.R);
         int jx = var1.N();
         return class02566.R(ix, jx);
      } else {
         return this.R;
      }
   }

   @Override
   public void N(class01609 var1) {
      if (class02566.y(this.M) != 0) {
         var1.N(this.u.L.N().N(this.W, this.m, this.P, this.s, -0.01F, this.M, 0, 0.0F));
      }

      for (class07915 class07915 : this.L) {
         var1.N(class07915);
      }

      if (this.T != null) {
         for (class00941 class00941 : this.T) {
            var1.N(class00941);
         }
      }

      if (this.b != null) {
         for (class00578 class00578 : this.b) {
            var1.N(class00578);
         }
      }
   }

   @Nullable
   @Override
   public class03255 N() {
      if (!(this.Z >= this.U) && !(this.z >= this.E)) {
         int ix = class04995.y(this.Z);
         int jx = class04995.y(this.z);
         int k = class04995.u(this.U);
         int l = class04995.u(this.E);
         return new class03255(ix, jx, k - ix, l - jx);
      } else {
         return null;
      }
   }

   private float N(float var1) {
      return ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) ? var1 - 0.5F : var1;
   }

   private void N(float var1, float var2, float var3) {
      if (class02566.y(this.M) != 0) {
         this.W = Math.min(this.W, var1 - 1.0F);
         this.m = Math.min(this.m, var2 - 1.0F);
         this.P = Math.max(this.P, var1 + var3);
         this.s = Math.max(this.s, var2 + 9.0F);
         this.N(this.W, this.m, this.P, this.s);
      }
   }

   private void N(class07915 var1) {
      this.L.add(var1);
      this.N(var1.U(), var1.E(), var1.W(), var1.m());
   }

   private void N(class00941 var1) {
      if (this.T == null) {
         this.T = new ArrayList<>();
      }

      this.T.add(var1);
      this.N(var1.U(), var1.E(), var1.W(), var1.m());
   }

   private void N(class00578 var1) {
      if (this.b == null) {
         this.b = new ArrayList<>();
      }

      this.b.add(var1);
   }

   private void N(float var1, float var2, float var3, float var4) {
      this.Z = Math.min(this.Z, var1);
      this.z = Math.min(this.z, var2);
      this.U = Math.max(this.U, var3);
      this.E = Math.max(this.E, var4);
   }

   public boolean N(int var1, class00405 var2, class07948 var3) {
      class05247 class05247 = var3.N();
      boolean flag = var2.L();
      class05194 class05194 = var2.N();
      int ix = this.N(class05194);
      int jx = this.N(var2, ix);
      float f = class05247.N(flag);
      float f1 = var1 == 0 ? this.N - 1.0F : this.N;
      float f2 = class05247.y();
      float f3 = flag ? class05247.N() : 0.0F;
      class07915 class07915 = var3.N(this.N, this.y, ix, jx, var2, f3, f2);
      if (class07915 != null) {
         this.N(class07915);
      } else if (this.B) {
         this.N(new class00578(this.N, this.y, f, 7.0F, 9.0F, var2));
      }

      this.N(this.N, this.y, f);
      if (var2.i()) {
         class07913 class07913x = this.u.L.N();
         float f15 = this.y + 4.5F - 1.0F;
         float f16 = this.N + f;
         float f17 = this.y + 4.5F;
         float f7 = 0.01F;
         float f6 = f17;
         float f5 = f16;
         float f4 = f15;
         this.N(class07913x.N(f1, this.N(f4), f5, this.y(f6), f7, ix, jx, f2));
      }

      if (var2.R()) {
         class07913 class07913 = this.u.L.N();
         float f12 = this.y + 9.0F - 1.0F;
         float f13 = this.N + f;
         float f14 = this.y + 9.0F;
         float f11 = 0.01F;
         float f10 = f14;
         float f9 = f13;
         float f8 = f12;
         this.N(class07913.N(f1, this.N(f8), f9, this.y(f10), f11, ix, jx, f2));
      }

      this.N += f;
      return true;
   }
}
