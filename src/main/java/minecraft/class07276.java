package minecraft;

import java.util.UUID;

public class class07276 implements class00381<class07280> {
   public static final class02362<class04247, class07276> N = class00381.N(class07276::N, class07276::new);
   private final int y;
   private final UUID L;
   private final class07078<?> u;
   private final double i;
   private final double R;
   private final double M;
   private final class06889 B;
   private final byte Z;
   private final byte z;
   private final byte U;
   private final int E;

   public class07078<?> L() {
      return this.u;
   }

   public double M() {
      return this.R;
   }

   private class07276(class04247 var1) {
      super();
      this.y = var1.E();
      this.L = var1.m();
      this.u = class02389.N(class04227.I).decode(var1);
      this.i = var1.readDouble();
      this.R = var1.readDouble();
      this.M = var1.readDouble();
      this.B = var1.U();
      this.Z = var1.readByte();
      this.z = var1.readByte();
      this.U = var1.readByte();
      this.E = var1.E();
   }

   public class07276(class07049 var1, class01599 var2) {
      this(var1, var2, 0);
   }

   public class07276(class07049 var1, class01599 var2, int var3) {
      this(var1.method_5628(), var1.method_5667(), var2.y().N(), var2.y().y(), var2.y().L(), var2.u(), var2.i(), var1.method_5864(), var3, var2.L(), var2.R());
   }

   public class07276(class07049 var1, int var2, class07209 var3) {
      this(
         var1.method_5628(),
         var1.method_5667(),
         var3.method_10263(),
         var3.method_10264(),
         var3.method_10260(),
         var1.method_36455(),
         var1.method_36454(),
         var1.method_5864(),
         var2,
         var1.method_18798(),
         var1.method_5791()
      );
   }

   public class07276(
      int var1, UUID var2, double var3, double var5, double var7, float var9, float var10, class07078<?> var11, int var12, class06889 var13, double var14
   ) {
      super();
      this.y = var1;
      this.L = var2;
      this.i = var3;
      this.R = var5;
      this.M = var7;
      this.B = var13;
      this.Z = class04995.i(var9);
      this.z = class04995.i(var10);
      this.U = class04995.i((float)var14);
      this.u = var11;
      this.E = var12;
   }

   public double B() {
      return this.M;
   }

   public class06889 Z() {
      return this.B;
   }

   public float U() {
      return class04995.N(this.z);
   }

   public float z() {
      return class04995.N(this.Z);
   }

   public double u() {
      return this.i;
   }

   public UUID y() {
      return this.L;
   }

   public float E() {
      return class04995.N(this.U);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class04247 var1) {
      var1.L(this.y);
      var1.N(this.L);
      class02389.N(class04227.I).encode(var1, this.u);
      var1.writeDouble(this.i);
      var1.writeDouble(this.R);
      var1.writeDouble(this.M);
      var1.y(this.B);
      var1.writeByte(this.Z);
      var1.writeByte(this.z);
      var1.writeByte(this.U);
      var1.L(this.E);
   }

   public int N() {
      return this.y;
   }

   public int W() {
      return this.E;
   }

   @Override
   public class02897<class07276> method_65080() {
      return class04248.L;
   }
}
