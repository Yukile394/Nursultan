package minecraft;

import Nursultan.class10209;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import net.fabricmc.fabric.mixin.resource.conditions.RegistryOpsAccessor;

public class class03519<T> extends class01278<T> implements RegistryOpsAccessor {
   private final class03542 y;

   public static <E, O> RecordCodecBuilder<O, class02055<E>> L(class05946<? extends class00751<? extends E>> var0) {
      return class06338.N(
            (Function<DynamicOps<?>, DataResult<E>>)(var1 -> var1 instanceof class03519
               ? ((class03519)var1)
                  .y
                  .N(var0)
                  .map(var0xx -> DataResult.success(var0xx.y(), var0xx.L()))
                  .orElseGet(() -> DataResult.error(() -> "Unknown registry: " + var0))
               : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter(var0x -> null);
   }

   private class03519(DynamicOps<T> var1, class03542 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class03519 class03519 = (class03519)var1;
         return this.N.equals(class03519.N) && this.y.equals(class03519.y);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.N.hashCode() * 31 + this.y.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, class03529<E>> u(class05946<E> var0) {
      return class06338.N(
            (Function<DynamicOps<?>, DataResult<E>>)(var2 -> var2 instanceof class03519
               ? ((class03519)var2)
                  .y
                  .N(var0x)
                  .flatMap(var1x -> var1x.y().N(var0))
                  .<DataResult<E>>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Can't find value: " + var0))
               : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter(var0x -> null);
   }

   public <E> Optional<class02055<E>> y(class05946<? extends class00751<? extends E>> var1) {
      return this.y.N(var1).map(class03515::y);
   }

   public <E> Optional<class02042<E>> N(class05946<? extends class00751<? extends E>> var1) {
      return this.y.N(var1).map(class03515::N);
   }

   public <U> class03519<U> N(DynamicOps<U> var1) {
      return (class03519<U>)(var1 == this.N ? this : new class03519(var1, this.y));
   }

   public static <T> Dynamic<T> N(Dynamic<T> var0, class01929 var1) {
      return new Dynamic(var1.N(var0.getOps()), var0.getValue());
   }

   public static <T> class03519<T> N(DynamicOps<T> var0, class03542 var1) {
      return new class03519<>(var0, var1);
   }

   public static <T> class03519<T> N(DynamicOps<T> var0, class01929 var1) {
      return N(var0, new class10209(var1));
   }
}
