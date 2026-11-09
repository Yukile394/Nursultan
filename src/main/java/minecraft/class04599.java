package minecraft;

import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.EnumSet;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

class class04599 extends class04596 {
   private static final int L = 400;
   private static final double u = 0.1;
   private static final int i = 25;
   private static final float R = 0.35F;
   private static final float M = 0.6F;
   private static final float B = 0.33333334F;
   private static final int Z = 5;
   private int z;
   private int U;
   private boolean E;
   @Nullable
   private class06889 W;
   private int m;
   private static final int P = 600;
   private Long2LongOpenHashMap s;

   @Override
   public void L() {
      this.z = 0;
      this.m = 0;
      this.U = 0;
      this.E = true;
      this.y.w();
   }

   @Override
   public boolean M() {
      if (this.y.A > 0) {
         return false;
      } else if (this.y.NI()) {
         return false;
      } else if (this.y.method_73183().method_8419()) {
         return false;
      } else {
         Optional<class07209> optional = this.s();
         if (optional.isPresent()) {
            this.y.f = optional.get();
            class04626.j(this.y).N(this.y.f.method_10263() + 0.5, this.y.f.method_10264() + 0.5, this.y.f.method_10260() + 0.5, 1.2F);
            return true;
         } else {
            this.y.A = class04995.N(class04626.v(this.y), 20, 60);
            return false;
         }
      }
   }

   private float P() {
      return (class04626.w(this.y).z() * 2.0F - 1.0F) * 0.33333334F;
   }

   class04599(class04626 var1) {
      super(var1);
      this.y = var1;
      this.s = new Long2LongOpenHashMap();
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public boolean Z() {
      if (!this.E) {
         return false;
      } else if (!this.y.v()) {
         return false;
      } else if (this.y.method_73183().method_8419()) {
         return false;
      } else {
         return this.W() ? class04626.n(this.y).z() < 0.2F : true;
      }
   }

   @Override
   public void i() {
      if (this.y.v()) {
         this.m++;
         if (this.m > 600) {
            this.y.l();
            this.E = false;
            this.y.A = 200;
         } else {
            class06889 class06889 = class06889.L(this.y.f).y(0.0, 0.6F, 0.0);
            if (class06889.R(this.y.method_73189()) > 1.0) {
               this.W = class06889;
               this.m();
            } else {
               if (this.W == null) {
                  this.W = class06889;
               }

               boolean flag = this.y.method_73189().R(this.W) <= 0.1;
               boolean flag1 = true;
               if (!flag && this.m > 600) {
                  this.y.l();
               } else {
                  if (flag) {
                     if (class04626.G(this.y).y(25) == 0) {
                        this.W = new class06889(class06889.N() + this.P(), class06889.y(), class06889.L() + this.P());
                        class04626.l(this.y).W();
                     } else {
                        flag1 = false;
                     }

                     this.y.p().N(class06889.N(), class06889.y(), class06889.L());
                  }

                  if (flag1) {
                     this.m();
                  }

                  this.z++;
                  if (class04626.d(this.y).z() < 0.05F && this.z > this.U + 60) {
                     this.U = this.z;
                     this.y.method_5783(class04909.LR, 1.0F, 1.0F);
                  }
               }
            }
         }
      }
   }

   private Optional<class07209> s() {
      Iterable<class07209> iterable = class07209.method_25996(this.y.method_24515(), 5, 5, 5);
      Long2LongOpenHashMap long2longopenhashmap = new Long2LongOpenHashMap();

      for (class07209 class07209 : iterable) {
         long ix = this.s.getOrDefault(class07209.method_10063(), Long.MIN_VALUE);
         if (this.y.method_73183().N() < ix) {
            long2longopenhashmap.put(class07209.method_10063(), ix);
         } else if (class04626.N(this.y.method_73183().method_8320(class07209))) {
            class00143 class00143 = class04626.k(this.y).N(class07209, 1);
            if (class00143 != null && class00143.z()) {
               return Optional.of(class07209);
            }

            long2longopenhashmap.put(class07209.method_10063(), this.y.method_73183().N() + 600L);
         }
      }

      this.s = long2longopenhashmap;
      return Optional.empty();
   }

   private void m() {
      this.y.F().N(this.W.N(), this.W.y(), this.W.L(), 0.35F);
   }

   boolean U() {
      return this.E;
   }

   @Override
   public void u() {
      if (this.W()) {
         this.y.N(true);
      }

      this.E = false;
      class04626.t(this.y).W();
      this.y.A = 200;
   }

   void E() {
      this.E = false;
   }

   private boolean W() {
      return this.z > 400;
   }
}
