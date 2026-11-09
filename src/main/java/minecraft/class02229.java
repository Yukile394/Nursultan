package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class02229 extends class00955 {
   public class02229(Schema var1) {
      super(var1, false, "JukeboxTicksSinceSongStartedFix", class06962.G, "minecraft:jukebox");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      long i = var1.get("TickCount").asLong(0L) - var1.get("RecordStartTick").asLong(0L);
      Dynamic dynamic = var1.remove("IsPlaying").remove("TickCount").remove("RecordStartTick");
      return i > 0L ? dynamic.set("ticks_since_song_started", var1.createLong(i)) : dynamic;
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
