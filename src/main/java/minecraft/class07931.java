package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class07931<Params, Result>(String description, Optional<class07920<Params>> params, Optional<class07941<Result>> result) {
   public Optional<class07920<Params>> L() {
      return this.params;
   }

   public class07931(String var1, @Nullable class07920<Params> var2, @Nullable class07941<Result> var3) {
      this(var1, Optional.ofNullable(var2), Optional.ofNullable(var3));
   }

   public class07931(String description, Optional<class07920<Params>> params, Optional<class07941<Result>> result) {
      super();
      this.description = description;
      this.params = params;
      this.result = result;
   }

   private static <Params> Codec<Optional<class07920<Params>>> i() {
      return class07920.N().codec().listOf().xmap(class07931::N, class07931::N);
   }

   public Optional<class07941<Result>> u() {
      return this.result;
   }

   public String y() {
      return this.description;
   }

   private static <Params> Optional<class07920<Params>> N(List<class07920<Params>> var0) {
      return var0.isEmpty() ? Optional.empty() : Optional.of(var0.getFirst());
   }

   private static <Params> List<class07920<Params>> N(Optional<class07920<Params>> var0) {
      return var0.isPresent() ? List.of(var0.get()) : List.of();
   }

   public class07905<Params, Result> N(class01894 var1) {
      return new class07905<>(var1, this);
   }

   static <Params, Result> MapCodec<class07931<Params, Result>> N() {
      return RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               Codec.STRING.fieldOf("description").forGetter(class07931::y),
               i().fieldOf("params").forGetter(class07931::L),
               class07941.N().optionalFieldOf("result").forGetter(class07931::u)
            )
            .apply(var0, class07931::new)
      );
   }
}
