package minecraft;

public class class00495 implements class00381<class07280> {
   public static final class02362<class04247, class00495> N = class00381.N(class00495::N, class00495::new);
   private final double y;
   private final double L;
   private final double u;
   private final float i;
   private final float R;
   private final float M;
   private final float B;
   private final int Z;
   private final boolean z;
   private final boolean U;
   private final class07126 E;

   public double L() {
      return this.y;
   }

   public double M() {
      return this.u;
   }

   public <T extends class07126> class00495(
      T var1, boolean var2, boolean var3, double var4, double var6, double var8, float var10, float var11, float var12, float var13, int var14
   ) {
      super();
      this.E = var1;
      this.z = var2;
      this.U = var3;
      this.y = var4;
      this.L = var6;
      this.u = var8;
      this.i = var10;
      this.R = var11;
      this.M = var12;
      this.B = var13;
      this.Z = var14;
   }

   private class00495(class04247 var1) {
      super();
      this.z = var1.readBoolean();
      this.U = var1.readBoolean();
      this.y = var1.readDouble();
      this.L = var1.readDouble();
      this.u = var1.readDouble();
      this.i = var1.readFloat();
      this.R = var1.readFloat();
      this.M = var1.readFloat();
      this.B = var1.readFloat();
      this.Z = var1.readInt();
      this.E = class07107.yW.decode(var1);
   }

   public float B() {
      return this.i;
   }

   public float Z() {
      return this.R;
   }

   public float U() {
      return this.B;
   }

   public float z() {
      return this.M;
   }

   public double u() {
      return this.L;
   }

   public boolean y() {
      return this.U;
   }

   public int E() {
      return this.Z;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class04247 var1) {
      var1.writeBoolean(this.z);
      var1.writeBoolean(this.U);
      var1.writeDouble(this.y);
      var1.writeDouble(this.L);
      var1.writeDouble(this.u);
      var1.writeFloat(this.i);
      var1.writeFloat(this.R);
      var1.writeFloat(this.M);
      var1.writeFloat(this.B);
      var1.writeInt(this.Z);
      class07107.yW.encode(var1, this.E);
   }

   public boolean N() {
      return this.z;
   }

   public class07126 W() {
      return this.E;
   }

   @Override
   public class02897<class00495> method_65080() {
      return class04248.F;
   }
}
