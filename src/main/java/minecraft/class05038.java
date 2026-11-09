package minecraft;

record class05038(class04453 player, class03448 level, class03063 levelRenderer, long timeoutAfter) implements class05283 {
   private boolean M() {
      if (class07536.L() > this.timeoutAfter) {
         class05384.N.warn("Timed out while waiting for the client to load chunks, letting the player into the world anyway");
         return true;
      } else {
         class04453 class04453 = this.player;
         class07209 class07209 = this.N(class04453);
         return !this.level.method_31601(class07209.method_10264()) && !this.player.method_7325() && this.player.method_5805()
            ? this.levelRenderer.N(class07209)
            : true;
      }
   }

   class05038(class04453 player, class03448 level, class03063 levelRenderer, long timeoutAfter) {
      super();
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

   @Override
   public class05283 y() {
      return (class05283)(this.M() ? new class01331(class07536.L()) : this);
   }

   private class07209 N(class04453 var1) {
      return class07209.method_49637(var1.method_23317(), var1.method_23320(), var1.method_23321());
   }

   public class04453 N() {
      return this.player;
   }

   public long R() {
      return this.timeoutAfter;
   }
}
