package minecraft;

public class class00503 implements class00381<class07280> {
   public static final class02362<class00667, class00503> N = class00381.N(class00503::N, class00503::new);
   public static final class00521 y = new class00521(0);
   public static final class00521 L = new class00521(1);
   public static final class00521 u = new class00521(2);
   public static final class00521 i = new class00521(3);
   public static final class00521 R = new class00521(4);
   public static final class00521 M = new class00521(5);
   public static final class00521 B = new class00521(6);
   public static final class00521 Z = new class00521(7);
   public static final class00521 z = new class00521(8);
   public static final class00521 U = new class00521(9);
   public static final class00521 E = new class00521(10);
   public static final class00521 W = new class00521(11);
   public static final class00521 m = new class00521(12);
   public static final class00521 P = new class00521(13);
   public static final int s = 0;
   public static final int T = 101;
   public static final int b = 102;
   public static final int j = 103;
   public static final int v = 104;
   private final class00521 n;
   private final float t;

   public class00503(class00521 var1, float var2) {
      super();
      this.n = var1;
      this.t = var2;
   }

   private class00503(class00667 var1) {
      super();
      this.n = (class00521)class00521.N.get(var1.readUnsignedByte());
      this.t = var1.readFloat();
   }

   public float y() {
      return this.t;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class00521 N() {
      return this.n;
   }

   private void N(class00667 var1) {
      var1.writeByte(this.n.y);
      var1.writeFloat(this.t);
   }

   @Override
   public class02897<class00503> method_65080() {
      return class04248.V;
   }
}
