package minecraft;

public class class08073 implements class00381<class07280> {
   public static final class02362<class04247, class08073> N = class00381.N(class08073::N, class08073::new);
   public static final float y = 8.0F;
   private final class03556<class04891> L;
   private final class04911 u;
   private final int i;
   private final int R;
   private final int M;
   private final float B;
   private final float Z;
   private final long z;

   public double L() {
      return this.i / 8.0F;
   }

   public double M() {
      return this.M / 8.0F;
   }

   public class08073(class03556<class04891> var1, class04911 var2, double var3, double var5, double var7, float var9, float var10, long var11) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = (int)(var3 * 8.0);
      this.R = (int)(var5 * 8.0);
      this.M = (int)(var7 * 8.0);
      this.B = var9;
      this.Z = var10;
      this.z = var11;
   }

   private class08073(class04247 var1) {
      super();
      this.L = class04891.u.decode(var1);
      this.u = var1.y(class04911.class);
      this.i = var1.readInt();
      this.R = var1.readInt();
      this.M = var1.readInt();
      this.B = var1.readFloat();
      this.Z = var1.readFloat();
      this.z = var1.readLong();
   }

   public float B() {
      return this.B;
   }

   public float Z() {
      return this.Z;
   }

   public long z() {
      return this.z;
   }

   public double u() {
      return this.R / 8.0F;
   }

   public class04911 y() {
      return this.u;
   }

   public class03556<class04891> N() {
      return this.L;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class04247 var1) {
      class04891.u.encode(var1, this.L);
      var1.N(this.u);
      var1.writeInt(this.i);
      var1.writeInt(this.R);
      var1.writeInt(this.M);
      var1.writeFloat(this.B);
      var1.writeFloat(this.Z);
      var1.writeLong(this.z);
   }

   @Override
   public class02897<class08073> method_65080() {
      return class04248.yy;
   }
}
