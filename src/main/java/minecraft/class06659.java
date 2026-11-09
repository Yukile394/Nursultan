package minecraft;

public class class06659 implements class00381<class07280> {
   public static final class02362<class00667, class06659> N = class00381.N(class06659::N, class06659::new);
   private static final int y = 1;
   private static final int L = 2;
   private static final int u = 4;
   private static final int i = 8;
   private final boolean R;
   private final boolean M;
   private final boolean B;
   private final boolean Z;
   private final float z;
   private final float U;

   public boolean L() {
      return this.B;
   }

   public float M() {
      return this.z;
   }

   public class06659(class08033 var1) {
      super();
      this.R = var1.N;
      this.M = var1.y;
      this.B = var1.L;
      this.Z = var1.u;
      this.z = var1.N();
      this.U = var1.y();
   }

   private class06659(class00667 var1) {
      super();
      byte b0 = var1.readByte();
      this.R = (b0 & 1) != 0;
      this.M = (b0 & 2) != 0;
      this.B = (b0 & 4) != 0;
      this.Z = (b0 & 8) != 0;
      this.z = var1.readFloat();
      this.U = var1.readFloat();
   }

   public float B() {
      return this.U;
   }

   public boolean u() {
      return this.Z;
   }

   public boolean y() {
      return this.M;
   }

   public boolean N() {
      return this.R;
   }

   private void N(class00667 var1) {
      byte b0 = 0;
      if (this.R) {
         b0 = (byte)(b0 | 1);
      }

      if (this.M) {
         b0 = (byte)(b0 | 2);
      }

      if (this.B) {
         b0 = (byte)(b0 | 4);
      }

      if (this.Z) {
         b0 = (byte)(b0 | 8);
      }

      var1.writeByte(b0);
      var1.writeFloat(this.z);
      var1.writeFloat(this.U);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class06659> method_65080() {
      return class04248.NR;
   }
}
