package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class00413 implements class04439 {
   public static final MapCodec<class00413> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("keybind").forGetter(var0x -> var0x.y)).apply(var0, class00413::new)
   );
   private final String y;
   @Nullable
   private Supplier<class00392> L;

   private class00392 L() {
      if (this.L == null) {
         this.L = class04441.N.apply(this.y);
      }

      return this.L.get();
   }

   public class00413(String var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class00413 class00413 && this.y.equals(class00413.y);
   }

   @Override
   public String toString() {
      return "keybind{" + this.y + "}";
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   public String y() {
      return this.y;
   }

   @Override
   public MapCodec<class00413> N() {
      return N;
   }

   @Override
   public <T> Optional<T> method_27660(class05935<T> var1, class00405 var2) {
      return this.L().N(var1, var2);
   }

   @Override
   public <T> Optional<T> method_27659(class05977<T> var1) {
      return this.L().N_8(var1);
   }
}
