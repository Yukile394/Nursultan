package minecraft;

import org.jspecify.annotations.Nullable;

record class05019(class00392 name, int score, class00392 formattedScore, int scoreWidth) {

   @Nullable
   public class00392 L() {
      return this.formattedScore;
   }

   class05019(class00392 name, int score, @Nullable class00392 formattedScore, int scoreWidth) {
      this.name = name;
      this.score = score;
      this.formattedScore = formattedScore;
      this.scoreWidth = scoreWidth;
   }

   public int u() {
      return this.scoreWidth;
   }

   public int y() {
      return this.score;
   }

   public class00392 N() {
      return this.name;
   }
}
