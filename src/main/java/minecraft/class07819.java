package minecraft;

public class class07819 implements class00381<class08051> {
   public static final class02362<class00667, class07819> N = class00381.N(class07819::N, class07819::new);
   private static final int y = 1;
   private static final int L = 2;
   private static final int u = 4;
   private static final int i = 8;
   private final class07209 R;
   private final class07271 M;
   private final class08070 B;
   private final String Z;
   private final class07209 z;
   private final class00753 U;
   private final class07111 E;
   private final class06993 W;
   private final String m;
   private final boolean P;
   private final boolean s;
   private final boolean T;
   private final boolean b;
   private final float j;
   private final long v;

   public class08070 L() {
      return this.B;
   }

   public class07209 M() {
      return this.z;
   }

   public boolean P() {
      return this.b;
   }

   public long T() {
      return this.v;
   }

   public class07819(
      class07209 var1,
      class07271 var2,
      class08070 var3,
      String var4,
      class07209 var5,
      class00753 var6,
      class07111 var7,
      class06993 var8,
      String var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      float var14,
      long var15
   ) {
      super();
      this.R = var1;
      this.M = var2;
      this.B = var3;
      this.Z = var4;
      this.z = var5;
      this.U = var6;
      this.E = var7;
      this.W = var8;
      this.m = var9;
      this.P = var10;
      this.s = var11;
      this.T = var12;
      this.b = var13;
      this.j = var14;
      this.v = var15;
   }

   private class07819(class00667 var1) {
      super();
      this.R = var1.i();
      this.M = var1.y(class07271.class);
      this.B = var1.y(class08070.class);
      this.Z = var1.s();
      byte b0 = 48;
      this.z = new class07209(class04995.N(var1.readByte(), -48, 48), class04995.N(var1.readByte(), -48, 48), class04995.N(var1.readByte(), -48, 48));
      byte b1 = 48;
      this.U = new class00753(class04995.N(var1.readByte(), 0, 48), class04995.N(var1.readByte(), 0, 48), class04995.N(var1.readByte(), 0, 48));
      this.E = var1.y(class07111.class);
      this.W = var1.y(class06993.class);
      this.m = var1.u(128);
      this.j = class04995.N(var1.readFloat(), 0.0F, 1.0F);
      this.v = var1.W();
      byte b2 = var1.readByte();
      this.P = (b2 & 1) != 0;
      this.s = (b2 & 8) != 0;
      this.T = (b2 & 2) != 0;
      this.b = (b2 & 4) != 0;
   }

   public class00753 B() {
      return this.U;
   }

   public class07111 Z() {
      return this.E;
   }

   public float s() {
      return this.j;
   }

   public boolean m() {
      return this.T;
   }

   public String U() {
      return this.m;
   }

   public class06993 z() {
      return this.W;
   }

   public String u() {
      return this.Z;
   }

   public class07271 y() {
      return this.M;
   }

   public boolean E() {
      return this.P;
   }

   private void N(class00667 var1) {
      var1.N(this.R);
      var1.N((Enum<?>)this.M);
      var1.N((Enum<?>)this.B);
      var1.N(this.Z);
      var1.writeByte(this.z.method_10263());
      var1.writeByte(this.z.method_10264());
      var1.writeByte(this.z.method_10260());
      var1.writeByte(this.U.method_10263());
      var1.writeByte(this.U.method_10264());
      var1.writeByte(this.U.method_10260());
      var1.N((Enum<?>)this.E);
      var1.N((Enum<?>)this.W);
      var1.N(this.m);
      var1.writeFloat(this.j);
      var1.N(this.v);
      byte b0 = 0;
      if (this.P) {
         b0 |= 1;
      }

      if (this.T) {
         b0 |= 2;
      }

      if (this.b) {
         b0 |= 4;
      }

      if (this.s) {
         b0 |= 8;
      }

      var1.writeByte(b0);
   }

   public class07209 N() {
      return this.R;
   }

   public void method_65081(class08051 var1) {
      var1.method_12051(this);
   }

   public boolean W() {
      return this.s;
   }

   @Override
   public class02897<class07819> method_65080() {
      return class04248.LP;
   }
}
