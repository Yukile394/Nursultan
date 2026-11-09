package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;
import java.util.UUID;

public record class06425(
   class00392 name,
   boolean visible,
   int value,
   int max,
   class06685 color,
   class06702 overlay,
   boolean darkenScreen,
   boolean playBossMusic,
   boolean createWorldFog,
   Set<UUID> players
) {
   public static final Codec<class06425> U = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03748.N.fieldOf("Name").forGetter(class06425::N),
            Codec.BOOL.optionalFieldOf("Visible", false).forGetter(class06425::y),
            Codec.INT.optionalFieldOf("Value", 0).forGetter(class06425::L),
            Codec.INT.optionalFieldOf("Max", 100).forGetter(class06425::u),
            class06685.field_56628.optionalFieldOf("Color", class06685.field_5786).forGetter(class06425::i),
            class06702.field_56629.optionalFieldOf("Overlay", class06702.field_5795).forGetter(class06425::R),
            Codec.BOOL.optionalFieldOf("DarkenScreen", false).forGetter(class06425::M),
            Codec.BOOL.optionalFieldOf("PlayBossMusic", false).forGetter(class06425::B),
            Codec.BOOL.optionalFieldOf("CreateWorldFog", false).forGetter(class06425::Z),
            class01487.y.optionalFieldOf("Players", Set.of()).forGetter(class06425::z)
         )
         .apply(var0, class06425::new)
   );

   public int L() {
      return this.value;
   }

   public boolean M() {
      return this.darkenScreen;
   }

   public class06425(
      class00392 name,
      boolean visible,
      int value,
      int max,
      class06685 color,
      class06702 overlay,
      boolean darkenScreen,
      boolean playBossMusic,
      boolean createWorldFog,
      Set<UUID> players
   ) {
      super();
      this.name = name;
      this.visible = visible;
      this.value = value;
      this.max = max;
      this.color = color;
      this.overlay = overlay;
      this.darkenScreen = darkenScreen;
      this.playBossMusic = playBossMusic;
      this.createWorldFog = createWorldFog;
      this.players = players;
   }

   public boolean B() {
      return this.playBossMusic;
   }

   public boolean Z() {
      return this.createWorldFog;
   }

   public class06685 i() {
      return this.color;
   }

   public Set<UUID> z() {
      return this.players;
   }

   public int u() {
      return this.max;
   }

   public boolean y() {
      return this.visible;
   }

   public class00392 N() {
      return this.name;
   }

   public class06702 R() {
      return this.overlay;
   }
}
