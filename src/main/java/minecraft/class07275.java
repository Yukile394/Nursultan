package minecraft;

public class class07275 implements class00381<class07280> {
   public static final class02362<class04247, class07275> N = class00381.N(class07275::N, class07275::new);
   private final class07209 y;
   private final int L;
   private final int u;
   private final class00891 i;

   public int L() {
      return this.u;
   }

   public class07275(class07209 var1, class00891 var2, int var3, int var4) {
      super();
      this.y = var1;
      this.i = var2;
      this.L = var3;
      this.u = var4;
   }

   private class07275(class04247 var1) {
      super();
      this.y = var1.i();
      this.L = var1.readUnsignedByte();
      this.u = var1.readUnsignedByte();
      this.i = class02389.N(class04227.Z).decode(var1);
   }

   public class00891 u() {
      return this.i;
   }

   public int y() {
      return this.L;
   }

   private void N(class04247 var1) {
      var1.N(this.y);
      var1.writeByte(this.L);
      var1.writeByte(this.u);
      class02389.N(class04227.Z).encode(var1, this.i);
   }

   public class07209 N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class07275> method_65080() {
      return class04248.Z;
   }
}
