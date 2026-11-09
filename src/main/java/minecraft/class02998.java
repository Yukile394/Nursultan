package minecraft;

import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;

public record class02998<T>(int id, class04383<T> serializer, T value) {

   public T L() {
      return this.value;
   }

   public class02998(int id, class04383<T> serializer, T value) {
      super();
      this.id = id;
      this.serializer = serializer;
      this.value = (T)value;
   }

   public class04383<T> y() {
      return this.serializer;
   }

   public void N(class04247 var1) {
      int i = class02154.y(this.serializer);
      if (i < 0) {
         throw new EncoderException("Unknown serializer type " + this.serializer);
      } else {
         var1.writeByte(this.id);
         var1.L(i);
         this.serializer.codec().encode(var1, this.value);
      }
   }

   public int N() {
      return this.id;
   }

   public static class02998<?> N(class04247 var0, int var1) {
      int i = var0.E();
      class04383<?> class04383 = class02154.N(i);
      if (class04383 == null) {
         throw new DecoderException("Unknown serializer type " + i);
      } else {
         return N(var0, var1, class04383);
      }
   }

   private static <T> class02998<T> N(class04247 var0, int var1, class04383<T> var2) {
      return new class02998<>(var1, var2, (T)var2.codec().decode(var0));
   }

   public static <T> class02998<T> N(class02131<T> var0, T var1) {
      class04383 class04383 = var0.y();
      return new class02998<>(var0.N(), class04383, (T)class04383.method_12714(var1));
   }
}
