package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class09013(class06584 item, Optional<class09022> description, boolean showDecorations, boolean showTooltip, int width, int height)
   implements class09034 {
   public static final MapCodec<class09013> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06584.u.fieldOf("item").forGetter(class09013::y),
            class09022.i.optionalFieldOf("description").forGetter(class09013::L),
            Codec.BOOL.optionalFieldOf("show_decorations", true).forGetter(class09013::u),
            Codec.BOOL.optionalFieldOf("show_tooltip", true).forGetter(class09013::i),
            class06338.N(1, 256).optionalFieldOf("width", 16).forGetter(class09013::R),
            class06338.N(1, 256).optionalFieldOf("height", 16).forGetter(class09013::M)
         )
         .apply(var0, class09013::new)
   );

   public Optional<class09022> L() {
      return this.description;
   }

   public int M() {
      return this.height;
   }

   public class09013(class06584 item, Optional<class09022> description, boolean showDecorations, boolean showTooltip, int width, int height) {
      super();
      this.item = item;
      this.description = description;
      this.showDecorations = showDecorations;
      this.showTooltip = showTooltip;
      this.width = width;
      this.height = height;
   }

   public boolean i() {
      return this.showTooltip;
   }

   public boolean u() {
      return this.showDecorations;
   }

   public class06584 y() {
      return this.item;
   }

   @Override
   public MapCodec<class09013> N() {
      return L;
   }

   public int R() {
      return this.width;
   }
}
