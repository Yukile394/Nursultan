package minecraft;

public class class08062 implements class00381<class07280> {
   public static final class02362<class04247, class08062> N = class00381.N(class08062::N, class08062::new);
   private final class03556<class04891> y;
   private final class04911 L;
   private final int u;
   private final float i;
   private final float R;
   private final long M;

   public int L() {
      return this.u;
   }

   public float M() {
      return this.R;
   }

   public class08062(class03556<class04891> var1, class04911 var2, class07049 var3, float var4, float var5, long var6) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3.method_5628();
      this.i = var4;
      this.R = var5;
      this.M = var6;
   }

   private class08062(class04247 var1) {
      super();
      this.y = class04891.u.decode(var1);
      this.L = var1.y(class04911.class);
      this.u = var1.E();
      this.i = var1.readFloat();
      this.R = var1.readFloat();
      this.M = var1.readLong();
   }

   public long B() {
      return this.M;
   }

   public float u() {
      return this.i;
   }

   public class04911 y() {
      return this.L;
   }

   public class03556<class04891> N() {
      return this.y;
   }

   private void N(class04247 var1) {
      class04891.u.encode(var1, this.y);
      var1.N(this.L);
      var1.L(this.u);
      var1.writeFloat(this.i);
      var1.writeFloat(this.R);
      var1.writeLong(this.M);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class08062> method_65080() {
      return class04248.yN;
   }
}
