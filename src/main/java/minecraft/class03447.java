package minecraft;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class class03447<T> {
   private final T y;
   private final BiConsumer<Consumer<String>, T> L;
   public static final class03447<?> N = new class03447<>(class06244.field_17274, (var0, var1) -> {});

   private class03447(T var1, BiConsumer<Consumer<String>, T> var2) {
      super();
      this.y = (T)var1;
      this.L = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class03447 class03447) ? false : class03447.L == this.L && class03447.y.equals(this.y);
      }
   }

   @Override
   public int hashCode() {
      int i = this.y.hashCode();
      return 31 * i + this.L.hashCode();
   }

   public static class03447<?> N(class00392 var0) {
      return new class03447<>(var0, (var0x, var1) -> var0x.accept(var1.getString()));
   }

   public static class03447<?> N(List<class00392> var0) {
      return new class03447<>(var0, (var1, var2) -> var0.stream().map(class00392::getString).forEach(var1));
   }

   public static class03447<?> N(String var0) {
      return new class03447<>(var0, Consumer::accept);
   }

   public void N(Consumer<String> var1) {
      this.L.accept(var1, this.y);
   }
}
