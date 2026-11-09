package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record class00223<T>(class02477<T> componentType) implements class00372<T> {
   private static final class00336<? extends class00223<?>, ?> y = i();

   public static <T> class00336<class00223<T>, T> L() {
      return (class00336<class00223<T>, T>)y;
   }

   public class00223(class02477<T> componentType) {
      super();
      this.componentType = componentType;
   }

   private static <T> class00336<class00223<T>, T> i() {
      MapCodec mapcodec = class04206.NW
         .T()
         .validate(var0 -> var0.u() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success(var0))
         .dispatchMap(
            "component",
            var0 -> ((class00223)var0.N()).componentType,
            var0 -> class00336.N(var0.L()).xmap(var1 -> new class08938<>(new class00223(var0), var1), class08938::y)
         );
      return new class00336<>(mapcodec);
   }

   public class02477<T> u() {
      return this.componentType;
   }

   @Nullable
   @Override
   public T y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var1.method_58694(this.componentType);
   }

   @Override
   public Codec<T> y() {
      return this.componentType.L();
   }

   @Override
   public class00336<class00223<T>, T> N() {
      return L();
   }
}
