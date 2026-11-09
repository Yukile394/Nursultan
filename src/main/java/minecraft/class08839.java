package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08839(class08895 model, class08906 properties, class00203 registrySwapper) {
   public static final Codec<class08839> N = RecordCodecBuilder.create(
      var0 -> var0.group(class08913.y.fieldOf("model").forGetter(class08839::N), class08906.y.forGetter(class08839::y)).apply(var0, class08839::new)
   );

   @Nullable
   public class00203 L() {
      return this.registrySwapper;
   }

   public class08839(class08895 var1, class08906 var2) {
      this(var1, var2, null);
   }

   public class08839(class08895 model, class08906 properties, @Nullable class00203 registrySwapper) {
      super();
      this.model = model;
      this.properties = properties;
      this.registrySwapper = registrySwapper;
   }

   public class08906 y() {
      return this.properties;
   }

   public class08895 N() {
      return this.model;
   }

   public class08839 N(class00203 var1) {
      return new class08839(this.model, this.properties, var1);
   }
}
