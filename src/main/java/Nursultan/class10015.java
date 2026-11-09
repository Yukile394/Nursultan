package Nursultan;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class02818;
import org.jspecify.annotations.Nullable;

public record class10015<T>(T value) implements class02818<T> {
   public T L() {
      return this.value;
   }

   public class10015(T value) {
      this.value = (T)value;
   }

   @Override
   public <E extends Throwable> T y(Supplier<E> var1) throws E {
      return this.value;
   }

   @Nullable
   @Override
   public String y() {
      return null;
   }

   @Override
   public T y(@Nullable T var1) {
      return this.value;
   }

   @Override
   public <R> class02818<R> N_11(Function<T, R> var1) {
      return (class02818<R>)(new class10015<>(var1.apply(this.value)));
   }

   @Override
   public boolean N() {
      return true;
   }

   @Override
   public class02818<T> N_36(Consumer<T> var1) {
      var1.accept(this.value);
      return this;
   }
}
