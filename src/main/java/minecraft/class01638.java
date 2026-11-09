package minecraft;

public record class01638(class01894 id) implements class01659 {
   public class01638(class01894 id) {
      this.id = id;
   }

   public static <T extends class00667> class02362<T, class01638> N(class01894 var0, int var1) {
      return class01659.N((var0x, var1x) -> {}, var2 -> {
         int i = var2.readableBytes();
         if (i >= 0 && i <= var1) {
            var2.skipBytes(i);
            return new class01638(var0);
         } else {
            throw new IllegalArgumentException("Payload may not be larger than " + var1 + " bytes");
         }
      });
   }

   public class01894 N() {
      return this.id;
   }

   @Override
   public class01666<class01638> method_56479() {
      return new class01666<>(this.id);
   }
}
