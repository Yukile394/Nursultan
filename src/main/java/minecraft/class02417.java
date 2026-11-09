package minecraft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

public class class02417 {
   private final class06202 N;
   private final class03448 y;
   private final Map<class07209, class00044> L = new HashMap<>();

   public class02417(class06202 var1, class03448 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   private void y(class07209 var1) {
      this.N(var1);
      this.N(this.y, var1, false);
   }

   public void y(int var1, class07209 var2, int var3) {
      class06069 class06069 = this.y.field_9229;
      switch (var1) {
         case 1000:
            this.y.method_45446(var2, class04909.Zb, class04911.field_15245, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.y.method_45446(var2, class04909.Zj, class04911.field_15245, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.y.method_45446(var2, class04909.Zv, class04911.field_15245, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.y.method_45446(var2, class04909.Ug, class04911.field_15254, 1.0F, 1.2F, false);
            break;
         case 1009:
            if (var3 == 0) {
               this.y.method_45446(var2, class04909.Uq, class04911.field_15245, 0.5F, 2.6F + (class06069.z() - class06069.z()) * 0.8F, false);
            } else if (var3 == 1) {
               this.y.method_45446(var2, class04909.Ef, class04911.field_15245, 0.7F, 1.6F + (class06069.z() - class06069.z()) * 0.4F, false);
            }
            break;
         case 1010:
            this.y.method_30349().L(class04227.yz).L(var3).ifPresent(var2x -> this.N(var2x, var2));
            break;
         case 1011:
            this.y(var2);
            break;
         case 1015:
            this.y.method_45446(var2, class04909.Wu, class04911.field_15251, 10.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.y.method_45446(var2, class04909.WL, class04911.field_15251, 10.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.y.method_45446(var2, class04909.zX, class04911.field_15251, 10.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.y.method_45446(var2, class04909.LG, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.y.method_45446(var2, class04909.Jq, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.y.method_45446(var2, class04909.JK, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.y.method_45446(var2, class04909.JV, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.y.method_45446(var2, class04909.If, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.y.method_45446(var2, class04909.Ix, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.y.method_45446(var2, class04909.yS, class04911.field_15254, 0.05F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.y.method_45446(var2, class04909.JC, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.y.method_45446(var2, class04909.om, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.y.method_45446(var2, class04909.S, class04911.field_15245, 1.0F, class06069.z() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.y.method_45446(var2, class04909.Ny, class04911.field_15245, 1.0F, class06069.z() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.y.method_45446(var2, class04909.h, class04911.field_15245, 0.3F, this.y.field_9229.z() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.N.Nr().N(class00040.y(class04909.ln, class06069.z() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.y.method_45446(var2, class04909.Ro, class04911.field_15245, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.y.method_45446(var2, class04909.RJ, class04911.field_15245, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.y.method_45446(var2, class04909.uu, class04911.field_15245, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.y.method_45446(var2, class04909.GB, class04911.field_15251, 0.3F, this.y.field_9229.z() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.y.method_45446(var2, class04909.Je, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.y.method_45446(var2, class04909.Pr, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.y.method_45446(var2, class04909.mi, class04911.field_15245, 1.0F, this.y.field_9229.z() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.y.method_45446(var2, class04909.LV, class04911.field_15245, 1.0F, this.y.field_9229.z() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.y.method_45446(var2, class04909.YY, class04911.field_15245, 1.0F, this.y.field_9229.z() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.y.method_45446(var2, class04909.zi, class04911.field_15245, 2.0F, this.y.field_9229.z() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.y.method_45446(var2, class04909.zB, class04911.field_15245, 2.0F, this.y.field_9229.z() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.y.method_45446(var2, class04909.zZ, class04911.field_15245, 2.0F, this.y.field_9229.z() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.y.method_45446(var2, class04909.kz, class04911.field_15251, 2.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.y.method_45446(var2, class04909.BE, class04911.field_15245, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.y.method_45446(var2, class04909.BW, class04911.field_15245, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.y.method_45446(var2, class04909.Ie, class04911.field_15245, 0.5F, 0.4F / (this.y.method_8409().z() * 0.4F + 0.8F), false);
            break;
         case 1500:
            class05836.N(this.y, var2, var3 > 0);
            break;
         case 1501:
            this.y.method_45446(var2, class04909.sC, class04911.field_15245, 0.5F, 2.6F + (class06069.z() - class06069.z()) * 0.8F, false);

            for (int l2 = 0; l2 < 8; l2++) {
               this.y
                  .method_8406(
                     class07107.Ny, var2.method_10263() + class06069.U(), var2.method_10264() + 1.2, var2.method_10260() + class06069.U(), 0.0, 0.0, 0.0
                  );
            }
            break;
         case 1502:
            this.y.method_45446(var2, class04909.dM, class04911.field_15245, 0.5F, 2.6F + (class06069.z() - class06069.z()) * 0.8F, false);

            for (int k2 = 0; k2 < 5; k2++) {
               double d13 = var2.method_10263() + class06069.U() * 0.6 + 0.2;
               double d18 = var2.method_10264() + class06069.U() * 0.6 + 0.2;
               double d23 = var2.method_10260() + class06069.U() * 0.6 + 0.2;
               this.y.method_8406(class07107.NZ, d13, d18, d23, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.y.method_45446(var2, class04909.Uu, class04911.field_15245, 1.0F, 1.0F, false);

            for (int j2 = 0; j2 < 16; j2++) {
               double d12 = var2.method_10263() + (5.0 + class06069.U() * 6.0) / 16.0;
               double d17 = var2.method_10264() + 0.8125;
               double d22 = var2.method_10260() + (5.0 + class06069.U() * 6.0) / 16.0;
               this.y.method_8406(class07107.NZ, d12, d17, d22, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            class06342.N(this.y, var2, this.y.method_8320(var2));
            break;
         case 1505:
            class06944.N(this.y, var2, var3);
            this.y.method_45446(var2, class04909.LK, class04911.field_15245, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.N(var3, var2, class06069, class07107.NZ);
            break;
         case 2001:
            class00500 class00500x = class00891.N(var3);
            if (!class00500x.P()) {
               class07752 class07752 = class00500x.O();
               this.y.method_45446(var2, class07752.L(), class04911.field_15245, (class07752.N() + 1.0F) / 2.0F, class07752.y() * 0.8F, false);
            }

            this.y.method_31595(var2, class00500x);
            break;
         case 2002:
         case 2007:
            class06889 class06889 = class06889.L(var2);

            for (int j = 0; j < 8; j++) {
               this.y
                  .method_8406(
                     new class07092(class07107.S, new class06584(class06570.lO)),
                     class06889.M,
                     class06889.B,
                     class06889.Z,
                     class06069.E() * 0.15,
                     class06069.U() * 0.2,
                     class06069.E() * 0.15
                  );
            }

            float f2 = (var3 >> 16 & 0xFF) / 255.0F;
            float f3 = (var3 >> 8 & 0xFF) / 255.0F;
            float f5 = (var3 >> 0 & 0xFF) / 255.0F;
            class07103<class00436> class07103 = var1 == 2007 ? class07107.C : class07107.T;

            for (int i2 = 0; i2 < 100; i2++) {
               double d11 = class06069.U() * 4.0;
               double d16 = class06069.U() * Math.PI * 2.0;
               double d21 = Math.cos(d16) * d11;
               double d25 = 0.01 + class06069.U() * 0.5;
               double d5 = Math.sin(d16) * d11;
               float f1 = 0.75F + class06069.z() * 0.25F;
               class00436 class00436 = class00436.N(class07103, f2 * f1, f3 * f1, f5 * f1, (float)d11);
               this.y.method_8406(class00436, class06889.M + d21 * 0.1, class06889.B + 0.3, class06889.Z + d5 * 0.1, d21, d25, d5);
            }

            this.y.method_45446(var2, class04909.QB, class04911.field_15254, 1.0F, class06069.z() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double d0 = var2.method_10263() + 0.5;
            double d6 = var2.method_10264();
            double d8 = var2.method_10260() + 0.5;

            for (int i3 = 0; i3 < 8; i3++) {
               this.y
                  .method_8406(
                     new class07092(class07107.S, new class06584(class06570.nG)),
                     d0,
                     d6,
                     d8,
                     class06069.E() * 0.15,
                     class06069.U() * 0.2,
                     class06069.E() * 0.15
                  );
            }

            for (double d10 = 0.0; d10 < Math.PI * 2; d10 += Math.PI / 20) {
               this.y.method_8406(class07107.NM, d0 + Math.cos(d10) * 5.0, d6 - 0.4, d8 + Math.sin(d10) * 5.0, Math.cos(d10) * -5.0, 0.0, Math.sin(d10) * -5.0);
               this.y.method_8406(class07107.NM, d0 + Math.cos(d10) * 5.0, d6 - 0.4, d8 + Math.sin(d10) * 5.0, Math.cos(d10) * -7.0, 0.0, Math.sin(d10) * -7.0);
            }
            break;
         case 2004:
            for (int l = 0; l < 20; l++) {
               double d7 = var2.method_10263() + 0.5 + (class06069.U() - 0.5) * 2.0;
               double d9 = var2.method_10264() + 0.5 + (class06069.U() - 0.5) * 2.0;
               double d14 = var2.method_10260() + 0.5 + (class06069.U() - 0.5) * 2.0;
               this.y.method_8406(class07107.NZ, d7, d9, d14, 0.0, 0.0, 0.0);
               this.y.method_8406(class07107.J, d7, d9, d14, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int l1 = 0; l1 < 200; l1++) {
               float f10 = class06069.z() * 4.0F;
               float f11 = class06069.z() * (float) (Math.PI * 2);
               double d15 = class04995.P(f11) * f10;
               double d20 = 0.01 + class06069.U() * 0.5;
               double d24 = class04995.m(f11) * f10;
               this.y
                  .method_8406(
                     class00473.N(class07107.Z, f10),
                     var2.method_10263() + d15 * 0.1,
                     var2.method_10264() + 0.3,
                     var2.method_10260() + d24 * 0.1,
                     d15,
                     d20,
                     d24
                  );
            }

            if (var3 == 1) {
               this.y.method_45446(var2, class04909.zV, class04911.field_15251, 1.0F, class06069.z() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.y.method_8406(class07107.l, var2.method_10263() + 0.5, var2.method_10264() + 0.5, var2.method_10260() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int k1 = 0; k1 < 8; k1++) {
               this.y
                  .method_8406(
                     class07107.i, var2.method_10263() + class06069.U(), var2.method_10264() + 1.2, var2.method_10260() + class06069.U(), 0.0, 0.0, 0.0
                  );
            }
            break;
         case 2010:
            this.N(var3, var2, class06069, class07107.Nz);
            break;
         case 2011:
            class02615.N(this.y, var2, var3, class07107.F);
            break;
         case 2012:
            class02615.N(this.y, var2, var3, class07107.F);
            break;
         case 2013:
            class02615.N(this.y, var2, var3);
            break;
         case 3000:
            this.y.method_17452(class07107.G, true, var2.method_10263() + 0.5, var2.method_10264() + 0.5, var2.method_10260() + 0.5, 0.0, 0.0, 0.0);
            this.y
               .method_45446(var2, class04909.UL, class04911.field_15245, 10.0F, (1.0F + (this.y.field_9229.z() - this.y.field_9229.z()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.y.method_45446(var2, class04909.zH, class04911.field_15251, 64.0F, 0.8F + this.y.field_9229.z() * 0.3F, false);
            break;
         case 3002:
            if (var3 >= 0 && var3 < class07185.field_23780.length) {
               class02615.N(class07185.field_23780[var3], this.y, var2, 0.125, class07107.ND, class02135.y(10, 19));
            } else {
               class02615.N(this.y, var2, class07107.ND, class02135.y(3, 5));
            }
            break;
         case 3003:
            class02615.N(this.y, var2, class07107.NS, class02135.y(3, 5));
            this.y.method_45446(var2, class04909.Pk, class04911.field_15245, 1.0F, 1.0F, false);
            break;
         case 3004:
            class02615.N(this.y, var2, class07107.Nx, class02135.y(3, 5));
            break;
         case 3005:
            class02615.N(this.y, var2, class07107.Nh, class02135.y(3, 5));
            break;
         case 3006:
            int k = var3 >> 6;
            if (k > 0) {
               if (class06069.z() < 0.3F + k * 0.1F) {
                  float f4 = 0.15F + 0.02F * k * k * class06069.z();
                  float f6 = 0.4F + 0.3F * k * class06069.z();
                  this.y.method_45446(var2, class04909.da, class04911.field_15245, f4, f6, false);
               }

               byte b0 = (byte)(var3 & 63);
               class02135 class02135 = class02135.y(0, k);
               float f7 = 0.005F;
               Supplier supplier = () -> new class06889(
                  class04995.N(class06069, -0.005F, 0.005F), class04995.N(class06069, -0.005F, 0.005F), class04995.N(class06069, -0.005F, 0.005F)
               );
               if (b0 == 0) {
                  for (class07211 class07211 : class07211.values()) {
                     float f = class07211 == class07211.field_11033 ? (float) Math.PI : 0.0F;
                     double d4 = class07211.z() == class07185.field_11052 ? 0.65 : 0.57;
                     class02615.N(this.y, var2, new class01904(f), class02135, class07211, supplier, d4);
                  }
               } else {
                  for (class07211 class07211x : class05543.N(b0)) {
                     float f13 = class07211x == class07211.field_11036 ? (float) Math.PI : 0.0F;
                     double d19 = 0.35;
                     class02615.N(this.y, var2, new class01904(f13), class02135, class07211x, supplier, 0.35);
                  }
               }
            } else {
               this.y.method_45446(var2, class04909.da, class04911.field_15245, 1.0F, 1.0F, false);
               boolean flag1 = this.y.method_8320(var2).W(this.y, var2);
               int j1 = flag1 ? 40 : 20;
               float f8 = flag1 ? 0.45F : 0.25F;
               float f9 = 0.07F;

               for (int j3 = 0; j3 < j1; j3++) {
                  float f12 = 2.0F * class06069.z() - 1.0F;
                  float f14 = 2.0F * class06069.z() - 1.0F;
                  float f15 = 2.0F * class06069.z() - 1.0F;
                  this.y
                     .method_8406(
                        class07107.c,
                        var2.method_10263() + 0.5 + f12 * f8,
                        var2.method_10264() + 0.5 + f14 * f8,
                        var2.method_10260() + 0.5 + f15 * f8,
                        f12 * 0.07F,
                        f14 * 0.07F,
                        f15 * 0.07F
                     );
               }
            }
            break;
         case 3007:
            for (int i1 = 0; i1 < 10; i1++) {
               this.y
                  .method_8406(new class03627(i1 * 5), var2.method_10263() + 0.5, var2.method_10264() + class04007.i, var2.method_10260() + 0.5, 0.0, 0.0, 0.0);
            }

            class00500 class00500xx = this.y.method_8320(var2);
            boolean var9 = class00500xx.y(class06665.q) && class00500xx.L(class06665.q);
            if (!var9) {
               this.y
                  .method_8486(
                     var2.method_10263() + 0.5,
                     var2.method_10264() + class04007.i,
                     var2.method_10260() + 0.5,
                     class04909.wW,
                     class04911.field_15245,
                     2.0F,
                     0.6F + this.y.field_9229.z() * 0.4F,
                     false
                  );
            }
            break;
         case 3008:
            class00500 class00500 = class00891.N(var3);
            if (class00500.i() instanceof class01979 class01979) {
               this.y.method_45446(var2, class01979.u(), class04911.field_15248, 1.0F, 1.0F, false);
            }

            this.y.method_31595(var2, class00500);
            break;
         case 3009:
            class02615.N(this.y, var2, class07107.yN, class02135.y(3, 6));
            break;
         case 3011:
            class04485.N(this.y, var2, class06069, class04500.N(var3).field_50188);
            break;
         case 3012:
            this.y.method_45446(var2, class04909.mx, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            class04485.N(this.y, var2, class06069, class04500.N(var3).field_50188);
            break;
         case 3013:
            this.y.method_45446(var2, class04909.PN, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            class04485.N(this.y, var2, class06069, var3, class07107.yL);
            break;
         case 3014:
            this.y.method_45446(var2, class04909.PM, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            class04485.y(this.y, var2, class06069);
            break;
         case 3015:
            if (this.y.method_8321(var2) instanceof class02261 class02261) {
               class02284.N(this.y, class02261.d(), class02261.w(), class02261.L(), var3 == 0 ? class07107.Nc : class07107.X);
               this.y.method_45446(var2, class04909.OA, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            class02284.N(this.y, var2, var3 == 0 ? class07107.Nc : class07107.X);
            this.y.method_45446(var2, class04909.Ox, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            class04485.y(this.y, var2, class06069);
            break;
         case 3018:
            for (int i = 0; i < 10; i++) {
               double d1 = class06069.E() * 0.02;
               double d2 = class06069.E() * 0.02;
               double var12 = class06069.E() * 0.02;
               this.y
                  .method_8406(
                     class07107.NR,
                     var2.method_10263() + class06069.U(),
                     var2.method_10264() + class06069.U(),
                     var2.method_10260() + class06069.U(),
                     d1,
                     d2,
                     var12
                  );
            }

            this.y.method_45446(var2, class04909.Re, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.y.method_45446(var2, class04909.PN, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            class04485.N(this.y, var2, class06069, var3, class07107.yu);
            break;
         case 3020:
            this.y.method_45446(var2, class04909.Py, class04911.field_15245, var3 == 0 ? 0.3F : 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            class04485.N(this.y, var2, class06069, 0, class07107.yu);
            class04485.N(this.y, var2, class06069);
            break;
         case 3021:
            this.y.method_45446(var2, class04909.mh, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F, true);
            class04485.N(this.y, var2, class06069, class04500.N(var3).field_50188);
      }
   }

   private void N(class07299 var1, class07209 var2, boolean var3) {
      Iterator<class07438> iterator = var1.N(class07438.class, new class00734(var2).M(3.0)).iterator();

      while (iterator.hasNext()) {
         iterator.next().method_6006(var2, var3);
      }
   }

   public void N(int var1, class07209 var2, int var3) {
      switch (var1) {
         case 1023:
         case 1028:
         case 1038:
            class05363 class05363 = ((class03386)this.N.i_5).s();
            if (class05363.Z()) {
               class06889 class06889x = class06889.y(var2).u(class05363.y()).u();
               class06889 class06889x = class05363.y().i(class06889x.L(2.0));
               if (var1 == 1023) {
                  this.y.method_8486(class06889x.M, class06889x.B, class06889x.Z, class04909.Jy, class04911.field_15251, 1.0F, 1.0F, false);
               } else if (var1 == 1038) {
                  this.y.method_8486(class06889x.M, class06889x.B, class06889x.Z, class04909.Ui, class04911.field_15251, 1.0F, 1.0F, false);
               } else {
                  this.y.method_8486(class06889x.M, class06889x.B, class06889x.Z, class04909.zK, class04911.field_15251, 5.0F, 1.0F, false);
               }
            }
      }
   }

   private void N(int var1, class07209 var2, class06069 var3, class07134 var4) {
      class07211 class07211 = class07211.N(var1);
      int i = class07211.P();
      int j = class07211.s();
      int k = class07211.T();

      for (int l = 0; l < 10; l++) {
         double d0 = var3.U() * 0.2 + 0.01;
         double d1 = var2.method_10263() + i * 0.6 + 0.5 + i * 0.01 + (var3.U() - 0.5) * k * 0.5;
         double d2 = var2.method_10264() + j * 0.6 + 0.5 + j * 0.01 + (var3.U() - 0.5) * j * 0.5;
         double d3 = var2.method_10260() + k * 0.6 + 0.5 + k * 0.01 + (var3.U() - 0.5) * i * 0.5;
         double d4 = i * d0 + var3.E() * 0.01;
         double d5 = j * d0 + var3.E() * 0.01;
         double d6 = k * d0 + var3.E() * 0.01;
         this.y.method_8406(var4, d1, d2, d3, d4, d5, d6);
      }
   }

   private void N(class03556<class02206> var1, class07209 var2) {
      this.N(var2);
      class02206 class02206 = (class02206)var1.N();
      class00040 class00040 = class00040.N(class02206.y().N(), class06889.y(var2));
      this.L.put(var2, class00040);
      this.N.Nr().N(class00040);
      ((class01056)this.N.i_6).N(class02206.L());
      this.N(this.y, var2, true);
   }

   private void N(class07209 var1) {
      class00044 class00044 = this.L.remove(var1);
      if (class00044 != null) {
         this.N.Nr().y(class00044);
      }
   }
}
