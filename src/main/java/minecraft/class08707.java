package minecraft;

import org.jspecify.annotations.Nullable;

public record class08707(class03678 selectedGameMode, class06826 gameRuleOverwrites, class05946<class04086> flatLevelPreset) {
   @Nullable
   public class05946<class04086> L() {
      return this.flatLevelPreset;
   }

   public class08707(class03678 selectedGameMode, class06826 gameRuleOverwrites, @Nullable class05946<class04086> flatLevelPreset) {
      super();
      this.selectedGameMode = selectedGameMode;
      this.gameRuleOverwrites = gameRuleOverwrites;
      this.flatLevelPreset = flatLevelPreset;
   }

   public class06826 y() {
      return this.gameRuleOverwrites;
   }

   public class03678 N() {
      return this.selectedGameMode;
   }
}
