package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Iterator;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04303 extends class06148 {
   private static final double[][] N = new double[][]{
      {0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}
   };
   private static final double[][] y = new double[][]{
      {0.0, 1.0},
      {0.3455, 0.309},
      {0.9511, 0.309},
      {0.3795918367346939, -0.12653061224489795},
      {0.6122448979591837, -0.8040816326530612},
      {0.0, -0.35918367346938773}
   };
   private int L;
   private final class04410 u;
   private final List<class02827> i;
   private boolean R;
   private final class01894 M = class01894.N("minecraft", "firework");

   public class04303(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class04410 var14, List<class02827> var15) {
      super(var1, var2, var4, var6);
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
      this.u = var14;
      if (var15.isEmpty()) {
         throw new IllegalArgumentException("Cannot create firework starter with no explosions");
      } else {
         this.i = var15;
         this.field_3847 = var15.size() * 2 - 1;
         Iterator iterator = var15.iterator();

         while (iterator.hasNext()) {
            if (((class02827)iterator.next()).i()) {
               this.R = true;
               this.field_3847 += 15;
               break;
            }
         }
      }
   }

   private void N(double var1, double[][] var3, IntList var4, IntList var5, boolean var6, boolean var7, boolean var8) {
      double d0 = var3[0][0];
      double d1 = var3[0][1];
      this.N(this.field_3874, this.field_3854, this.field_3871, d0 * var1, d1 * var1, 0.0, var4, var5, var6, var7);
      float f = this.field_3840.z() * (float) Math.PI;
      double d2 = var8 ? 0.034 : 0.34;

      for (int ix = 0; ix < 3; ix++) {
         double d3 = f + ix * (float) Math.PI * d2;
         double d4 = d0;
         double d5 = d1;

         for (int j = 1; j < var3.length; j++) {
            double d6 = var3[j][0];
            double d7 = var3[j][1];

            for (double d8 = 0.25; d8 <= 1.0; d8 += 0.25) {
               double d9 = class04995.u(d8, d4, d6) * var1;
               double d10 = class04995.u(d8, d5, d7) * var1;
               double d11 = d9 * Math.sin(d3);
               d9 *= Math.cos(d3);

               for (double d12 = -1.0; d12 <= 1.0; d12 += 2.0) {
                  this.N(this.field_3874, this.field_3854, this.field_3871, d9 * d12, d10, d11 * d12, var4, var5, var6, var7);
               }
            }

            d4 = d6;
            d5 = d7;
         }
      }
   }

   private void N(IntList var1, IntList var2, boolean var3, boolean var4) {
      double d0 = this.field_3840.E() * 0.05;
      double d1 = this.field_3840.E() * 0.05;

      for (int ix = 0; ix < 70; ix++) {
         double d2 = this.field_3852 * 0.5 + this.field_3840.E() * 0.15 + d0;
         double d3 = this.field_3850 * 0.5 + this.field_3840.E() * 0.15 + d1;
         double d4 = this.field_3869 * 0.5 + this.field_3840.U() * 0.5;
         this.N(this.field_3874, this.field_3854, this.field_3871, d2, d4, d3, var1, var2, var3, var4);
      }
   }

   public void N(
      double var1,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      IntList var13,
      IntList var14,
      boolean var15,
      boolean var16,
      CallbackInfo var17
   ) {
      if (!SodiumExtraClientMod.options().particleSettings.otherMap.computeIfAbsent(this.M, var0 -> true)
         || !SodiumExtraClientMod.options().particleSettings.particles) {
         var17.cancel();
      }
   }

   private boolean N() {
      return ((class03386)class06202.Nq().i_5).s().y().L(this.field_3874, this.field_3854, this.field_3871) >= 256.0;
   }

   private void N(double var1, double var3, double var5, double var7, double var9, double var11, IntList var13, IntList var14, boolean var15, boolean var16) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var3, var5, var7, var9, var11, var13, var14, var15, var16, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class04302 class04302 = (class04302)this.u.N(class07107.g, var1, var3, var5, var7, var9, var11);
         class04302.N(var15);
         class04302.y(var16);
         class04302.method_74308(0.99F);
         class04302.N(class07536.<Integer>N_77(var13, this.field_3840));
         if (!var14.isEmpty()) {
            class04302.y(class07536.<Integer>N_77(var14, this.field_3840));
         }
      }
   }

   private void N(double var1, int var3, IntList var4, IntList var5, boolean var6, boolean var7) {
      double d0 = this.field_3874;
      double d1 = this.field_3854;
      double d2 = this.field_3871;

      for (int ix = -var3; ix <= var3; ix++) {
         for (int j = -var3; j <= var3; j++) {
            for (int k = -var3; k <= var3; k++) {
               double d3 = j + (this.field_3840.U() - this.field_3840.U()) * 0.5;
               double d4 = ix + (this.field_3840.U() - this.field_3840.U()) * 0.5;
               double d5 = k + (this.field_3840.U() - this.field_3840.U()) * 0.5;
               double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5) / var1 + this.field_3840.E() * 0.05;
               this.N(d0, d1, d2, d3 / d6, d4 / d6, d5 / d6, var4, var5, var6, var7);
               if (ix != -var3 && ix != var3 && j != -var3 && j != var3) {
                  k += var3 * 2 - 1;
               }
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_3070() {
      if (this.L == 0) {
         boolean flag = this.N();
         boolean flag1 = false;
         if (this.i.size() >= 3) {
            flag1 = true;
         } else {
            for (class02827 class02827x : this.i) {
               if (class02827x.N() == class02835.field_7977) {
                  flag1 = true;
                  break;
               }
            }
         }

         class04891 class04891;
         if (flag1) {
            class04891 = flag ? class04909.UQ : class04909.UY;
         } else {
            class04891 = flag ? class04909.Uk : class04909.Uw;
         }

         this.field_3851
            .method_8486(this.field_3874, this.field_3854, this.field_3871, class04891, class04911.field_15256, 20.0F, 0.95F + this.field_3840.z() * 0.1F, true);
      }

      if (this.L % 2 == 0 && this.L / 2 < this.i.size()) {
         int j = this.L / 2;
         class02827 class02827x = this.i.get(j);
         boolean flag3 = class02827x.u();
         boolean flag4 = class02827x.i();
         IntList intlist = class02827x.y();
         IntList intlist1 = class02827x.L();
         if (intlist.isEmpty()) {
            intlist = IntList.of(class06563.field_7963.i());
         }

         switch (class02827x.N()) {
            case field_7976:
               this.N(0.25, 2, intlist, intlist1, flag3, flag4);
               break;
            case field_7977:
               this.N(0.5, 4, intlist, intlist1, flag3, flag4);
               break;
            case field_7973:
               this.N(0.5, y, intlist, intlist1, flag3, flag4, false);
               break;
            case field_7974:
               this.N(0.5, N, intlist, intlist1, flag3, flag4, true);
               break;
            case field_7970:
               this.N(intlist, intlist1, flag3, flag4);
         }

         int ix = intlist.getInt(0);
         this.u.N(class02329.N(class07107.p, ix), this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0);
      }

      this.L++;
      if (this.L > this.field_3847) {
         if (this.R) {
            boolean flag2 = this.N();
            class04891 class04891x = flag2 ? class04909.UJ : class04909.UI;
            this.field_3851
               .method_8486(
                  this.field_3874, this.field_3854, this.field_3871, class04891x, class04911.field_15256, 20.0F, 0.9F + this.field_3840.z() * 0.15F, true
               );
         }

         this.method_3085();
      }
   }
}
