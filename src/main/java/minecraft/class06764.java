package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;

record class06764(class01894 id, Decoder<? extends Predicate<class06584>> type) {
   public class06764(class03529<class02487<?>> var1) {
      this(var1.B().N(), ((class02487)var1.N()).L().map(var0 -> var0::N));
   }

   class06764(class01894 id, Decoder<? extends Predicate<class06584>> type) {
      super();
      this.id = id;
      this.type = type;
   }

   public Decoder<? extends Predicate<class06584>> y() {
      return this.type;
   }

   public class01894 N() {
      return this.id;
   }

   public Predicate<class06584> N(ImmutableStringReader var1, Dynamic<?> var2) throws CommandSyntaxException {
      return (Predicate<class06584>)this.type.parse(var2).getOrThrow(var2x -> class06793.R.createWithContext(var1, this.id.toString(), var2x));
   }
}
