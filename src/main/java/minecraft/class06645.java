package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;

public record class06645(List<class00493> objectives, List<class06679> scores, Map<class01890, String> displaySlots, List<class00497> teams) {
   public static final class06645 N = new class06645(List.of(), List.of(), Map.of(), List.of());
   public static final Codec<class06645> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00493.N.listOf().optionalFieldOf("Objectives", List.of()).forGetter(class06645::N),
            class06679.u.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(class06645::y),
            Codec.unboundedMap(class01890.field_45175, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(class06645::L),
            class00497.N.listOf().optionalFieldOf("Teams", List.of()).forGetter(class06645::u)
         )
         .apply(var0, class06645::new)
   );

   public Map<class01890, String> L() {
      return this.displaySlots;
   }

   public class06645(List<class00493> objectives, List<class06679> scores, Map<class01890, String> displaySlots, List<class00497> teams) {
      this.objectives = objectives;
      this.scores = scores;
      this.displaySlots = displaySlots;
      this.teams = teams;
   }

   public List<class00497> u() {
      return this.teams;
   }

   public List<class06679> y() {
      return this.scores;
   }

   public List<class00493> N() {
      return this.objectives;
   }
}
