package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02939(Optional<class02648<class02826<String>, class02916>> pages) implements class02465<class02699> {
   public static final Codec<class02939> N = RecordCodecBuilder.create(
      var0 -> var0.group(class02648.N(class02916.N).optionalFieldOf("pages").forGetter(class02939::N)).apply(var0, class02939::new)
   );

   public class02939(Optional<class02648<class02826<String>, class02916>> pages) {
      this.pages = pages;
   }

   @Override
   public class02477<class02699> y() {
      return class02484.Ny;
   }

   public boolean N(class02699 var1) {
      return !this.pages.isPresent() || this.pages.get().test((Iterable<class02826<String>>)var1.N());
   }

   public Optional<class02648<class02826<String>, class02916>> N() {
      return this.pages;
   }
}
