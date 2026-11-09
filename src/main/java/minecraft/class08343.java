package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08343(class05904 woodType, Optional<class01894> texture) implements class00335 {
   public static final MapCodec<class08343> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05904.N.fieldOf("wood_type").forGetter(class08343::y), class01894.N.optionalFieldOf("texture").forGetter(class08343::L))
         .apply(var0, class08343::new)
   );

   public Optional<class01894> L() {
      return this.texture;
   }

   public class08343(class05904 var1) {
      this(var1, Optional.empty());
   }

   public class08343(class05904 woodType, Optional<class01894> texture) {
      super();
      this.woodType = woodType;
      this.texture = texture;
   }

   public class05904 y() {
      return this.woodType;
   }

   @Override
   public MapCodec<class08343> N() {
      return N;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      class06260 class06260 = class03341.N(var1.y(), this.woodType, true);
      class05913 class05913 = this.texture.<class05913>map(class05911.t::N).orElseGet(() -> class05911.N(this.woodType));
      return new class08359(var1.L(), class06260, class05913);
   }
}
