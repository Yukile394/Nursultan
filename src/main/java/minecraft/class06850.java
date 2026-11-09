package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public final class class06850<R> {
   private final class06333<String, class06841<R>> N = new class06333<>();

   public class06850<R> L(Function<? super class07491<? extends class06584>, ? extends class06841<R>> var1) {
      return this.N(class05915.values(), var1x -> (class06841<R>)var1.apply(var1x.N()));
   }

   class06850() {
      super();
   }

   public class06850<R> y(Function<? super class07491<? extends class00394>, ? extends class06841<R>> var1) {
      return this.N(class05887.values(), var1x -> (class06841<R>)var1.apply(var1x.N()));
   }

   Codec<class06841<R>> N() {
      return this.N.N(Codec.STRING);
   }

   public <T extends class05033> class06850<R> N(T[] var1, Function<T, ? extends class06841<R>> var2) {
      return this.N(var1, class05033::method_15434, var2);
   }

   public <T extends class05033 & class06841<? extends R>> class06850<R> N(T[] var1) {
      return this.N(var1, var0 -> class06841.N((class06841<? extends R>)var0));
   }

   public class06850<R> N(Function<? super class07491<? extends class07049>, ? extends class06841<R>> var1) {
      return this.N(class05919.values(), var1x -> (class06841<R>)var1.apply(var1x.N()));
   }

   public <T> class06850<R> N(T[] var1, Function<T, String> var2, Function<T, ? extends class06841<R>> var3) {
      for (Object object : var1) {
         this.N.N((String)var2.apply(object), (class06841<R>)var3.apply(object));
      }

      return this;
   }
}
