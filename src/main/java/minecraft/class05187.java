package minecraft;

record class05187(class04453 player, class03448 level, class03063 levelRenderer, long timeoutAfter) implements class05283 {
   @Override
   public class05283 L() {
      return new class05038(this.player, this.level, this.levelRenderer, this.timeoutAfter);
   }

   class05187(class04453 player, class03448 level, class03063 levelRenderer, long timeoutAfter) {
      this.player = player;
      this.level = level;
      this.levelRenderer = levelRenderer;
      this.timeoutAfter = timeoutAfter;
   }

   public class03063 i() {
      return this.levelRenderer;
   }

   public class03448 u() {
      return this.level;
   }

   public class04453 N() {
      return this.player;
   }

   public long R() {
      return this.timeoutAfter;
   }
}
