package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02945(
   Optional<class02648<class02826<class00392>, class02920>> pages,
   Optional<String> author,
   Optional<String> title,
   class00836 generation,
   Optional<Boolean> resolved
) implements class02465<class02706> {
   public static final Codec<class02945> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class02648.N(class02920.N).optionalFieldOf("pages").forGetter(class02945::N),
            Codec.STRING.optionalFieldOf("author").forGetter(class02945::L),
            Codec.STRING.optionalFieldOf("title").forGetter(class02945::u),
            class00836.u.optionalFieldOf("generation", class00836.L).forGetter(class02945::i),
            Codec.BOOL.optionalFieldOf("resolved").forGetter(class02945::R)
         )
         .apply(var0, class02945::new)
   );

   public Optional<String> L() {
      return this.author;
   }

   public class02945(
      Optional<class02648<class02826<class00392>, class02920>> pages,
      Optional<String> author,
      Optional<String> title,
      class00836 generation,
      Optional<Boolean> resolved
   ) {
      super();
      this.pages = pages;
      this.author = author;
      this.title = title;
      this.generation = generation;
      this.resolved = resolved;
   }

   public class00836 i() {
      return this.generation;
   }

   public Optional<String> u() {
      return this.title;
   }

   @Override
   public class02477<class02706> y() {
      return class02484.NL;
   }

   public boolean N(class02706 var1) {
      if (this.author.isPresent() && !this.author.get().equals(var1.i())) {
         return false;
      } else if (this.title.isPresent() && !this.title.get().equals(var1.u().N())) {
         return false;
      } else if (!this.generation.u(var1.R())) {
         return false;
      } else {
         return this.resolved.isPresent() && this.resolved.get() != var1.M()
            ? false
            : !this.pages.isPresent() || this.pages.get().test((Iterable<class02826<class00392>>)var1.N());
      }
   }

   public Optional<class02648<class02826<class00392>, class02920>> N() {
      return this.pages;
   }

   public Optional<Boolean> R() {
      return this.resolved;
   }
}
