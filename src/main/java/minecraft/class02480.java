package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Map.Entry;

public record class02480<T>(class02477<T> type, T value) {
   public static final class02362<class04247, class02480<?>> N = new class02464();

   public class02480(class02477<T> type, T value) {
      this.type = type;
      this.value = (T)value;
   }

   @Override
   public String toString() {
      return this.type + "=>" + this.value;
   }

   public T y() {
      return this.value;
   }

   public static <T> class02480<T> N(class02477<T> var0, Object var1) {
      return new class02480<>(var0, (T)var1);
   }

   public static class02480<?> N(Entry<class02477<?>, Object> var0) {
      return N((class02477<T>)var0.getKey(), var0.getValue());
   }

   public void N(class02509 var1) {
      var1.y(this.type, this.value);
   }

   public class02477<T> N() {
      return this.type;
   }

   public <D> DataResult<D> N(DynamicOps<D> var1) {
      Codec codec = this.type.y();
      return codec == null ? DataResult.error(() -> "Component of type " + this.type + " is not encodable") : codec.encodeStart(var1, this.value);
   }
}
