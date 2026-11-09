package minecraft;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class04623 extends class04596 {
   public static final int y = 2400;
   int L;
   private static final int R = 3;
   final List<class07209> u;
   @Nullable
   private class00143 M;
   private static final int B = 60;
   private int Z;

   private void L(class07209 var1) {
      this.u.add(var1);

      while (this.u.size() > 3) {
         this.u.remove(0);
      }
   }

   @Override
   public void L() {
      this.L = 0;
      this.Z = 0;
      super.L();
   }

   @Override
   public boolean M() {
      return this.i.C != null
         && !this.i.i(this.i.C)
         && !this.i.Nj()
         && this.i.d()
         && !this.u(this.i.C)
         && this.i.method_73183().method_8320(this.i.C).N(class01210.NC);
   }

   class04623(class04626 var1) {
      super(var1);
      this.i = var1;
      this.u = Lists.newArrayList();
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean Z() {
      return this.M();
   }

   @Override
   public void i() {
      if (this.i.C != null) {
         this.L++;
         if (this.L > this.N(2400)) {
            this.E();
         } else if (!class04626.B(this.i).E()) {
            if (!this.i.y(this.i.C, 16)) {
               if (this.i.i(this.i.C)) {
                  this.i.G();
               } else {
                  this.i.N(this.i.C);
               }
            } else {
               if (!this.y(this.i.C)) {
                  this.E();
               } else if (this.M != null && class04626.Z(this.i).Z().N(this.M)) {
                  this.Z++;
                  if (this.Z > 60) {
                     this.i.G();
                     this.Z = 0;
                  }
               } else {
                  this.M = class04626.z(this.i).Z();
               }
            }
         }
      }
   }

   void U() {
      this.u.clear();
   }

   @Override
   public void u() {
      this.L = 0;
      this.Z = 0;
      class04626.R(this.i).W();
      class04626.M(this.i).R();
   }

   private boolean u(class07209 var1) {
      if (this.i.y(var1, 2)) {
         return true;
      } else {
         class00143 class00143 = class04626.P(this.i).Z();
         return class00143 != null && class00143.E().equals(var1) && class00143.z() && class00143.L();
      }
   }

   private boolean y(class07209 var1) {
      int ix = this.i.y(var1, 3) ? 1 : 2;
      class04626.U(this.i).y(10.0F);
      class04626.E(this.i).N(var1.method_10263(), var1.method_10264(), var1.method_10260(), ix, 1.0);
      return class04626.W(this.i).Z() != null && class04626.m(this.i).Z().z();
   }

   private void E() {
      if (this.i.C != null) {
         this.L(this.i.C);
      }

      this.i.G();
   }

   boolean N(class07209 var1) {
      return this.u.contains(var1);
   }
}
