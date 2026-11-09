package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00493(
   String name, class06675 criteria, class00392 displayName, class06640 renderType, boolean displayAutoUpdate, Optional<class01762> numberFormat
) {
   public static final Codec<class00493> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.fieldOf("Name").forGetter(class00493::N),
            class06675.N.optionalFieldOf("CriteriaName", class06675.y).forGetter(class00493::y),
            class03748.N.fieldOf("DisplayName").forGetter(class00493::L),
            class06640.field_41683.optionalFieldOf("RenderType", class06640.field_1472).forGetter(class00493::u),
            Codec.BOOL.optionalFieldOf("display_auto_update", false).forGetter(class00493::i),
            class01787.y.optionalFieldOf("format").forGetter(class00493::R)
         )
         .apply(var0, class00493::new)
   );

   public class00392 L() {
      return this.displayName;
   }

   public class00493(
      String name, class06675 criteria, class00392 displayName, class06640 renderType, boolean displayAutoUpdate, Optional<class01762> numberFormat
   ) {
      super();
      this.name = name;
      this.criteria = criteria;
      this.displayName = displayName;
      this.renderType = renderType;
      this.displayAutoUpdate = displayAutoUpdate;
      this.numberFormat = numberFormat;
   }

   public boolean i() {
      return this.displayAutoUpdate;
   }

   public class06640 u() {
      return this.renderType;
   }

   public class06675 y() {
      return this.criteria;
   }

   public String N() {
      return this.name;
   }

   public Optional<class01762> R() {
      return this.numberFormat;
   }
}
