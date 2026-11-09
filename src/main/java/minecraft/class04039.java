package minecraft;

import Nursultan.class10291;
import Nursultan.class10292;
import Nursultan.class10295;
import Nursultan.class10302;
import com.google.common.base.Suppliers;
import java.util.function.Function;
import java.util.function.Supplier;

public final class class04039 {
   private static final int v = 8;
   private static final int n = 4;
   private static final int t = 16;
   private static final int G = 15;
   final class03019 N;
   final class04018 y = new class10292(this);
   final class04018 L = new class10295(this);
   final class04018 u = new class10291(this);
   final class04018 i = new class10302(this);
   final class04084 R;
   public final class08050 M;
   private final class01837 l;
   private final Function<class07209, class03556<class00780>> d;
   public final class06057 B;
   private long w = Long.MAX_VALUE;
   private final int[] k = new int[4];
   public long Z = -9223372036854775807L;
   public int z;
   public int U;
   public int E;
   private long Y = this.Z - 1L;
   private double Q;
   private long O = this.Z - 1L;
   private int g;
   public long W = -9223372036854775807L;
   public final class07218 m = new class07218();
   public Supplier<class03556<class00780>> P;
   public int s;
   public int T;
   public int b;
   public int j;

   public int L() {
      if (this.O != this.Z) {
         this.O = this.Z;
         int ix = N(this.z);
         int jx = N(this.U);
         long kx = class07321.u(ix, jx);
         if (this.w != kx) {
            this.w = kx;
            this.k[0] = this.l.N(y(ix), y(jx));
            this.k[1] = this.l.N(y(ix + 1), y(jx));
            this.k[2] = this.l.N(y(ix), y(jx + 1));
            this.k[3] = this.l.N(y(ix + 1), y(jx + 1));
         }

         int lx = class04995.N(class04995.N((this.z & 15) / 16.0F, (this.U & 15) / 16.0F, this.k[0], this.k[1], this.k[2], this.k[3]));
         this.g = lx + this.E - 8;
      }

      return this.g;
   }

   protected class04039(
      class03019 var1,
      class04084 var2,
      class08050 var3,
      class01837 var4,
      Function<class07209, class03556<class00780>> var5,
      class00751<class00780> var6,
      class06057 var7
   ) {
      super();
      this.N = var1;
      this.R = var2;
      this.M = var3;
      this.l = var4;
      this.d = var5;
      this.B = var7;
   }

   public int y() {
      return this.N.N();
   }

   private static int y(int var0) {
      return var0 << 4;
   }

   protected void N(int var1, int var2) {
      this.Z++;
      this.W++;
      this.z = var1;
      this.U = var2;
      this.E = this.N.N(var1, var2);
   }

   protected void N(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.W++;
      this.P = Suppliers.memoize(() -> this.d.apply(this.m.N(var4, var5, var6)));
      this.s = var5;
      this.T = var3;
      this.b = var2;
      this.j = var1;
   }

   private static int N(int var0) {
      return var0 >> 4;
   }

   public double N() {
      if (this.Y != this.Z) {
         this.Y = this.Z;
         this.Q = this.N.y(this.z, this.U);
      }

      return this.Q;
   }
}
