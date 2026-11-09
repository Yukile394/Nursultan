package minecraft;

public class class08087 implements class00381<class07280> {
   public static final class02362<class04247, class08087> N = class00381.N(class08087::N, class08087::new);
   private static final int y = 1;
   private static final int L = 2;
   private static final int u = 4;
   private static final int i = 8;
   private final int R;
   private final class03556<class07084> M;
   private final int B;
   private final int Z;
   private final byte z;

   public int L() {
      return this.B;
   }

   public boolean M() {
      return (this.z & 2) != 0;
   }

   public class08087(int var1, class07055 var2, boolean var3) {
      super();
      this.R = var1;
      this.M = var2.L();
      this.B = var2.i();
      this.Z = var2.u();
      byte b0 = 0;
      if (var2.R()) {
         b0 = (byte)(b0 | 1);
      }

      if (var2.M()) {
         b0 = (byte)(b0 | 2);
      }

      if (var2.B()) {
         b0 = (byte)(b0 | 4);
      }

      if (var3) {
         b0 = (byte)(b0 | 8);
      }

      this.z = b0;
   }

   private class08087(class04247 var1) {
      super();
      this.R = var1.E();
      this.M = class07084.y.decode(var1);
      this.B = var1.E();
      this.Z = var1.E();
      this.z = var1.readByte();
   }

   public boolean B() {
      return (this.z & 1) != 0;
   }

   public boolean Z() {
      return (this.z & 4) != 0;
   }

   public boolean z() {
      return (this.z & 8) != 0;
   }

   public int u() {
      return this.Z;
   }

   public class03556<class07084> y() {
      return this.M;
   }

   public int N() {
      return this.R;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class04247 var1) {
      var1.L(this.R);
      class07084.y.encode(var1, this.M);
      var1.L(this.B);
      var1.L(this.Z);
      var1.writeByte(this.z);
   }

   @Override
   public class02897<class08087> method_65080() {
      return class04248.yW;
   }
}
