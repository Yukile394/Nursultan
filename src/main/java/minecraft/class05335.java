package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;

record class05335(Optional<class05679> profile, Optional<Map<class01894, class06276>> custom) {
   private static final Codec<Map<class01894, class06276>> u = Codec.unboundedMap(class01894.N, class06276.field_61596);
   public static final Codec<class05335> N = RecordCodecBuilder.create(
      var0 -> var0.group(class05679.field_61601.optionalFieldOf("profile").forGetter(class05335::N), u.optionalFieldOf("custom").forGetter(class05335::y))
         .apply(var0, class05335::new)
   );

   class05335(Optional<class05679> profile, Optional<Map<class01894, class06276>> custom) {
      this.profile = profile;
      this.custom = custom;
   }

   public Optional<Map<class01894, class06276>> y() {
      return this.custom;
   }

   public Optional<class05679> N() {
      return this.profile;
   }
}
