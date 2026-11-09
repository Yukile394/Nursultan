package minecraft;

import Nursultan.class09405;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public record class00819<T extends Number & Comparable<T>>(Optional<T> min, Optional<T> max) {

   public boolean L() {
      return this.min.isPresent() && this.max.isPresent() && this.min.get().compareTo(this.max.get()) > 0;
   }

   public static <T extends Number & Comparable<T>> class00819<T> L(T var0) {
      return new class00819<>(Optional.empty(), Optional.of((T)var0));
   }

   public Optional<T> M() {
      return this.max;
   }

   public class00819(Optional<T> min, Optional<T> max) {
      this.min = min;
      this.max = max;
   }

   public static <T extends Number & Comparable<T>> class00819<T> i() {
      return new class00819<>(Optional.empty(), Optional.empty());
   }

   public Optional<T> u() {
      Optional optional = this.R();
      Optional optional1 = this.M();
      return optional.equals(optional1) ? optional : Optional.empty();
   }

   private static <T extends Number> Optional<T> y(StringReader var0, Function<String, T> var1, Supplier<DynamicCommandExceptionType> var2) throws CommandSyntaxException {
      int i = var0.getCursor();

      while (var0.canRead() && N(var0)) {
         var0.skip();
      }

      String s = var0.getString().substring(i, var0.getCursor());
      if (s.isEmpty()) {
         return Optional.empty();
      } else {
         try {
            return Optional.of((T)var1.apply(s));
         } catch (NumberFormatException numberformatexception) {
            throw ((DynamicCommandExceptionType)var2.get()).createWithContext(var0, s);
         }
      }
   }

   public static <T extends Number & Comparable<T>> class00819<T> y(T var0) {
      return new class00819<>(Optional.of((T)var0), Optional.empty());
   }

   public DataResult<class00819<T>> y() {
      return this.L() ? DataResult.error(() -> "Swapped bounds in range: " + this.R() + " is higher than " + this.M()) : DataResult.success(this);
   }

   public boolean N() {
      return this.R().isEmpty() && this.M().isEmpty();
   }

   public static <T extends Number & Comparable<T>> class00819<T> N(T var0, T var1) {
      return new class00819<>(Optional.of((T)var0), Optional.of((T)var1));
   }

   public static <T extends Number & Comparable<T>> class00819<T> N(StringReader var0, Function<String, T> var1, Supplier<DynamicCommandExceptionType> var2) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw class00850.N.createWithContext(var0);
      } else {
         int i = var0.getCursor();

         try {
            Optional optional = y(var0, var1, var2);
            Optional optional1;
            if (var0.canRead(2) && var0.peek() == '.' && var0.peek(1) == '.') {
               var0.skip();
               var0.skip();
               optional1 = y(var0, var1, var2);
            } else {
               optional1 = optional;
            }

            if (optional.isEmpty() && optional1.isEmpty()) {
               throw class00850.N.createWithContext(var0);
            } else {
               return new class00819<>(optional, optional1);
            }
         } catch (CommandSyntaxException commandsyntaxexception) {
            var0.setCursor(i);
            throw new CommandSyntaxException(commandsyntaxexception.getType(), commandsyntaxexception.getRawMessage(), commandsyntaxexception.getInput(), i);
         }
      }
   }

   private static boolean N(StringReader var0) {
      char c0 = var0.peek();
      if ((c0 < '0' || c0 > '9') && c0 != '-') {
         return c0 != '.' ? false : !var0.canRead(2) || var0.peek(1) != '.';
      } else {
         return true;
      }
   }

   public static <T extends Number & Comparable<T>> class00819<T> N(T var0) {
      Optional optional = Optional.of(var0);
      return new class00819<>(optional, optional);
   }

   static <T extends Number & Comparable<T>> Codec<class00819<T>> N(Codec<T> var0) {
      return Codec.either(
            RecordCodecBuilder.create(
               var1 -> var1.group(var0.optionalFieldOf("min").forGetter(class00819::R), var0.optionalFieldOf("max").forGetter(class00819::M))
                  .apply(var1, class00819::new)
            ),
            var0
         )
         .xmap(var0x -> (class00819)var0x.map(var0xx -> var0xx, var0xx -> N((T)var0xx)), var0x -> {
            Optional optional = var0x.u();
            return optional.isPresent() ? Either.right((Number)optional.get()) : Either.left(var0x);
         });
   }

   public <U extends Number & Comparable<U>> class00819<U> N_18(Function<T, U> var1) {
      return new class00819<>(this.min.map(var1), this.max.map(var1));
   }

   static <B extends ByteBuf, T extends Number & Comparable<T>> class02362<B, class00819<T>> N(class02362<B, T> var0) {
      return new class09405<>(var0);
   }

   public Optional<T> R() {
      return this.min;
   }
}
