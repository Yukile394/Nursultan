package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.function.Predicate;

record class06797(class01894 id, Predicate<class06584> presenceChecker, Decoder<? extends Predicate<class06584>> valueChecker) {

   public Decoder<? extends Predicate<class06584>> L() {
      return this.valueChecker;
   }

   class06797(class01894 id, Predicate<class06584> presenceChecker, Decoder<? extends Predicate<class06584>> valueChecker) {
      super();
      this.id = id;
      this.presenceChecker = presenceChecker;
      this.valueChecker = valueChecker;
   }

   public Predicate<class06584> y() {
      return this.presenceChecker;
   }

   public class01894 N() {
      return this.id;
   }

   public Predicate<class06584> N(ImmutableStringReader var1, Dynamic<?> var2) throws CommandSyntaxException {
      return (Predicate<class06584>)this.valueChecker.parse(var2).getOrThrow(var2x -> class06793.u.createWithContext(var1, this.id.toString(), var2x));
   }

   public static <T> class06797 N(ImmutableStringReader var0, class01894 var1, class02477<T> var2) throws CommandSyntaxException {
      Codec codec = var2.y();
      if (codec == null) {
         throw class06793.L.createWithContext(var0, var1);
      } else {
         return new class06797(var1, var1x -> var1x.L(var2), codec.map(var1x -> var2x -> {
            Object object = var2x.method_58694(var2);
            return Objects.equals(var1x, object);
         }));
      }
   }
}
