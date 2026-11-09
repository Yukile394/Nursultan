package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record class02204<T>(Either<class03556<T>, class05946<T>> contents) {
   public class02204(class03556<T> var1) {
      this(Either.left(var1));
   }

   public class02204(Either<class03556<T>, class05946<T>> contents) {
      super();
      this.contents = contents;
   }

   public class02204(class05946<T> var1) {
      this(Either.right(var1));
   }

   public Either<class03556<T>, class05946<T>> y() {
      return this.contents;
   }

   public static <T> Codec<class02204<T>> N(class05946<class00751<T>> var0, Codec<class03556<T>> var1) {
      return Codec.either(var1, class05946.N(var0).comapFlatMap(var0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(class02204::new, class02204::y);
   }

   public Optional<class05946<T>> N() {
      return (Optional<class05946<T>>)this.contents.map(class03556::i, Optional::of);
   }

   public Optional<T> N(class00751<T> var1) {
      return (Optional<T>)this.contents.map(var0 -> Optional.of(var0.N()), var1::M);
   }

   public static <T> class02362<class04247, class02204<T>> N(class05946<class00751<T>> var0, class02362<class04247, class03556<T>> var1) {
      return class02362.N(class02389.N(var1, class05946.y(var0)), class02204::y, class02204::new);
   }

   public Optional<class03556<T>> N(class01929 var1) {
      return (Optional<class03556<T>>)this.contents.map(Optional::of, var1x -> var1.u(var1x).map(var0x -> (class03556)var0x));
   }
}
