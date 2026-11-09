package minecraft;

import Nursultan.class10296;
import com.mojang.serialization.Codec;

public class class04042 implements class06069 {
   private static final float L = 5.9604645E-8F;
   private static final double u = 1.110223E-16F;
   public static final Codec<class04042> y = class04053.N.xmap(var0 -> new class04042(var0), var0 -> var0.i);
   private class04053 i;
   private final class04019 R = new class04019(this);

   @Override
   public void L(int var1) {
      for (int ix = 0; ix < var1; ix++) {
         this.i.N();
      }
   }

   @Override
   public class01818 L() {
      return new class10296(this.i.N(), this.i.N());
   }

   @Override
   public int M() {
      return (int)this.i.N();
   }

   public class04042(long var1) {
      super();
      this.i = new class04053(class04043.L(var1));
   }

   public class04042(class04037 var1) {
      super();
      this.i = new class04053(var1);
   }

   public class04042(long var1, long var3) {
      super();
      this.i = new class04053(var1, var3);
   }

   private class04042(class04053 var1) {
      super();
      this.i = var1;
   }

   @Override
   public long B() {
      return this.i.N();
   }

   @Override
   public boolean Z() {
      return (this.i.N() & 1L) != 0L;
   }

   @Override
   public double U() {
      return this.N(53) * 1.110223E-16F;
   }

   @Override
   public float z() {
      return (float)this.N(24) * 5.9604645E-8F;
   }

   @Override
   public class06069 y() {
      return new class04042(this.i.N(), this.i.N());
   }

   @Override
   public int y(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("Bound must be positive");
      } else {
         long ix = Integer.toUnsignedLong(this.M());
         long j = ix * var1;
         long k = j & 4294967295L;
         if (k < var1) {
            for (int l = Integer.remainderUnsigned(~var1 + 1, var1); k < l; k = j & 4294967295L) {
               ix = Integer.toUnsignedLong(this.M());
               j = ix * var1;
            }
         }

         long i1 = j >> 32;
         return (int)i1;
      }
   }

   @Override
   public double E() {
      return this.R.y();
   }

   @Override
   public void N(long var1) {
      this.i = new class04053(class04043.L(var1));
      this.R.N();
   }

   private long N(int var1) {
      return this.i.N() >>> 64 - var1;
   }
}
