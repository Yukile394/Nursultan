package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.time.Instant;

record class03327(class03342 quickPlayWorld, Instant lastPlayedTime, class07282 gamemode) {
   public static final Codec<class03327> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03342.N.forGetter(class03327::N),
            class06338.l.fieldOf("lastPlayedTime").forGetter(class03327::y),
            class07282.field_41676.fieldOf("gamemode").forGetter(class03327::L)
         )
         .apply(var0, class03327::new)
   );

   public class07282 L() {
      return this.gamemode;
   }

   class03327(class03342 quickPlayWorld, Instant lastPlayedTime, class07282 gamemode) {
      super();
      this.quickPlayWorld = quickPlayWorld;
      this.lastPlayedTime = lastPlayedTime;
      this.gamemode = gamemode;
   }

   public Instant y() {
      return this.lastPlayedTime;
   }

   public class03342 N() {
      return this.quickPlayWorld;
   }
}
