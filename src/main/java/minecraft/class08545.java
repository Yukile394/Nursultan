package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08545<T>(T model, class06953 asset) {
   public class08545(T var1, class01894 var2) {
      this((T)var1, new class06953(var2));
   }

   public class08545(T model, class06953 asset) {
      this.model = (T)model;
      this.asset = asset;
   }

   public class06953 y() {
      return this.asset;
   }

   public T N() {
      return this.model;
   }

   public static <T> MapCodec<class08545<T>> N(Codec<T> var0, T var1) {
      return RecordCodecBuilder.mapCodec(
         var2 -> var2.group(var0.optionalFieldOf("model", var1).forGetter(class08545::N), class06953.y.forGetter(class08545::y)).apply(var2, class08545::new)
      );
   }

   public static <T> class02362<class04247, class08545<T>> N(class02362<? super class04247, T> var0) {
      return class02362.N(var0, class08545::N, class06953.L, class08545::y, class08545::new);
   }
}
