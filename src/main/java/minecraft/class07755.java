package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public class class07755<T> {
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("argument.nbt.expected.compound"));
   public static final char L = ',';
   public static final char u = ':';
   private static final class07755<class07709> M = N(class07713.N);
   public static final Codec<class07001> i = Codec.STRING
      .comapFlatMap(
         var0 -> {
            try {
               class07709 class07709 = M.y(var0);
               return class07709 instanceof class07001
                  ? DataResult.success((class07001)class07709, Lifecycle.stable())
                  : DataResult.error(() -> "Expected compound tag, got " + class07709);
            } catch (CommandSyntaxException commandsyntaxexception) {
               return DataResult.error(commandsyntaxexception::getMessage);
            }
         },
         class07001::toString
      );
   public static final Codec<class07001> R = Codec.withAlternative(i, class07001.N);
   private final DynamicOps<T> B;
   private final class02169<T> Z;

   public static class07001 L(StringReader var0) throws CommandSyntaxException {
      class07709 class07709 = M.y(var0);
      return N(var0, class07709);
   }

   private class07755(DynamicOps<T> var1, class02169<T> var2) {
      super();
      this.B = var1;
      this.Z = var2;
   }

   public T y(String var1) throws CommandSyntaxException {
      return this.N(new StringReader(var1));
   }

   public T y(StringReader var1) throws CommandSyntaxException {
      return this.Z.N(var1);
   }

   public DynamicOps<T> N() {
      return this.B;
   }

   public T N(StringReader var1) throws CommandSyntaxException {
      Object object = this.Z.N(var1);
      var1.skipWhitespace();
      if (var1.canRead()) {
         throw N.createWithContext(var1);
      } else {
         return (T)object;
      }
   }

   public static <T> class07755<T> N(DynamicOps<T> var0) {
      return new class07755<>(var0, class08876.N(var0));
   }

   private static class07001 N(StringReader var0, class07709 var1) throws CommandSyntaxException {
      if (var1 instanceof class07001) {
         return (class07001)var1;
      } else {
         throw y.createWithContext(var0);
      }
   }

   public static class07001 N(String var0) throws CommandSyntaxException {
      StringReader stringreader = new StringReader(var0);
      return N(stringreader, M.N(stringreader));
   }
}
