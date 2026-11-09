package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08595(
   Optional<class05946<class00201>> test, class00753 size, class06993 rotation, boolean ignoreEntities, class08625 status, Optional<class00392> errorMessage
) {
   public static final Codec<class08595> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class05946.N(class04227.yt).optionalFieldOf("test").forGetter(class08595::N),
            class00753.field_25123.fieldOf("size").forGetter(class08595::y),
            class06993.field_39313.fieldOf("rotation").forGetter(class08595::L),
            Codec.BOOL.fieldOf("ignore_entities").forGetter(class08595::u),
            class08625.field_56017.fieldOf("status").forGetter(class08595::i),
            class03748.N.optionalFieldOf("error_message").forGetter(class08595::R)
         )
         .apply(var0, class08595::new)
   );
   public static final class02362<class04247, class08595> y = class02362.N(
      class02389.N(class05946.y(class04227.yt)),
      class08595::N,
      class00753.field_56131,
      class08595::y,
      class06993.field_55987,
      class08595::L,
      class02389.y,
      class08595::u,
      class08625.field_56018,
      class08595::i,
      class02389.N(class03748.y),
      class08595::R,
      class08595::new
   );

   public class06993 L() {
      return this.rotation;
   }

   public class08595(
      Optional<class05946<class00201>> test, class00753 size, class06993 rotation, boolean ignoreEntities, class08625 status, Optional<class00392> errorMessage
   ) {
      this.test = test;
      this.size = size;
      this.rotation = rotation;
      this.ignoreEntities = ignoreEntities;
      this.status = status;
      this.errorMessage = errorMessage;
   }

   public class08625 i() {
      return this.status;
   }

   public boolean u() {
      return this.ignoreEntities;
   }

   public class00753 y() {
      return this.size;
   }

   public Optional<class05946<class00201>> N() {
      return this.test;
   }

   public class08595 N(class00392 var1) {
      return new class08595(this.test, this.size, this.rotation, this.ignoreEntities, class08625.field_56016, Optional.of(var1));
   }

   public class08595 N(class08625 var1) {
      return new class08595(this.test, this.size, this.rotation, this.ignoreEntities, var1, Optional.empty());
   }

   public class08595 N(class00753 var1) {
      return new class08595(this.test, var1, this.rotation, this.ignoreEntities, this.status, this.errorMessage);
   }

   public Optional<class00392> R() {
      return this.errorMessage;
   }
}
