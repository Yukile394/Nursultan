package minecraft;

import Nursultan.class09389;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.fabricmc.fabric.api.event.registry.FabricRegistry;
import net.fabricmc.fabric.mixin.registry.sync.RegistryMixin;
import org.jspecify.annotations.Nullable;

public interface class00751<T> extends class00750<T>, class01921<T>, Keyable, FabricRegistry, RegistryMixin {
   @Nullable
   T L(@Nullable class05946<T> var1);

   Optional<class03529<T>> L(class01894 var1);

   Optional<class03529<T>> L(int var1);

   Set<class01894> M();

   default Optional<T> M(@Nullable class05946<T> var1) {
      return Optional.ofNullable(this.L(var1));
   }

   default Codec<T> T() {
      return this.y().flatComapMap(class03529::N, var1 -> this.N(this.i((T)var1)));
   }

   Set<class05946<T>> B();

   default T B(class05946<T> var1) {
      Object object = this.L(var1);
      if (object == null) {
         throw new IllegalStateException("Missing key in " + this.i() + ": " + var1);
      } else {
         return (T)object;
      }
   }

   Set<Entry<class05946<T>, T>> Z();

   @Override
   class05946<? extends class00751<T>> i();

   class03556<T> i(T var1);

   Optional<class02819> i(class05946<T> var1);

   default Codec<class03556<T>> b() {
      return this.y().flatComapMap(var0 -> var0, this::N);
   }

   default class00750<class03556<T>> v() {
      return new class09389<>(this);
   }

   default Stream<T> j() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   Stream<class03552<T>> U();

   default <U> Stream<U> keys(DynamicOps<U> var1) {
      return this.M().stream().map(var1x -> (U)var1.createString(var1x.toString()));
   }

   Optional<class05946<T>> u(T var1);

   default Iterable<class03556<T>> u(class03530<T> var1) {
      return (Iterable<class03556<T>>)DataFixUtils.orElse(this.N(var1), List.of());
   }

   boolean u(class01894 var1);

   static <R, T extends R> class03529<T> y(class00751<R> var0, class01894 var1, T var2) {
      return y(var0, class05946.N(var0.i(), var1), (T)var2);
   }

   default Optional<T> y(@Nullable class01894 var1) {
      return Optional.ofNullable(this.N(var1));
   }

   @Nullable
   class01894 y(T var1);

   private Codec<class03529<T>> y() {
      return class06338.N(
         class01894.N
            .comapFlatMap(
               var1 -> this.L(var1)
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.i() + ": " + var1)),
               var0 -> var0.B().N()
            ),
         (Function<class03529<T>, Lifecycle>)(var1 -> this.i(var1.B()).map(class02819::y).orElse(Lifecycle.experimental()))
      );
   }

   static <R, T extends R> class03529<T> y(class00751<R> var0, class05946<R> var1, T var2) {
      return (class03529<T>)((class07099)var0).N(var1, var2, class02819.N);
   }

   static <T> T N(class00751<? super T> var0, String var1, T var2) {
      return N(var0, class01894.N(var1), (T)var2);
   }

   class00720<T> N(class01196<T> var1);

   private DataResult<class03529<T>> N(class03556<T> var1) {
      return var1 instanceof class03529 ? DataResult.success(var1) : DataResult.error(() -> "Unregistered holder in " + this.i() + ": " + var1);
   }

   static <V, T extends V> T N(class00751<V> var0, class01894 var1, T var2) {
      return N(var0, class05946.N(var0.i(), var1), (T)var2);
   }

   @Override
   int N(@Nullable T var1);

   Optional<class03529<T>> N(class06069 var1);

   @Nullable
   T N(@Nullable class01894 var1);

   Optional<class03529<T>> N();

   static <V, T extends V> T N(class00751<V> var0, class05946<V> var1, T var2) {
      ((class07099)var0).N(var1, var2, class02819.N);
      return (T)var2;
   }

   class00751<T> W();

   class03529<T> R(T var1);

   boolean R(class05946<T> var1);
}
