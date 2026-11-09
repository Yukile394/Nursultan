package minecraft;

public class class02032 extends class02023 {
   final float[] Z = new float[class02010.field_58167];

   public class02032() {
      super();
   }

   private static int N(int var0, int var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      int i = (int)((var0 >> 16 & 0xFF) * var4 + (var1 >> 16 & 0xFF) * var5 + (var2 >> 16 & 0xFF) * var6 + (var3 >> 16 & 0xFF) * var7) & 0xFF;
      int j = (int)((var0 & 0xFF) * var4 + (var1 & 0xFF) * var5 + (var2 & 0xFF) * var6 + (var3 & 0xFF) * var7) & 0xFF;
      return i << 16 | j;
   }

   private static int N(int var0, int var1, int var2, int var3) {
      if (var0 == 0) {
         var0 = var3;
      }

      if (var1 == 0) {
         var1 = var3;
      }

      if (var2 == 0) {
         var2 = var3;
      }

      return var0 + var1 + var2 + var3 >> 2 & 16711935;
   }

   public void N(class07295 var1, class00500 var2, class07209 var3, class07211 var4, boolean var5) {
      class07209 class07209 = this.y ? var3.method_10093(var4) : var3;
      class02014 class02014 = class02014.N(var4);
      class07218 class07218 = this.N;
      class07218.N(class07209, class02014.field_4191[0]);
      class00500 class00500xx = var1.method_8320(class07218);
      int i = this.B.N(class00500xx, var1, class07218);
      float f = this.B.y(class00500xx, var1, class07218);
      class07218.N(class07209, class02014.field_4191[1]);
      class00500 class00500x = var1.method_8320(class07218);
      int j = this.B.N(class00500x, var1, class07218);
      float f1 = this.B.y(class00500x, var1, class07218);
      class07218.N(class07209, class02014.field_4191[2]);
      class00500 class00500xx = var1.method_8320(class07218);
      int k = this.B.N(class00500xx, var1, class07218);
      float f2 = this.B.y(class00500xx, var1, class07218);
      class07218.N(class07209, class02014.field_4191[3]);
      class00500 class00500xxx = var1.method_8320(class07218);
      int l = this.B.N(class00500xxx, var1, class07218);
      float f3 = this.B.y(class00500xxx, var1, class07218);
      class00500 class00500xxxx = var1.method_8320(class07218.N(class07209, class02014.field_4191[0]).N(var4));
      boolean flag = !class00500xxxx.U(var1, class07218) || class00500xxxx.z() == 0;
      class00500 class00500xxxxx = var1.method_8320(class07218.N(class07209, class02014.field_4191[1]).N(var4));
      boolean flag1 = !class00500xxxxx.U(var1, class07218) || class00500xxxxx.z() == 0;
      class00500 class00500xxxxxx = var1.method_8320(class07218.N(class07209, class02014.field_4191[2]).N(var4));
      boolean flag2 = !class00500xxxxxx.U(var1, class07218) || class00500xxxxxx.z() == 0;
      class00500 class00500xxxxxxx = var1.method_8320(class07218.N(class07209, class02014.field_4191[3]).N(var4));
      boolean flag3 = !class00500xxxxxxx.U(var1, class07218) || class00500xxxxxxx.z() == 0;
      float f4;
      int i1;
      if (!flag2 && !flag) {
         f4 = f;
         i1 = i;
      } else {
         class07218.N(class07209, class02014.field_4191[0]).N(class02014.field_4191[2]);
         class00500 class00500xxxxxxxx = var1.method_8320(class07218);
         f4 = this.B.y(class00500xxxxxxxx, var1, class07218);
         i1 = this.B.N(class00500xxxxxxxx, var1, class07218);
      }

      float f5;
      int j1;
      if (!flag3 && !flag) {
         f5 = f;
         j1 = i;
      } else {
         class07218.N(class07209, class02014.field_4191[0]).N(class02014.field_4191[3]);
         class00500 class00500xxxxxxxx = var1.method_8320(class07218);
         f5 = this.B.y(class00500xxxxxxxx, var1, class07218);
         j1 = this.B.N(class00500xxxxxxxx, var1, class07218);
      }

      float f6;
      int k1;
      if (!flag2 && !flag1) {
         f6 = f;
         k1 = i;
      } else {
         class07218.N(class07209, class02014.field_4191[1]).N(class02014.field_4191[2]);
         class00500 class00500xxxxxxxx = var1.method_8320(class07218);
         f6 = this.B.y(class00500xxxxxxxx, var1, class07218);
         k1 = this.B.N(class00500xxxxxxxx, var1, class07218);
      }

      float f7;
      int l1;
      if (!flag3 && !flag1) {
         f7 = f;
         l1 = i;
      } else {
         class07218.N(class07209, class02014.field_4191[1]).N(class02014.field_4191[3]);
         class00500 class00500xxxxxxxx = var1.method_8320(class07218);
         f7 = this.B.y(class00500xxxxxxxx, var1, class07218);
         l1 = this.B.N(class00500xxxxxxxx, var1, class07218);
      }

      int i3 = this.B.N(var2, var1, var3);
      class07218.N(var3, var4);
      class00500 class00500xxxxxxxx = var1.method_8320(class07218);
      if (this.y || !class00500xxxxxxxx.t()) {
         i3 = this.B.N(class00500xxxxxxxx, var1, class07218);
      }

      float f8 = this.y ? this.B.y(var1.method_8320(class07209), var1, class07209) : this.B.y(var1.method_8320(var3), var1, var3);
      class02021 class02021 = class02021.N(var4);
      if (this.L && class02014.field_4189) {
         float f29 = (f3 + f + f5 + f8) * 0.25F;
         float f31 = (f2 + f + f4 + f8) * 0.25F;
         float f32 = (f2 + f1 + f6 + f8) * 0.25F;
         float f33 = (f3 + f1 + f7 + f8) * 0.25F;
         float f13 = this.Z[class02014.field_4192[0].field_58168] * this.Z[class02014.field_4192[1].field_58168];
         float f14 = this.Z[class02014.field_4192[2].field_58168] * this.Z[class02014.field_4192[3].field_58168];
         float f15 = this.Z[class02014.field_4192[4].field_58168] * this.Z[class02014.field_4192[5].field_58168];
         float f16 = this.Z[class02014.field_4192[6].field_58168] * this.Z[class02014.field_4192[7].field_58168];
         float f17 = this.Z[class02014.field_4185[0].field_58168] * this.Z[class02014.field_4185[1].field_58168];
         float f18 = this.Z[class02014.field_4185[2].field_58168] * this.Z[class02014.field_4185[3].field_58168];
         float f19 = this.Z[class02014.field_4185[4].field_58168] * this.Z[class02014.field_4185[5].field_58168];
         float f20 = this.Z[class02014.field_4185[6].field_58168] * this.Z[class02014.field_4185[7].field_58168];
         float f21 = this.Z[class02014.field_4180[0].field_58168] * this.Z[class02014.field_4180[1].field_58168];
         float f22 = this.Z[class02014.field_4180[2].field_58168] * this.Z[class02014.field_4180[3].field_58168];
         float f23 = this.Z[class02014.field_4180[4].field_58168] * this.Z[class02014.field_4180[5].field_58168];
         float f24 = this.Z[class02014.field_4180[6].field_58168] * this.Z[class02014.field_4180[7].field_58168];
         float f25 = this.Z[class02014.field_4188[0].field_58168] * this.Z[class02014.field_4188[1].field_58168];
         float f26 = this.Z[class02014.field_4188[2].field_58168] * this.Z[class02014.field_4188[3].field_58168];
         float f27 = this.Z[class02014.field_4188[4].field_58168] * this.Z[class02014.field_4188[5].field_58168];
         float f28 = this.Z[class02014.field_4188[6].field_58168] * this.Z[class02014.field_4188[7].field_58168];
         this.u[class02021.field_4203] = Math.clamp(f29 * f13 + f31 * f14 + f32 * f15 + f33 * f16, 0.0F, 1.0F);
         this.u[class02021.field_4201] = Math.clamp(f29 * f17 + f31 * f18 + f32 * f19 + f33 * f20, 0.0F, 1.0F);
         this.u[class02021.field_4198] = Math.clamp(f29 * f21 + f31 * f22 + f32 * f23 + f33 * f24, 0.0F, 1.0F);
         this.u[class02021.field_4209] = Math.clamp(f29 * f25 + f31 * f26 + f32 * f27 + f33 * f28, 0.0F, 1.0F);
         int i2 = N(l, i, j1, i3);
         int j2 = N(k, i, i1, i3);
         int k2 = N(k, j, k1, i3);
         int l2 = N(l, j, l1, i3);
         this.i[class02021.field_4203] = N(i2, j2, k2, l2, f13, f14, f15, f16);
         this.i[class02021.field_4201] = N(i2, j2, k2, l2, f17, f18, f19, f20);
         this.i[class02021.field_4198] = N(i2, j2, k2, l2, f21, f22, f23, f24);
         this.i[class02021.field_4209] = N(i2, j2, k2, l2, f25, f26, f27, f28);
      } else {
         float f9 = (f3 + f + f5 + f8) * 0.25F;
         float f10 = (f2 + f + f4 + f8) * 0.25F;
         float f11 = (f2 + f1 + f6 + f8) * 0.25F;
         float f12 = (f3 + f1 + f7 + f8) * 0.25F;
         this.i[class02021.field_4203] = N(l, i, j1, i3);
         this.i[class02021.field_4201] = N(k, i, i1, i3);
         this.i[class02021.field_4198] = N(k, j, k1, i3);
         this.i[class02021.field_4209] = N(l, j, l1, i3);
         this.u[class02021.field_4203] = f9;
         this.u[class02021.field_4201] = f10;
         this.u[class02021.field_4198] = f11;
         this.u[class02021.field_4209] = f12;
      }

      float f30 = var1.method_24852(var4, var5);

      for (int j3 = 0; j3 < this.u.length; j3++) {
         this.u[j3] = this.u[j3] * f30;
      }
   }
}
